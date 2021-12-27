package com.ben2790.scrubiantools.registry;

import com.ben2790.scrubiantools.Scrubiantools;
import com.ben2790.scrubiantools.registry.tools.ModSword;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;
import com.ben2790.scrubiantools.materials.WholesmileToolMaterial;

public class ModItems {
    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(Scrubiantools.ITEM_GROUP));
    public static final Item SMILE_FRAGMENT = new Item(new Item.Settings().group(Scrubiantools.ITEM_GROUP));
    public static final Item WHOLE_SMILE = new Item(new Item.Settings().group(Scrubiantools.ITEM_GROUP));



    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(Scrubiantools.ITEM_GROUP));
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(Scrubiantools.ITEM_GROUP));
//Materials
public static final ToolMaterial WHOLE_SMILE_MATERIAL = new WholesmileToolMaterial();

//Tools
public static final Item THE_BLADE_OF_THE_SMILE = new ModSword(WHOLE_SMILE_MATERIAL, 10, -1.6F, new Item.Settings().group(Scrubiantools.ITEM_GROUP));



    //Registry
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Scrubiantools.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Scrubiantools.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Scrubiantools.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Scrubiantools.MOD_ID, "smile_fragment"), SMILE_FRAGMENT);
        Registry.register(Registry.ITEM, new Identifier(Scrubiantools.MOD_ID, "whole_smile"), WHOLE_SMILE);
        Registry.register(Registry.ITEM, new Identifier(Scrubiantools.MOD_ID,"the_blade_of_the_smile"), THE_BLADE_OF_THE_SMILE);


    }

}
