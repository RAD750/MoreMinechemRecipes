package moreminechemrecipes.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.common.registry.GameRegistry;
import ljdp.minechem.api.core.Chemical;
import ljdp.minechem.api.core.Element;
import ljdp.minechem.api.core.EnumElement;
import ljdp.minechem.api.core.EnumMolecule;
import ljdp.minechem.api.core.Molecule;
import ljdp.minechem.api.recipe.DecomposerRecipe;
import ljdp.minechem.api.recipe.SynthesisRecipe;
import moreminechemrecipes.main.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHandler {

	public static void initCrafting() {
		
		/*
		 * GREGTECH SINTASSI
		 * 
		 * getGregTechItem(TIPO, QTA, META)
		 * 
		 * TIPO: 0. Lingotti 1. Polveri 2. Celle, 3. Altro
		 */
		
		ArrayList<ItemStack> ores;
		ItemStack waterCell = ic2.api.Items.getItem("waterCell").copy();

		// Dai un uso all'Osmio
		final ItemStack osmiumIngot = GregtechCompat.getGregTechItem(0, 1, 30);
		final Element osmium = new Element(EnumElement.Os, 2);
        SynthesisRecipe.add(new SynthesisRecipe(osmiumIngot, false, 1000, new Chemical[] { null, null, null, null, osmium, null, null, null, null }));
        DecomposerRecipe.add(new DecomposerRecipe(osmiumIngot, new Chemical[] { osmium }));
		
        // Decomponi celle
        final ItemStack emptyCell = ic2.api.Items.getItem("cell");
        final Element tin = new Element(EnumElement.Sn, 2);
        DecomposerRecipe.add(new DecomposerRecipe(emptyCell, new Chemical[] { tin }));
        SynthesisRecipe.add(new SynthesisRecipe(emptyCell, false, 1000, new Chemical[] { null, null, null, null, null, tin, null, null, null }));


        // Dai un uso all'Elio
        final ItemStack heliumCell = GregtechCompat.getGregTechItem(2, 1, 3);
        final ItemStack helium3Cell = GregtechCompat.getGregTechItem(2, 1, 6);
        final Element helium = new Element(EnumElement.He, 8);
        DecomposerRecipe.add(new DecomposerRecipe(heliumCell, new Chemical[] { helium, tin }));
        DecomposerRecipe.add(new DecomposerRecipe(helium3Cell, new Chemical[] { helium, tin }));
        SynthesisRecipe.add(new SynthesisRecipe(heliumCell, false, 1000, new Chemical[] { null, null, null, null, helium, tin, null, null, null }));

        // Mercurio
        final ItemStack mercuryCell = GregtechCompat.getGregTechItem(2, 1, 16);
        final Element mercury = new Element(EnumElement.Hg, 4);
        DecomposerRecipe.add(new DecomposerRecipe(mercuryCell, new Chemical[] { mercury, tin }));
        SynthesisRecipe.add(new SynthesisRecipe(mercuryCell, false, 1000, new Chemical[] { null, null, null, null, mercury, tin, null, null, null }));
        
        // Idrogeno
		ItemStack h2cell = GregtechCompat.getGregTechItem(2, 1, 0);
        final Element hydrogen = new Element(EnumElement.H, 4);
        DecomposerRecipe.add(new DecomposerRecipe(h2cell, new Chemical[] { hydrogen, tin }));
        SynthesisRecipe.add(new SynthesisRecipe(h2cell, false, 1000, new Chemical[] { null, null, null, null, hydrogen, tin, null, null, null }));
        
        // Tellurio da circuiti
        ItemStack advCircuit = ic2.api.Items.getItem("advancedCircuit");
        final Molecule lazurite = new Molecule(EnumMolecule.lazurite, 2);
        final Molecule iron3oxide = new Molecule(EnumMolecule.iron3oxide, 8);
        final Molecule strontiumNitrate = new Molecule(EnumMolecule.strontiumNitrate, 8);
        final Element phosphorus2x = new Element(EnumElement.P, 2);
        final Element tellurium = new Element(EnumElement.Te, 1);
        final Element copper = new Element(EnumElement.Cu, 3);
        DecomposerRecipe.add(new DecomposerRecipe(advCircuit, new Chemical[] { lazurite, iron3oxide, strontiumNitrate, phosphorus2x, copper, tellurium}));
        
        //Tellurio da circuiti GT
        ItemStack advCircuitParts = GregtechCompat.getGregTechItem(3, 1, 24);
        final Molecule lazurite1x = new Molecule(EnumMolecule.lazurite, 1);
        final Element phosphorus1x = new Element(EnumElement.P, 1);
        DecomposerRecipe.add(new DecomposerRecipe(advCircuitParts, new Chemical[] {lazurite1x, phosphorus1x, tellurium}));
                
        //Vuota le provette
        GameRegistry.addSmelting(4992, new ItemStack(Items.glassShard, 1), 0.15f);
        GameRegistry.addSmelting(4993, new ItemStack(Items.glassShard, 1), 0.15f);
        GameRegistry.addSmelting(4998, new ItemStack(Items.glassShard, 1), 0.15f);
        
        //Fai qualcosa col glass shard
        ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Items.glassShard, 16), new ItemStack(Block.sand, 3));
	}
}
