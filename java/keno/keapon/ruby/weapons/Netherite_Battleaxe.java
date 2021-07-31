package keno.keapon.ruby.weapons;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Netherite_Battleaxe extends AxeItem {

    public Netherite_Battleaxe(ToolMaterial material) {
        super(material, 15, -2.9f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
