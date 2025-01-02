
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.blocksofillusion.init;

import wuzu.ian.blocksofillusion.BlocksOfIllusionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class BlocksOfIllusionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksOfIllusionMod.MODID);
	public static final RegistryObject<Item> DIRT = block(BlocksOfIllusionModBlocks.DIRT);
	public static final RegistryObject<Item> SAND = block(BlocksOfIllusionModBlocks.SAND);
	public static final RegistryObject<Item> STONE = block(BlocksOfIllusionModBlocks.STONE);
	public static final RegistryObject<Item> COBBLESTONE = block(BlocksOfIllusionModBlocks.COBBLESTONE);
	public static final RegistryObject<Item> GRANITE = block(BlocksOfIllusionModBlocks.GRANITE);
	public static final RegistryObject<Item> POLISHED_GRANITE = block(BlocksOfIllusionModBlocks.POLISHED_GRANITE);
	public static final RegistryObject<Item> DIORITE = block(BlocksOfIllusionModBlocks.DIORITE);
	public static final RegistryObject<Item> POLISHED_DIORITE = block(BlocksOfIllusionModBlocks.POLISHED_DIORITE);
	public static final RegistryObject<Item> ANDESITE = block(BlocksOfIllusionModBlocks.ANDESITE);
	public static final RegistryObject<Item> POLISHED_ANDESITE = block(BlocksOfIllusionModBlocks.POLISHED_ANDESITE);
	public static final RegistryObject<Item> COARSE_DIRT = block(BlocksOfIllusionModBlocks.COARSE_DIRT);
	public static final RegistryObject<Item> PODZOL = block(BlocksOfIllusionModBlocks.PODZOL);
	public static final RegistryObject<Item> OAK_LOG = block(BlocksOfIllusionModBlocks.OAK_LOG);
	public static final RegistryObject<Item> OAK_WOOD = block(BlocksOfIllusionModBlocks.OAK_WOOD);
	public static final RegistryObject<Item> STRIPPED_OAK_LOG = block(BlocksOfIllusionModBlocks.STRIPPED_OAK_LOG);
	public static final RegistryObject<Item> STRIPPED_OAK_WOOD = block(BlocksOfIllusionModBlocks.STRIPPED_OAK_WOOD);
	public static final RegistryObject<Item> OAK_PLANKS = block(BlocksOfIllusionModBlocks.OAK_PLANKS);
	public static final RegistryObject<Item> SPRUCE_LOG = block(BlocksOfIllusionModBlocks.SPRUCE_LOG);
	public static final RegistryObject<Item> SPRUCE_WOOD = block(BlocksOfIllusionModBlocks.SPRUCE_WOOD);
	public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG = block(BlocksOfIllusionModBlocks.STRIPPED_SPRUCE_LOG);
	public static final RegistryObject<Item> STRIPPED_SPRUCE_WOOD = block(BlocksOfIllusionModBlocks.STRIPPED_SPRUCE_WOOD);
	public static final RegistryObject<Item> SPRUCE_PLANKS = block(BlocksOfIllusionModBlocks.SPRUCE_PLANKS);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
