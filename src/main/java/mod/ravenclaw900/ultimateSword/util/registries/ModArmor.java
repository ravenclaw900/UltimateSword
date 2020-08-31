package mod.ravenclaw900.ultimateSword.util.registries;

import mod.ravenclaw900.ultimateSword.UltimateSword;
import mod.ravenclaw900.ultimateSword.util.enums.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmor
{
    public static final DeferredRegister<Item> ARMOR = new DeferredRegister<>(ForgeRegistries.ITEMS, UltimateSword.MOD_ID);

    public static final RegistryObject<ArmorItem> ULTIMATE_HELMET = ARMOR.register("ultimate_helmet",
            () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.HEAD, new Item.Properties().group(UltimateSword.TAB)));

    public static final RegistryObject<ArmorItem> ULTIMATE_CHESTPLATE = ARMOR.register("ultimate_chestplate",
            () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.CHEST, new Item.Properties().group(UltimateSword.TAB)));

    public static final RegistryObject<ArmorItem> ULTIMATE_LEGGINGS = ARMOR.register("ultimate_leggings",
            () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.LEGS, new Item.Properties().group(UltimateSword.TAB)));

    public static final RegistryObject<ArmorItem> ULTIMATE_BOOTS = ARMOR.register("ultimate_boots",
            () -> new ArmorItem(ModArmorMaterial.ULTIMATE, EquipmentSlotType.FEET, new Item.Properties().group(UltimateSword.TAB)));
}
