package com.ben2790.scrubiantools;

import com.ben2790.scrubiantools.registry.ModBlocks;
import com.ben2790.scrubiantools.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;

import java.rmi.registry.Registry;


public class Scrubiantools implements ModInitializer {

    public static final String MOD_ID = "scrubtools";

    //Creative Tabs
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "scrubtools"), () -> new ItemStack(ModItems.RUBY));

            @Override
            public void onInitialize() {
                //Registration
                ModItems.registerItems();
                ModBlocks.registerBlocks();

            }


        }
