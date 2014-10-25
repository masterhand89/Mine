package ZaneExtras.managers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import ZaneExtras.blocks.Blocks;
import ZaneExtras.worldgen.WorldGenNether;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator
	{

		@Override
		public void generate(Random random, int chunkX, int chunkZ,
				World world, IChunkProvider chunkGenerator,
				IChunkProvider chunkProvider)
			{
				// TODO Auto-generated method stub
				switch (world.provider.dimensionId)
					{
						case 0 :
							this.generateSurface(world, random, chunkX, chunkZ);
							break;
					}
			}
		private void generateSurface(World world, Random random, int x, int z)
			{
				// Damn Hard Butter Ore
				this.addOreSpawn(Blocks.damnHardButterOre, world, random, x, z,
						16, 16, 3 + random.nextInt(1), 20, 11, 16);

				BiomeGenBase currentBiome = world.getBiomeGenForCoords(x, z);
				int y = world.getHeightValue(x, z);

				if (currentBiome.equals(BiomeGenBase.forest))
					{

						this.spawnStructure(25, 35, world, random, x, y, z,
								new WorldGenFlowers(Blocks.peanutPlant.blockID));

					}

				if (currentBiome.equals(BiomeGenBase.forestHills))
					{

						this.spawnStructure(25, 35, world, random, x, y, z,
								new WorldGenFlowers(Blocks.peanutPlant.blockID));

					}

				if (currentBiome.equals(BiomeGenBase.extremeHillsEdge))
					{

						this.spawnStructure(25, 35, world, random, x, y, z,
								new WorldGenFlowers(Blocks.peanutPlant.blockID));

					}
				if (currentBiome.equals(BiomeGenBase.plains))
					{

						this.spawnStructure(25, 35, world, random, x, y, z,
								new WorldGenFlowers(Blocks.peanutPlant.blockID));

					}

				if (currentBiome.equals(BiomeGenBase.extremeHills))
					{

						this.spawnStructure(25, 35, world, random, x, y, z,
								new WorldGenFlowers(Blocks.peanutPlant.blockID));

					}
				if (currentBiome.equals(BiomeGenBase.plains))
					{

						this.spawnStructure(25, 35, world, random, x, y, z,
								new WorldGenFlowers(Blocks.peanutPlant.blockID));

					}
			}
		/**
		 * Adds a block to world generation for spawning, usually ores.
		 *
		 * @param block
		 *            The block that needs to generate.
		 * @param world
		 *            The world that the block generates it.
		 * @param random
		 *            Needed for randomization of block generation.
		 * @param blockXPos
		 *            The X Position of the block.
		 * @param blockZPos
		 *            The Z position of the block.
		 * @param maxX
		 *            The max X this block can appear in.
		 * @param maxZ
		 *            The max Z this block can appear in.
		 * @param maxVeinSize
		 *            The max size of the vein that the block generates in.
		 * @param chancesToSpawn
		 *            The percentage chance that the block has to spawn.
		 * @param minY
		 *            The lowest Y (layer) that the block can generate.
		 * @param maxY
		 *            The highest Y (layer) that the block can generate.
		 */
		public void addOreSpawn(Block block, World world, Random random,
				int blockXPos, int blockZPos, int maxX, int maxZ,
				int maxVeinSize, int chancesToSpawn, int minY, int maxY)
			{
				int maxPossY = minY + (maxY - 1);
				assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
				assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
				assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
				assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
				assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

				int diffBtwnMinMaxY = maxY - minY;
				for (int x = 0; x < chancesToSpawn; x++)
					{
						int posX = blockXPos + random.nextInt(maxX);
						int posY = minY + random.nextInt(diffBtwnMinMaxY);
						int posZ = blockZPos + random.nextInt(maxZ);
						(new WorldGenMinable(block.blockID, maxVeinSize))
								.generate(world, random, posX, posY, posZ);
					}

			}

		private void generateNether(World world, Random random, int x, int z)
			{
				int Xcoord = x + random.nextInt(16);
				int Ycoord = 10 + random.nextInt(128);
				int Zcoord = z + random.nextInt(16);

				(new WorldGenNether(Blocks.damnHardButterNetherOre.blockID, 2,
						4)).generate(world, random, Xcoord, Ycoord, Zcoord);
			}

		/**
		 * Spawns a structure in the world
		 *
		 * @author Alpha Wolf
		 * @param minChance
		 *            The minimum chance that the structure has to spawn.
		 * @param maxChance
		 *            The maximum chance that the structure has to spawn.
		 * @param world
		 *            The world for the structure to spawn in.
		 * @param random
		 *            Needed for randomization and comparison.
		 * @param x
		 * @param y
		 * @param z
		 * @param wg
		 *            The structure.
		 */
		public static void spawnStructure(int minChance, int maxChance,
				World world, Random random, int x, int y, int z,
				WorldGenerator wg)
			{
				if (random.nextInt(maxChance) == minChance)
					{
						wg.generate(world, random, x, y, z);
					}
			}
	}
