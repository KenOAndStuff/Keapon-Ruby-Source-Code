package keno.keapon.ruby.weapons;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Rubied_Diamond_Battleaxe extends AxeItem {

    public Rubied_Diamond_Battleaxe(ToolMaterial material) {
        super(material, 15, -3.0f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
