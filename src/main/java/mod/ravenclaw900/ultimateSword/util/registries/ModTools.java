package mod.ravenclaw900.ultimateSword.util.registries;

import mod.ravenclaw900.ultimateSword.UltimateSword;
import mod.ravenclaw900.ultimateSword.util.enums.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTools
{
    public static final DeferredRegister<Item> TOOLS = new DeferredRegister<>(ForgeRegistries.ITEMS, UltimateSword.MOD_ID);

    // Tools
    public static final RegistryObject<SwordItem> ULTIMATE_SWORD = TOOLS.register("ultimate_sword",
            () -> new SwordItem(ModItemTier.ULTIMATE, 999999998, 0.0F, new Item.Properties().group(UltimateSword.TAB)));
    public static final RegistryObject<SwordItem> ULTIMATE_SWORD_UF = TOOLS.register("ultimate_sword_unforged",
            () -> new SwordItem(ModItemTier.ULTIMATE, 9, 0.0F, new Item.Properties().group(UltimateSword.TAB)));
}
