package com.sk0ne.framedlift.datagen;

import com.sk0ne.framedlift.FramedLiftMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LiftRecipeProvider extends RecipeProvider {

    private static final List<String> NAMES = List.of(
            "framed_cube", "framed_double_slope", /* ... остальные имена ... */
            "framed_one_way_window"
    );

    public LiftRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        Item sail = BuiltInRegistries.ITEM.get(
                ResourceLocation.fromNamespaceAndPath("create", "white_sail"));

        if (sail == null) {
            FramedLiftMod.LOGGER.error("Не найден предмет create:white_sail. Рецепты не будут сгенерированы.");
            return;
        }

        for (String name : NAMES) {
            Item original = BuiltInRegistries.ITEM.get(
                    ResourceLocation.fromNamespaceAndPath("framedblocks", name));
            Item result = BuiltInRegistries.ITEM.get(
                    ResourceLocation.fromNamespaceAndPath(FramedLiftMod.MOD_ID, "lift_" + name));

            if (original == null || result == null) {
                FramedLiftMod.LOGGER.warn("Пропуск рецепта для {} (original={}, result={})", name, original, result);
                continue;
            }

            ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, result)
                    .requires(original)
                    .requires(sail)
                    .unlockedBy("has_" + name, has(original))
                    .save(output, ResourceLocation.fromNamespaceAndPath(
                            FramedLiftMod.MOD_ID, "lift_" + name));
        }
    }
}
