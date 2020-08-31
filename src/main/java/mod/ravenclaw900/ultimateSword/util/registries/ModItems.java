package mod.ravenclaw900.ultimateSword.util.registries;

import mod.ravenclaw900.ultimateSword.UltimateSword;
import mod.ravenclaw900.ultimateSword.objects.blocks.BlockItemBase;
import mod.ravenclaw900.ultimateSword.objects.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, UltimateSword.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_ROD = ITEMS.register("diamond_rod", ItemBase::new);
    public static final RegistryObject<Item> ULTIMATE_SHARD = ITEMS.register("ultimate_shard", ItemBase::new);
    public static final RegistryObject<Item> ULTIMATE_CHESTPLATE_UF = ITEMS.register("ultimate_chestplate_unforged", ItemBase::new);
    public static final RegistryObject<Item> ULTIMATE_HELMET_UF = ITEMS.register("ultimate_helmet_unforged", ItemBase::new);
    public static final RegistryObject<Item> ULTIMATE_BOOTS_UF = ITEMS.register("ultimate_boots_unforged", ItemBase::new);
    public static final RegistryObject<Item> ULTIMATE_LEGGINGS_UF = ITEMS.register("ultimate_leggings_unforged", ItemBase::new);

    // Block Items
    public static final RegistryObject<Item> ULTIMATE_ORE_ITEM = ITEMS.register("ultimate_ore", () -> new BlockItemBase(ModBlocks.ULTIMATE_ORE.get()));
}
