package mod.ravenclaw900.ultimateSword.world.gen;

import mod.ravenclaw900.ultimateSword.UltimateSword;
import mod.ravenclaw900.ultimateSword.util.registries.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = UltimateSword.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen
{

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event)
    {
        for (Biome biome : ForgeRegistries.BIOMES)
        {
            if (biome.getCategory() == Biome.Category.NETHER)
            {

            }
            else if (biome.getCategory() == Biome.Category.THEEND)
            {

            }
            else
            {
                genOre(biome, 5, 5, 5, 35, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ULTIMATE_ORE.get().getDefaultState(), 3);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler,
            BlockState defaultBlockstate, int size)
    {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        @SuppressWarnings("rawtypes")
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }

}