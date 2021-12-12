package moreminechemrecipes.main.items;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static Item glassShard;
	
	public static void initItems() {
		glassShard = new MMRItem(16000, 0, "glassShard", 64);
	}
	
	public static void initLanguage() {
		LanguageRegistry.addName(glassShard, "Glass Shard");
	}
}
