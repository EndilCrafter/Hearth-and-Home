package com.starfish_studios.hearth_and_home.mixin.forge;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public interface AbstractFurnaceBlockEntityAccessor {

    @Invoker("add")
    static void invokeAdd(Map<Item, Integer> map, TagKey<Item> itemTag, int burnTime) {
        throw new AssertionError();
    }

    @Invoker("isNeverAFurnaceFuel")
    static boolean invokeNotFurnaceFuel(Item item) {
        throw new AssertionError();
    }
}