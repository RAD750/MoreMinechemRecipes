package moreminechemrecipes.main;

import java.util.logging.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import moreminechemrecipes.main.items.Items;
import net.minecraft.src.BaseMod;

@Mod(name="More Minechem Recipes", version="1.1", modid="MoreMinechemRecipes", dependencies="required-after:IC2; after:factorization; after:Railcraft; after:ThermalExpansion; after:ThermalExpansion|Transport; after:ThermalExpansion|Energy; after:ThermalExpansion|Factory; after:XyCraft; after:MetallurgyCore; after:MetallurgyBase; after:MetallurgyEnder; after:MetallurgyFantasy; after:MetallurgyNether; after:MetallurgyPrecious; after:MetallurgyUtility; after:BuildCraft|Silicon; after:BuildCraft|Core; after:BuildCraft|Transport; after:BuildCraft|Factory; after:BuildCraft|Energy; after:BuildCraft|Builders; after:enhancedgeology;")
public class Main extends BaseMod{
	
	public static Logger mmrLog = Logger.getLogger("MoreMinechemRecipes");
	
	@Override
	public String getVersion() {
		return "1.1";
	}

	@Override
	public void load() {
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		mmrLog.info("Pavlo Solokha è con voi. E con il vostro spirito.");
		mmrLog.info("FoxWorn ♥ Hiro");
	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		Items.initItems();
		Items.initLanguage();
		CraftingHandler.initCrafting();
	}
}
