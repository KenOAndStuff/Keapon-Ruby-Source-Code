package keno.keapon.ruby;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFabric implements ToolMaterial {
    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 100;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.ACACIA_BOAT);
    }
}
