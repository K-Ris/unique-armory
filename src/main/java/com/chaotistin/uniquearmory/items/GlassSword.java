package com.chaotistin.uniquearmory.items;

import com.chaotistin.uniquearmory.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class GlassSword extends SwordItem {
    public GlassSword() {
        super(ToolMaterialList.GLASS, 3, -2.4f, (new Item.Properties().group(ModSetup.itemGroup)));
        setRegistryName("glasssword");
    }
}
