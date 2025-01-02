
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.blocksofillusion.init;

import wuzu.ian.blocksofillusion.BlocksOfIllusionMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class BlocksOfIllusionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlocksOfIllusionMod.MODID);
	public static final RegistryObject<CreativeModeTab> BLOCKSOFILLUSION = REGISTRY.register("blocksofillusion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.blocks_of_illusion.blocksofillusion")).icon(() -> new ItemStack(Items.ENDER_EYE)).displayItems((parameters, tabData) -> {
				tabData.accept(BlocksOfIllusionModBlocks.STONE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.COBBLESTONE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.GRANITE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.POLISHED_GRANITE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.DIORITE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.POLISHED_DIORITE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.ANDESITE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.POLISHED_ANDESITE.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.DIRT.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.GRASSBLOCK.get().asItem());
				tabData.accept(BlocksOfIllusionModBlocks.SAND.get().asItem());
			}).withSearchBar().build());
}
