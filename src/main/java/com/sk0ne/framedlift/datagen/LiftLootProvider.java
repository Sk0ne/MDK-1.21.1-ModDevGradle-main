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

public class LiftLootProvider implements DataProvider {

    private final PackOutput output;

    public LiftLootProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput ignored) {
        try {
            for (DeferredBlock<Block> block : ModBlocks.BLOCKS.getEntries()) {
                String name = block.getId().getPath();

                JsonObject root = new JsonObject();
                root.addProperty("type", "minecraft:block");

                JsonObject entry = new JsonObject();
                entry.addProperty("type", "minecraft:item");
                entry.addProperty("name", FramedLiftMod.MOD_ID + ":" + name);

                JsonObject pool = new JsonObject();
                pool.addProperty("rolls", 1);
                pool.add("entries", new JsonArray() {{ add(entry); }});

                JsonObject cond = new JsonObject();
                cond.addProperty("condition", "minecraft:survives_explosion");
                pool.add("conditions", new JsonArray() {{ add(cond); }});

                root.add("pools", new JsonArray() {{ add(pool); }});
                root.addProperty("random_sequence", FramedLiftMod.MOD_ID + ":blocks/" + name);

                Path target = output.getOutputFolder(PackOutput.Target.DATA_PACK)
                        .resolve(FramedLiftMod.MOD_ID)
                        .resolve("loot_table")
                        .resolve("blocks")
                        .resolve(name + ".json");
                Files.createDirectories(target.getParent());
                Files.write(target, root.toString().getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            throw new RuntimeException("Ошибка генерации лут-таблиц", e);
        }
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public String getName() {
        return "FramedLift Loot Tables";
    }
}
