package mainmod.proxies;

import mainmod.entity.EntityDamnHardGoldNugget;
import mainmod.items.Items;
import mainmod.render.DamnHardButterNuggetRender;
import net.minecraft.client.renderer.entity.RenderManager;

public class ClientProxy extends CommonProxy
	{
		@Override
		public void initRenderers()
			{
				RenderManager.instance.entityRenderMap.put(
						EntityDamnHardGoldNugget.class,
						new DamnHardButterNuggetRender(
								Items.damnHardButterNugget));
			}

		@Override
		public void initSounds()
			{

			}
	}
