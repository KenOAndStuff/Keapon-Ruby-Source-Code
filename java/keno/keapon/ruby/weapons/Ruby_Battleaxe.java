package keno.keapon.ruby.weapons;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Ruby_Battleaxe extends AxeItem {

    public Ruby_Battleaxe(ToolMaterial material) {
        super(material, 20, -3.1f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
