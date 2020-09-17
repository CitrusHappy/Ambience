package vazkii.ambience;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID)
@Mod.EventBusSubscriber
public class AmbienceConfig {
	
	@Config.Name("Water Dripping")
	@Config.Comment("Enables or disables the Water Dripping Sound Effect [Default:true]")			
	public static Boolean waterDripping_enabled = true;
	
	@Config.Name("Lava Dripping")
	@Config.Comment("Enables or disables the Lava Dripping Sound Effect [Default:true]")			
	public static Boolean lavaDripping_enabled = true;

		@Config(category = "Ocarina", modid = Reference.MOD_ID)
		public static class OcarinaMusics {
			/*@Config.Name("Wings")
			@Config.Comment("Enables compat with the Wings mod if it's present.")
			public boolean WINGS = true;

			@Config.Name("WingsFlyingTickDelay")
			@Config.Comment({ "The sudden third-person perspective shift can be a bit jarring when flying with Wings.",
					"Increase this number to increase the amount of ticks (20ths of a second)",
					"you need to fly for before you automagically go into third person." })
			@Config.RangeInt(min = 0)
			public int wingsFlyingTickDelay = 1;*/

			@Config.Name("Sun's Song")
			@Config.Comment("Enables or disables the Sun's Song Effects [Default:true]")			
			public static Boolean sunsong_enabled = true;

			@Config.Name("Song of Storms")
			@Config.Comment("Enables or disables the Song of Storms Effects [Default:true]")
			public static Boolean songofstorms_enabled = true;

			@Config.Name("Bolero of Fire")
			@Config.Comment("Enables or disables the Bolero of Fire Song Effects [Default:true]")
			public static  Boolean bolerooffire_enabled = true;

			@Config.Name("Horse's Song")
			@Config.Comment("Enables or disables the Horse's Song Effects [Default:true]")
			public static Boolean horsesong_enabled = true;

			@Config.Name("Prelude of Light")
			@Config.Comment("Enables or disables the Prelude of Light Song Effects [Default:true]")
			public static Boolean preludeoflight_enabled = true;

			@Config.Name("Serenade of Water")
			@Config.Comment("Enables or disables the Serenade of Water Song Effects [Default:true]")
			public static Boolean serenadeofwater = true;

			@Config.Name("Minuet of Forest")
			@Config.Comment("Enables or disables the Minuet of Forest Song Effects [Default:true]")
			public static Boolean minuetofforest = true;

		}

		@SubscribeEvent
		public static void configChanged(ConfigChangedEvent.OnConfigChangedEvent e) {
			if (e.getModID().equals(Reference.MOD_ID)) {
				ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
			}
		}
	
}