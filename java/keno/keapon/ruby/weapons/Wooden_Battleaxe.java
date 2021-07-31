package keno.keapon.ruby.weapons;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Wooden_Battleaxe extends AxeItem {

    public Wooden_Battleaxe(ToolMaterial material) {
        super(material, 8, -2.9f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
