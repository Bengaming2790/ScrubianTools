package com.ben2790.scrubiantools.registry;

import com.ben2790.scrubiantools.Scrubiantools;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
//Blocks
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.STONE));


    //Register
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK,new Identifier(Scrubiantools.MOD_ID, "ruby_block"),RUBY_BLOCK);
        Registry.register(Registry.BLOCK,new Identifier(Scrubiantools.MOD_ID, "ruby_ore"),RUBY_ORE);

    }
}
