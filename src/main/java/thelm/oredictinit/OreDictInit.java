package thelm.oredictinit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelm.oredictinit.lib.EventHandler;

@Mod(
		modid = OreDictInit.MOD_ID,
		name = OreDictInit.NAME,
		version = OreDictInit.VERSION,
		dependencies = "required-before:wrapup"
		)
public class OreDictInit {

	public static final String MOD_ID = "oredictinit";
	public static final String NAME = "OreDictInit";
	public static final String VERSION = "1.11.2-2.1.1.60";
	public static OreDictInit instance = new OreDictInit();
	public static ModMetadata metadata;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		metadata = event.getModMetadata();
		metadata.autogenerated = false;
		metadata.version = VERSION;
		metadata.authorList.add("TheLMiffy1111");
		metadata.description = "This mod registers oreDict entries at the end of preInit.";

		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}
}
