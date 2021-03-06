package am2.world;

import java.util.Random;

import am2.entity.EntityDryad;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeWitchwoodForest extends Biome{

	public static final Biome instance = new BiomeWitchwoodForest(new BiomeProperties("WitchwoodForest"));
	private static final WitchwoodTreeHuge hugeTree = new WitchwoodTreeHuge(true);
	private static final WitchwoodTreeSmall smallTree = new WitchwoodTreeSmall(true);

	public BiomeWitchwoodForest(BiomeProperties par1){
		super(par1);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityDryad.class, 5, 4, 4));
		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 4;
		this.theBiomeDecorator.flowersPerChunk = 10;
	}

	@Override
	public int getWaterColorMultiplier(){
		return 0x0a2a72;
	}
	
	@Override
	public int getFoliageColorAtPos(BlockPos pos) {
		return 0xdbe6e5;
	}
	
	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return 0xdbe6e5;
	}

	@Override
	public int getSkyColorByTemp(float par1){
		return 0x6699ff;
	}
	
	
	
	@Override
	public WorldGenAbstractTree genBigTreeChance(Random p_150567_1_)
	{
	  return (WorldGenAbstractTree)(p_150567_1_.nextInt(10) == 0 ? hugeTree : smallTree);
	}
}
