package mod.ravenclaw900.ultimateSword.util.registries;

import mod.ravenclaw900.ultimateSword.UltimateSword;
import mod.ravenclaw900.ultimateSword.objects.blocks.UltimateOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, UltimateSword.MOD_ID);

    public static final RegistryObject<Block> ULTIMATE_ORE = BLOCKS.register("ultimate_ore", UltimateOre::new);
}
