package com.sk0ne.framedlift.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class LiftRecipeProvider implements DataProvider {

    private static final ResourceLocation SAIL =
            ResourceLocation.fromNamespaceAndPath("create", "white_sail");
    private static final ResourceLocation FRAMED_CUBE =
            ResourceLocation.fromNamespaceAndPath("framedblocks", "framed_cube");

    private final PackOutput output;

    public LiftRecipeProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput ignored) {
        try {
            Item sail = BuiltInRegistries.ITEM.get(SAIL);
            Item framedCube = BuiltInRegistries.ITEM.get(FRAMED_CUBE);

            if (sail == Items.AIR || framedCube == Items.AIR) {
                FramedLiftMod.LOGGER.error("Не найдены ингредиенты: {} или {}. Рецепты не сгенерированы.",
                        SAIL, FRAMED_CUBE);
                return CompletableFuture.completedFuture(null);
            }

            for (DeferredHolder<Block, ? extends Block> block : ModBlocks.BLOCKS.getEntries()) {
                String name = block.getId().getPath();

                JsonObject keySail = new JsonObject();
                keySail.addProperty("item", "create:white_sail");

                JsonObject keyBase = new JsonObject();
                keyBase.addProperty("item", "framedblocks:framed_cube");

                JsonObject key = new JsonObject();
                key.add("S", keySail);
                key.add("F", keyBase);

                JsonObject result = new JsonObject();
                result.addProperty("id", FramedLiftMod.MOD_ID + ":" + name);
                result.addProperty("count", 1);

                JsonObject root = new JsonObject();
                root.addProperty("type", "minecraft:crafting_shaped");
                root.addProperty("category", "misc");
                root.add("key", key);
                root.add("result", result);

                JsonArray pattern = new JsonArray();
                pattern.add("S");
                pattern.add("F");
                root.add("pattern", pattern);

                Path target = output.getOutputFolder(PackOutput.Target.DATA_PACK)
                        .resolve(FramedLiftMod.MOD_ID).resolve("recipe").resolve(name + ".json");
                Files.createDirectories(target.getParent());
                Files.write(target, root.toString().getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            throw new RuntimeException("Ошибка генерации рецептов", e);
        }
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public String getName() {
        return "FramedLift Recipes";
    }
}
