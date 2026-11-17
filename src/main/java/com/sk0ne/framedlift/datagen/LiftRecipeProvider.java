package com.sk0ne.framedlift.datagen;

import com.sk0ne.framedlift.FramedLiftMod;
import com.sk0ne.framedlift.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class LiftRecipeProvider extends RecipeProvider {

    private static final List<Pair> PAIRS = List.of(
            new Pair("framed_cube", ModItems.LIFT_FRAMED_CUBE),
            new Pair("framed_double_slope", ModItems.LIFT_FRAMED_DOUBLE_SLOPE),
            new Pair("framed_double_corner", ModItems.LIFT_FRAMED_DOUBLE_CORNER),
            new Pair("framed_double_prism_corner", ModItems.LIFT_FRAMED_DOUBLE_PRISM_CORNER),
            new Pair("framed_double_threeway_corner", ModItems.LIFT_FRAMED_DOUBLE_THREEWAY_CORNER),
            new Pair("framed_elevated_double_slope_edge", ModItems.LIFT_FRAMED_ELEVATED_DOUBLE_SLOPE_EDGE),
            new Pair("framed_elev_double_corner_slope_edge", ModItems.LIFT_FRAMED_ELEV_DOUBLE_CORNER_SLOPE_EDGE),
            new Pair("framed_elev_double_inner_corner_slope_edge", ModItems.LIFT_FRAMED_ELEV_DOUBLE_INNER_CORNER_SLOPE_EDGE),
            new Pair("framed_double_slab", ModItems.LIFT_FRAMED_DOUBLE_SLAB),
            new Pair("framed_adj_double_slab", ModItems.LIFT_FRAMED_ADJ_DOUBLE_SLAB),
            new Pair("framed_adj_double_copycat_slab", ModItems.LIFT_FRAMED_ADJ_DOUBLE_COPYCAT_SLAB),
            new Pair("framed_double_panel", ModItems.LIFT_FRAMED_DOUBLE_PANEL),
            new Pair("framed_adj_double_panel", ModItems.LIFT_FRAMED_ADJ_DOUBLE_PANEL),
            new Pair("framed_adj_double_copycat_panel", ModItems.LIFT_FRAMED_ADJ_DOUBLE_COPYCAT_PANEL),
            new Pair("framed_double_stairs", ModItems.LIFT_FRAMED_DOUBLE_STAIRS),
            new Pair("framed_sloped_double_stairs", ModItems.LIFT_FRAMED_SLOPED_DOUBLE_STAIRS),
            new Pair("framed_vertical_double_stairs", ModItems.LIFT_FRAMED_VERTICAL_DOUBLE_STAIRS),
            new Pair("framed_vertical_sloped_double_stairs", ModItems.LIFT_FRAMED_VERTICAL_SLOPED_DOUBLE_STAIRS),
            new Pair("framed_double_threeway_corner_pillar", ModItems.LIFT_FRAMED_DOUBLE_THREEWAY_CORNER_PILLAR),
            new Pair("framed_secret_storage", ModItems.LIFT_FRAMED_SECRET_STORAGE),
            new Pair("framed_tank", ModItems.LIFT_FRAMED_TANK),
            new Pair("framed_bouncy_cube", ModItems.LIFT_FRAMED_BOUNCY_CUBE),
            new Pair("framed_redstone_block", ModItems.LIFT_FRAMED_REDSTONE_BLOCK),
            new Pair("framed_elevated_inner_double_prism", ModItems.LIFT_FRAMED_ELEVATED_INNER_DOUBLE_PRISM),
            new Pair("framed_elevated_inner_double_sloped_prism", ModItems.LIFT_FRAMED_ELEVATED_INNER_DOUBLE_SLOPED_PRISM),
            new Pair("framed_elevated_double_slope_slab", ModItems.LIFT_FRAMED_ELEVATED_DOUBLE_SLOPE_SLAB),
            new Pair("framed_flat_elev_double_slope_slab_corner", ModItems.LIFT_FRAMED_FLAT_ELEV_DOUBLE_SLOPE_SLAB_CORNER),
            new Pair("framed_flat_elev_inner_double_slope_slab_corner", ModItems.LIFT_FRAMED_FLAT_ELEV_INNER_DOUBLE_SLOPE_SLAB_CORNER),
            new Pair("framed_extended_double_slope_panel", ModItems.LIFT_FRAMED_EXTENDED_DOUBLE_SLOPE_PANEL),
            new Pair("framed_flat_ext_double_slope_panel_corner", ModItems.LIFT_FRAMED_FLAT_EXT_DOUBLE_SLOPE_PANEL_CORNER),
            new Pair("framed_flat_ext_inner_double_slope_panel_corner", ModItems.LIFT_FRAMED_FLAT_EXT_INNER_DOUBLE_SLOPE_PANEL_CORNER),
            new Pair("framed_ext_double_corner_slope_panel", ModItems.LIFT_FRAMED_EXT_DOUBLE_CORNER_SLOPE_PANEL),
            new Pair("framed_ext_double_corner_slope_panel_w", ModItems.LIFT_FRAMED_EXT_DOUBLE_CORNER_SLOPE_PANEL_W),
            new Pair("framed_ext_inner_double_corner_slope_panel", ModItems.LIFT_FRAMED_EXT_INNER_DOUBLE_CORNER_SLOPE_PANEL),
            new Pair("framed_ext_inner_double_corner_slope_panel_w", ModItems.LIFT_FRAMED_EXT_INNER_DOUBLE_CORNER_SLOPE_PANEL_W),
            new Pair("framed_glowing_cube", ModItems.LIFT_FRAMED_GLOWING_CUBE),
            new Pair("framed_target", ModItems.LIFT_FRAMED_TARGET),
            new Pair("framed_bookshelf", ModItems.LIFT_FRAMED_BOOKSHELF),
            new Pair("framed_chiseled_bookshelf", ModItems.LIFT_FRAMED_CHISELED_BOOKSHELF),
            new Pair("framed_masonry_corner", ModItems.LIFT_FRAMED_MASONRY_CORNER),
            new Pair("framed_checkered_cube", ModItems.LIFT_FRAMED_CHECKERED_CUBE),
            new Pair("framed_one_way_window", ModItems.LIFT_FRAMED_ONE_WAY_WINDOW)
    );

    private final HolderLookup.Provider registries;

    public LiftRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
        this.registries = registries;
    }

    @Override
    protected void buildRecipes() {
        HolderGetter<Item> items = registries.lookupOrThrow(Registries.ITEM);

        Optional<Holder.Reference<Item>> sailHolder =
                items.get(ResourceLocation.fromNamespaceAndPath("create", "white_sail"));
        if (sailHolder.isEmpty()) {
            FramedLiftMod.LOGGER.error("Не найден предмет create:white_sail. Рецепты не будут сгенерированы.");
            return;
        }
        final Item sail = sailHolder.get().value();

        for (Pair pair : PAIRS) {
            Optional<Holder.Reference<Item>> originalHolder =
                    items.get(ResourceLocation.fromNamespaceAndPath("framedblocks", pair.framedId()));
            if (originalHolder.isEmpty()) {
                FramedLiftMod.LOGGER.warn("Не найден предмет framedblocks:{}. Пропуск.", pair.framedId());
                continue;
            }
            final Item original = originalHolder.get().value();

            ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, pair.result().get())
                    .requires(original)
                    .requires(sail)
                    .unlockedBy("has_" + pair.framedId(), has(original))
                    .save(output, ResourceLocation.fromNamespaceAndPath(
                            FramedLiftMod.MOD_ID, "lift_" + pair.framedId()));
        }
    }

    private record Pair(String framedId, DeferredItem<?> result) {}

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new LiftRecipeProvider(registries, output);
        }

        @Override
        public @NotNull String getName() {
            return "FramedLift Recipes";
        }
    }
}
