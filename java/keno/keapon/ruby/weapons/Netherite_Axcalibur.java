package keno.keapon.ruby.weapons;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class Netherite_Axcalibur extends SwordItem {

    public Netherite_Axcalibur(ToolMaterial material) {
        super(material, 11, -2.8f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}
