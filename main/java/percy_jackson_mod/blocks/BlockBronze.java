package percy_jackson_mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBronze extends Block {
	public BlockBronze(String name) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3.0f);
		setHarvestLevel("pickaxe", 2);
		setResistance(9.0f);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
}
