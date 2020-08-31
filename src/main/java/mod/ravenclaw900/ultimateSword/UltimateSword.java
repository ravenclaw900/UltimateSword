package mod.ravenclaw900.ultimateSword;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.ravenclaw900.ultimateSword.util.registries.ModArmor;
import mod.ravenclaw900.ultimateSword.util.registries.ModBlocks;
import mod.ravenclaw900.ultimateSword.util.registries.ModItems;
import mod.ravenclaw900.ultimateSword.util.registries.ModTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ultimatesword")
public class UltimateSword
{

    public static final String MOD_ID = "ultimatesword";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final String VERSION = "1.0.0";
    public static final String MC_VERSION = "1.15.2";

    public UltimateSword()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModTools.TOOLS.register(modEventBus);
        ModArmor.ARMOR.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    public static final ItemGroup TAB = new ItemGroup("ustab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModTools.ULTIMATE_SWORD.get());
        }
    };
}
