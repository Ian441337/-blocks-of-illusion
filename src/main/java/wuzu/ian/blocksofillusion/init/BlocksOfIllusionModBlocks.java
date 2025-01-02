
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.blocksofillusion.init;

import wuzu.ian.blocksofillusion.block.StoneBlock;
import wuzu.ian.blocksofillusion.block.SandBlock;
import wuzu.ian.blocksofillusion.block.PolishedGraniteBlock;
import wuzu.ian.blocksofillusion.block.PolishedDioriteBlock;
import wuzu.ian.blocksofillusion.block.PolishedAndesiteBlock;
import wuzu.ian.blocksofillusion.block.GrassblockBlock;
import wuzu.ian.blocksofillusion.block.GraniteBlock;
import wuzu.ian.blocksofillusion.block.DirtBlock;
import wuzu.ian.blocksofillusion.block.DioriteBlock;
import wuzu.ian.blocksofillusion.block.CobblestoneBlock;
import wuzu.ian.blocksofillusion.block.AndesiteBlock;
import wuzu.ian.blocksofillusion.BlocksOfIllusionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class BlocksOfIllusionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksOfIllusionMod.MODID);
	public static final RegistryObject<Block> DIRT = REGISTRY.register("dirt", () -> new DirtBlock());
	public static final RegistryObject<Block> SAND = REGISTRY.register("sand", () -> new SandBlock());
	public static final RegistryObject<Block> STONE = REGISTRY.register("stone", () -> new StoneBlock());
	public static final RegistryObject<Block> COBBLESTONE = REGISTRY.register("cobblestone", () -> new CobblestoneBlock());
	public static final RegistryObject<Block> GRANITE = REGISTRY.register("granite", () -> new GraniteBlock());
	public static final RegistryObject<Block> POLISHED_GRANITE = REGISTRY.register("polished_granite", () -> new PolishedGraniteBlock());
	public static final RegistryObject<Block> DIORITE = REGISTRY.register("diorite", () -> new DioriteBlock());
	public static final RegistryObject<Block> POLISHED_DIORITE = REGISTRY.register("polished_diorite", () -> new PolishedDioriteBlock());
	public static final RegistryObject<Block> ANDESITE = REGISTRY.register("andesite", () -> new AndesiteBlock());
	public static final RegistryObject<Block> POLISHED_ANDESITE = REGISTRY.register("polished_andesite", () -> new PolishedAndesiteBlock());
	public static final RegistryObject<Block> GRASSBLOCK = REGISTRY.register("grassblock", () -> new GrassblockBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GrassblockBlock.blockColorLoad(event);
		}
	}
}
