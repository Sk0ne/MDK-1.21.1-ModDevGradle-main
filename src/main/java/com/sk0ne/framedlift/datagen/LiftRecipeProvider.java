package com.sk0ne.framedlift.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModBlocks;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

/**
 * Рецепты: парус Create + оригинальный framed-блок -> лифт-копия.
 * Имя оригинала получается отсечением префикса "lift_".
 */
public class LiftRecipeProvider implements DataProvider {

    public static final String SAIL_ITEM = "create:white_sail";

    private final PackOutput output;

    public LiftRecipeProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput ignored) {
        try {
            for (DeferredBlock<Block> block : ModBlocks.BLOCKS.getEntries()) {
                String name = block.getId().getPath();
                String originalId = name.replaceFirst("^lift_", "");

                JsonObject root = new JsonObject();
                root.addProperty("type", "minecraft:crafting_shapeless");
                root.addProperty("category", "building");

                JsonArray ingredients = new JsonArray();
                JsonObject sail = new JsonObject();
                sail.addProperty("item", SAIL_ITEM);
                ingredients.add(sail);
                JsonObject base = new JsonObject();
                base.addProperty("item", "framedblocks:" + originalId);
                ingredients.add(base);
                root.add("ingredients", ingredients);

                JsonObject result = new JsonObject();
                result.addProperty("id", FramedLiftMod.MOD_ID + ":" + name);
                result.addProperty("count", 1);
                root.add("result", result);

                Path target = output.getOutputFolder(PackOutput.Target.DATA_PACK)
                        .resolve(FramedLiftMod.MOD_ID)
                        .resolve("recipe")
                        .resolve(name + ".json");
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
