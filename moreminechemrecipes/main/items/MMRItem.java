package moreminechemrecipes.main.items;

import net.minecraft.item.Item;

public class MMRItem extends Item{
	public MMRItem(int id, int textureId, String itemName, int maxStackSize) {
		super(id-256);
		/**
		 * Registra un oggetto generico
		 * @param id ID dell'oggetto
		 * @param textureId ID della texture
		 * @param itemName nome oggetto
		 * @param maxStackSize Max stack size
		 * @return Item.
		 */
		this.setTextureFile("/moreminechemrecipes/main/items/Items.png");
		this.setIconIndex(textureId);
		this.setItemName(itemName);
		this.setMaxStackSize(maxStackSize);
	}
}