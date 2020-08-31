package mod.ravenclaw900.ultimateSword.objects.blocks;

import mod.ravenclaw900.ultimateSword.UltimateSword;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem
{

    public BlockItemBase(Block block)
    {
        super(block, new Item.Properties().group(UltimateSword.TAB));
    }

}
