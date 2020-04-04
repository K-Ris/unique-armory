package com.chaotistin.uniquearmory.proxy;

import net.minecraft.world.World;

public interface IProxy {
    void init();

    World getClientWorld();
}
