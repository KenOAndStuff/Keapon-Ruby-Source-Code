package keno.keapon.ruby.weapons;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Golden_Battleaxe extends AxeItem {

    public Golden_Battleaxe(ToolMaterial material) {
        super(material, 9, -3, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
