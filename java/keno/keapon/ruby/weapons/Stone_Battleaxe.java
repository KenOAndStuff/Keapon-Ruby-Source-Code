package keno.keapon.ruby.weapons;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Stone_Battleaxe extends AxeItem {

    public Stone_Battleaxe(ToolMaterial material) {
        super(material, 10, -2.9f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
