
package net.mcreator.picklelordscoolstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.picklelordscoolstuff.PicklelordsCoolStuffModElements;

@PicklelordsCoolStuffModElements.ModElement.Tag
public class VoidSwordHandleItem extends PicklelordsCoolStuffModElements.ModElement {
	@ObjectHolder("picklelords_cool_stuff:void_sword_handle")
	public static final Item block = null;
	public VoidSwordHandleItem(PicklelordsCoolStuffModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("void_sword_handle");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
