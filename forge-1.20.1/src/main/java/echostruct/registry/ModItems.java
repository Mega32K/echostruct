package echostruct.registry;

import echostruct.Echostruct;
import echostruct.item.ShapeshiftingSwordItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Echostruct.MOD_ID);
    public static final RegistryObject<Item> MANUAL = ITEMS.register("manual", () -> new Item(new Item.Properties()));
    public static final RegistryObject<ShapeshiftingSwordItem> SHAPESHIFTING_SWORD = ITEMS.register(
            "shapeshifting_sword", () -> new ShapeshiftingSwordItem(new Item.Properties()));

    private ModItems() {}
}
