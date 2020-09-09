package com.fo4ik.Etra.world;

import com.fo4ik.Etra.init.InitBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.getDimension() == 0){
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(InitBlocks.ETRATIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 23, random.nextInt(5) + 4, 20);
        //InitBlocks.ETRATIUM_ORE.getDefaultState() - что за руда
        //world, random - оставить если в обчсном мире
        //chunkX * 16, chunkZ * 16 - размер оставлять таким
        //8, 21 - 8 мин выстота,  21 максимум
        //random.nextInt(2) + 1 кол-во в пачке
        //18 - редкость нахождения (меньше сложнее)

    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable genMinable = new WorldGenMinable(ore, size);
            genMinable.generate(world, random, pos);
        }
    }
}
