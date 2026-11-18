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

public class LiftLootProvider implements DataProvider {

    private final PackOutput output;

    public LiftLootProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput ignored) {
        try {
            for (DeferredHolder<Block, ? extends Block> block : ModBlocks.BLOCKS.getEntries()) {
                String name = block.getId().getPath();

                JsonObject entry = new JsonObject();
                entry.addProperty("type", "minecraft:item");
                entry.addProperty("name", FramedLiftMod.MOD_ID + ":" + name);

                JsonArray entries = new JsonArray();
                entries.add(entry);

                JsonObject pool = new JsonObject();
                pool.addProperty("rolls", 1);
                pool.add("entries", entries);

                JsonObject cond = new JsonObject();
                cond.addProperty("condition", "minecraft:survives_explosion");
                JsonArray conditions = new JsonArray();
                conditions.add(cond);
                pool.add("conditions", conditions);

                JsonArray pools = new JsonArray();
                pools.add(pool);

                JsonObject root = new JsonObject();
                root.addProperty("type", "minecraft:block");
                root.add("pools", pools);
                root.addProperty("random_sequence", FramedLiftMod.MOD_ID + ":blocks/" + name);

                Path target = output.getOutputFolder(PackOutput.Target.DATA_PACK)
                        .resolve(FramedLiftMod.MOD_ID).resolve("loot_table/blocks").resolve(name + ".json");
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
