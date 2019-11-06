package percy_jackson_mod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import percy_jackson_mod.percy_jackson_main;

public class ClientProxy implements CommonProxy{
@Override 
public void registerRenderers() {
	ModelLoader.setCustomModelResourceLocation(percy_jackson_main.celestial_bronze, 0, new ModelResourceLocation(new ResourceLocation("percy_jacksonmod:celestial_bronze"), "inventory"));
	ModelLoader.setCustomModelResourceLocation(percy_jackson_main.bronze_sword, 0, new ModelResourceLocation(new ResourceLocation("percy_jacksonmod:bronze_sword"), "inventory"));
	
	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(percy_jackson_main.block_bronze), 0, new ModelResourceLocation(new ResourceLocation("percy_jacksonmod:block_bronze"), "inventory"));
	
	
	}

@Override
public void registerRenderers1() {

	
}
}