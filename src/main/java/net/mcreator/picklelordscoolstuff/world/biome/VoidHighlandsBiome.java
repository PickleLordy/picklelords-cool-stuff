
package net.mcreator.picklelordscoolstuff.world.biome;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.block.Blocks;

import net.mcreator.picklelordscoolstuff.PicklelordsCoolStuffModElements;

@PicklelordsCoolStuffModElements.ModElement.Tag
public class VoidHighlandsBiome extends PicklelordsCoolStuffModElements.ModElement {
	public static Biome biome;
	public VoidHighlandsBiome(PicklelordsCoolStuffModElements instance) {
		super(instance, 3);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16777216).setWaterColor(-10066330).setWaterFogColor(-10066330)
						.withSkyColor(-16777216).withFoliageColor(-16777216).withGrassColor(-16777216).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(
						SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
								Blocks.BLACKSTONE.getDefaultState(), Blocks.BLACKSTONE.getDefaultState())));
				biomeGenerationSettings.withStructure(StructureFeatures.SHIPWRECK);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(0.1f).scale(0.2f).temperature(0.5f)
						.downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("picklelords_cool_stuff:void_highlands"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
