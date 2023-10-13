package com.test.testmod;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestMod.MOD_ID) //Load class as mod
public class TestMod {

	public static final String MOD_ID = "testmod";
	
	public TestMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::commonSetup);
	}
	
	private void commonSetup(final FMLCommonSetupEvent event) {
		
	}
	
	private void addCreative(BuildCreativeModeTabContentsEvent event) {
		
	}
}
