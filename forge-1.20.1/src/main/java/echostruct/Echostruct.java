package echostruct;

import echostruct.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Echostruct.MOD_ID)
public final class Echostruct {
    public static final String MOD_ID = "echostruct";

    public Echostruct(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModEventBus();
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(Echostruct::buildCreativeTabContents);
    }

    private static void buildCreativeTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
            ItemStack book = new ItemStack(Items.WRITABLE_BOOK);
            ItemStack manual = new ItemStack(ModItems.MANUAL.get());
            if (event.getEntries().contains(book)) {
                event.getEntries().putAfter(book, manual, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            } else {
                event.accept(manual);
            }
        }
    }
}
