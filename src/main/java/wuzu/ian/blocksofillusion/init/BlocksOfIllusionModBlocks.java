
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.blocksofillusion.init;

import wuzu.ian.blocksofillusion.block.StrippedSpruceWoodBlock;
import wuzu.ian.blocksofillusion.block.StrippedSpruceLogBlock;
import wuzu.ian.blocksofillusion.block.StrippedOakWoodBlock;
import wuzu.ian.blocksofillusion.block.StrippedOakLogBlock;
import wuzu.ian.blocksofillusion.block.StoneBlock;
import wuzu.ian.blocksofillusion.block.SpruceWoodBlock;
import wuzu.ian.blocksofillusion.block.SprucePlanksBlock;
import wuzu.ian.blocksofillusion.block.SpruceLogBlock;
import wuzu.ian.blocksofillusion.block.SandBlock;
import wuzu.ian.blocksofillusion.block.PolishedGraniteBlock;
import wuzu.ian.blocksofillusion.block.PolishedDioriteBlock;
import wuzu.ian.blocksofillusion.block.PolishedAndesiteBlock;
import wuzu.ian.blocksofillusion.block.PodzolBlock;
import wuzu.ian.blocksofillusion.block.OakWoodBlock;
import wuzu.ian.blocksofillusion.block.OakPlanksBlock;
import wuzu.ian.blocksofillusion.block.OakLogBlock;
import wuzu.ian.blocksofillusion.block.GraniteBlock;
import wuzu.ian.blocksofillusion.block.DirtBlock;
import wuzu.ian.blocksofillusion.block.DioriteBlock;
import wuzu.ian.blocksofillusion.block.CobblestoneBlock;
import wuzu.ian.blocksofillusion.block.CoarseDirtBlock;
import wuzu.ian.blocksofillusion.block.AndesiteBlock;
import wuzu.ian.blocksofillusion.BlocksOfIllusionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
	public static final RegistryObject<Block> COARSE_DIRT = REGISTRY.register("coarse_dirt", () -> new CoarseDirtBlock());
	public static final RegistryObject<Block> PODZOL = REGISTRY.register("podzol", () -> new PodzolBlock());
	public static final RegistryObject<Block> OAK_LOG = REGISTRY.register("oak_log", () -> new OakLogBlock());
	public static final RegistryObject<Block> OAK_WOOD = REGISTRY.register("oak_wood", () -> new OakWoodBlock());
	public static final RegistryObject<Block> STRIPPED_OAK_LOG = REGISTRY.register("stripped_oak_log", () -> new StrippedOakLogBlock());
	public static final RegistryObject<Block> STRIPPED_OAK_WOOD = REGISTRY.register("stripped_oak_wood", () -> new StrippedOakWoodBlock());
	public static final RegistryObject<Block> OAK_PLANKS = REGISTRY.register("oak_planks", () -> new OakPlanksBlock());
	public static final RegistryObject<Block> SPRUCE_LOG = REGISTRY.register("spruce_log", () -> new SpruceLogBlock());
	public static final RegistryObject<Block> SPRUCE_WOOD = REGISTRY.register("spruce_wood", () -> new SpruceWoodBlock());
	public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG = REGISTRY.register("stripped_spruce_log", () -> new StrippedSpruceLogBlock());
	public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD = REGISTRY.register("stripped_spruce_wood", () -> new StrippedSpruceWoodBlock());
	public static final RegistryObject<Block> SPRUCE_PLANKS = REGISTRY.register("spruce_planks", () -> new SprucePlanksBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
