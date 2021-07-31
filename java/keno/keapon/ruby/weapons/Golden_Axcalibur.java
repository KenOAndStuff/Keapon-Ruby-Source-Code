package keno.keapon.ruby.weapons;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Golden_Axcalibur extends SwordItem {

    public Golden_Axcalibur(ToolMaterial material) {
        super(material, 9, -3, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
