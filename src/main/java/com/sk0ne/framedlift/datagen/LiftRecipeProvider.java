package com.sk0ne.framedlift.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModBlocks;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class LiftRecipeProvider implements DataProvider {

    private final PackOutput output;

    public LiftRecipeProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput ignored) {
        try {
            for (DeferredHolder<Block, ? extends Block> block : ModBlocks.BLOCKS.getEntries()) {
                String name = block.getId().getPath();

                JsonObject keySail = new JsonObject();
                keySail.addProperty("item", "create:white_sail");

                JsonObject keyBase = new JsonObject();
                keyBase.addProperty("item", "framedblocks:framed_cube");

                JsonObject key = new JsonObject();
                key.add("S", keySail);
                key.add("F", keyBase);

                JsonArray pattern = new JsonArray();
                pattern.add("S");
                pattern.add("F");

                JsonObject result = new JsonObject();
                result.addProperty("id", FramedLiftMod.MOD_ID + ":" + name);
                result.addProperty("count", 1);

                JsonObject root = new JsonObject();
                root.addProperty("type", "minecraft:crafting_shaped");
                root.addProperty("category", "misc");
                root.add("pattern", pattern);
                root.add("key", key);
                root.add("result", result);

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
