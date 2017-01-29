package com.mcmoddev.basefoods.proxy;

import com.mcmoddev.basefoods.BaseFoods;
import com.mcmoddev.basefoods.init.*;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent.MissingMapping;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Base Minerals Common Proxy
 *
 * @author Jasmine Iwanek
 *
 */
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {

//		Config.init();

//		Materials.init();
//		Fluids.init();
//		ItemGroups.init();
		Blocks.init();
		Items.init();
//		VillagerTrades.init();

//		FMLInterModComms.sendFunctionMessage("orespawn", "api", "com.mcmoddev.orespawn.BaseFoodsOreSpawn");

//		IntegrationManager.INSTANCE.preInit(event);
	}

	public void onRemap(FMLMissingMappingsEvent event) {
		for (final MissingMapping mapping : event.get()) {
			if (mapping.resourceLocation.getResourceDomain().equals(BaseFoods.MODID)) {
				if (mapping.type.equals(GameRegistry.Type.BLOCK)) {
				} else if (mapping.type.equals(GameRegistry.Type.ITEM)) {
				}
			}
		}
	}

	public void init(FMLInitializationEvent event) {
//		Recipes.init();

//		Achievements.init();

//		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

	public void postInit(FMLPostInitializationEvent event) {
//		Config.postInit();
	}
}
