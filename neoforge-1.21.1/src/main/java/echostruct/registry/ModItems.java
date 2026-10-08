package echostruct.registry;

import echostruct.Echostruct;
import echostruct.item.ShapeshiftingSwordItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Echostruct.MOD_ID);
    public static final DeferredItem<Item> MANUAL = ITEMS.register("manual", () -> new Item(new Item.Properties()));
    public static final DeferredItem<ShapeshiftingSwordItem> SHAPESHIFTING_SWORD = ITEMS.register(
            "shapeshifting_sword", () -> new ShapeshiftingSwordItem(new Item.Properties()));

    private ModItems() {}
}
