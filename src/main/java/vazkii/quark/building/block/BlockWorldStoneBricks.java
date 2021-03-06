/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 *
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 *
 * File Created @ [20/03/2016, 19:58:13 (GMT)]
 */
package vazkii.quark.building.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import vazkii.quark.base.block.BlockMetaVariants;
import vazkii.quark.base.module.ModuleLoader;
import vazkii.quark.world.feature.Basalt;

public class BlockWorldStoneBricks extends BlockMetaVariants {

	public BlockWorldStoneBricks() {
		super("world_stone_bricks", Material.ROCK, Variants.class);
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override
	public boolean shouldDisplayVariant(int variant) {
		return !ModuleLoader.isFeatureEnabled(Basalt.class) ? variant != 3 : true;
	}

	public enum Variants implements EnumBase {
		STONE_GRANITE_BRICKS,
		STONE_DIORITE_BRICKS,
		STONE_ANDESITE_BRICKS,
		STONE_BASALT_BRICKS;
	}

}
