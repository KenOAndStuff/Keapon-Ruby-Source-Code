package keno.keapon.ruby.weapons;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Diamond_Axcalibur extends SwordItem {

    public Diamond_Axcalibur(ToolMaterial material) {
        super(material, 10, -2.9f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
