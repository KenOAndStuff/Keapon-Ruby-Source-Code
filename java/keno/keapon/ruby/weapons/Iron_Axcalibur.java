package keno.keapon.ruby.weapons;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Iron_Axcalibur extends SwordItem {

    public Iron_Axcalibur(ToolMaterial material) {
        super(material, 10, -3.0f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
