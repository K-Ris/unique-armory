package com.chaotistin.uniquearmory.setup;

import com.chaotistin.uniquearmory.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public static ItemGroup itemGroup = new ItemGroup("uniquearmory"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModItems.GLASSSWORD);
        }
    };

    public void init(){

    }
}
