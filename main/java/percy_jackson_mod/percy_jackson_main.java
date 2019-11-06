package percy_jackson_mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import percy_jackson_mod.blocks.BlockBronze;
import percy_jackson_mod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class percy_jackson_main {
	//Proxy
	@SidedProxy(clientSide = "percy_jackson_mod.proxy.ClientProxy", serverSide = "percy_jackson_mod.proxy.ServerProxy")
public static CommonProxy proxy;
	
	//Items
	public static Item celestial_bronze;
	public static Item bronze_sword;
	
	//Blocks
	public static Block block_bronze;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		celestial_bronze = new Item().setUnlocalizedName("celestial_bronze").setRegistryName("celestial_bronze").setCreativeTab(CreativeTabs.MISC);
		bronze_sword = new Item ().setUnlocalizedName("bronze_sword").setRegistryName("bronze_sword").setCreativeTab(CreativeTabs.COMBAT);
		
		block_bronze = new BlockBronze("block_bronze");
		
		ForgeRegistries.ITEMS.register(bronze_sword);
		ForgeRegistries.ITEMS.register(celestial_bronze);
		
		ForgeRegistries.BLOCKS.register(block_bronze);
		ForgeRegistries.ITEMS.register(new ItemBlock(block_bronze).setRegistryName(block_bronze.getRegistryName()));
		
		proxy.registerRenderers();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
