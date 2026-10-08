package echostruct.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public final class ShapeshiftingSwordItem extends SwordItem {
    public ShapeshiftingSwordItem(Properties properties) {
        super(Tiers.IRON, properties.attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.4F)));
    }
}
