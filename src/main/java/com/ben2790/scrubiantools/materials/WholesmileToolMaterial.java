package com.ben2790.scrubiantools.materials;
import com.ben2790.scrubiantools.Scrubiantools;
import com.ben2790.scrubiantools.registry.ModItems;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;

public class WholesmileToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.WHOLE_SMILE);
    }
}


