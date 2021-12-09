package moreminechemrecipes.main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingHelpers {
	   public static void addShapelessRecipe(ItemStack result, Object... input) {
	        GameRegistry.addShapelessRecipe(result, input);
	    }

	    public static void addShapedOreRecipe(ItemStack result, Object... input) {
	        IRecipe recipe = new ShapedOreRecipe(result, input);
	        addRecipe(recipe);
	    }

	    public static void addShapelessOreRecipe(ItemStack result, Object... input) {
	        IRecipe recipe = new ShapelessOreRecipe(result, input);
	        addRecipe(recipe);
	    }

	    public static void addRecipe(IRecipe recipe) {
	        GameRegistry.addRecipe(recipe);
	    }
}
