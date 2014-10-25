package ZaneExtras.lib;

public class ModInfo
	{
		// This is the unique ID for your mod, it's how the game knows which
		// assets
		// folder to use, among other things.
		public static final String ID = "Zane Extras";

		// This is the name of your mod that will appear in mod lists.
		public static final String NAME = "Zane Extras";

		// The version of your mod. I always default a new mod to 1.0, but there
		// are
		// better practices than this.
		public static final String VERSION = "1.1";

		// To be honest, I'm not sure what the channel does, but it must always
		// be
		// the same as your ID, so just assign the ID value to the channel.
		public static final String CHANNEL = ID;

		// This is very important for any mod, especially those utilizing models
		// and
		// sounds. mainmod is the main package that we're using, the most
		// top-level
		// folder. proxies is another package under it, and we access it using
		// the
		// dot (.). CommonProxy and ClientProxy are located here, so we tell it
		// to
		// point to there for the proxies.
		public static final String PROXY_LOCATION = "ZaneExtras.proxies";
	}
