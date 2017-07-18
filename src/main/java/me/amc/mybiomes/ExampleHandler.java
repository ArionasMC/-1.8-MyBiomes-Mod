package me.amc.mybiomes;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ExampleHandler implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionId())
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateNether(World world, Random random, int x, int z)
	{
		
	}

	private void generateSurface(World world, Random random, int x, int z)
	{
	
		for(int i = 0; i < random.nextInt(15); i++)
		{
			int posX = x + random.nextInt(16);
			int posY = 50 + random.nextInt(35);
			int posZ = z + random.nextInt(16);
			new WorldGenDiamondTree().generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}

	private void generateEnd(World world, Random random, int x, int z)
	{
		
	}

}
