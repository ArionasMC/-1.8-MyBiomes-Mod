package me.amc.mybiomes;

import com.mojang.realmsclient.dto.RealmsServer.WorldType;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MyBiomes.MODID, version = MyBiomes.VERSION)
public class MyBiomes {
	
    public static final String MODID = "mybiomes";
    public static final String VERSION = "1.0";
    
    public static BiomeGenBase diamondWoods = new BiomeGenWoods(52).setBiomeName("DiamondWoods");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    //	BiomeManager.addSpawnBiome(diamondWoods);
    //	BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(diamondWoods, 10));
    	
    //	WorldChunkManager.allowedBiomes.add(diamondWoods);
    	
    //	BiomeDictionary.registerBiomeType(diamondWoods, Type.FOREST);
    //	BiomeManager.addSpawnBiome(diamondWoods);
    	BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(diamondWoods, 1));

    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
		
    //	BiomeManager.addSpawnBiome(diamondWoods);
    //	BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(diamondWoods, 50));
    	
    }
}
