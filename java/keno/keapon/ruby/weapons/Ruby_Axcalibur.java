package keno.keapon.ruby.weapons;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Ruby_Axcalibur extends SwordItem {

    public Ruby_Axcalibur(ToolMaterial material) {
        super(material, 15, -3.0f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
