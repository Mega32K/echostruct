package echostruct;

import echostruct.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(Echostruct.MOD_ID)
public final class Echostruct {
    public static final String MOD_ID = "echostruct";

    public Echostruct(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(Echostruct::buildCreativeTabContents);
    }

    private static void buildCreativeTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
            ItemStack book = new ItemStack(Items.WRITABLE_BOOK);
            ItemStack manual = new ItemStack(ModItems.MANUAL.get());
            if (event.getParentEntries().contains(book) && event.getSearchEntries().contains(book)) {
                event.insertAfter(book, manual, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            } else {
                event.accept(manual);
            }
        }
    }
}
