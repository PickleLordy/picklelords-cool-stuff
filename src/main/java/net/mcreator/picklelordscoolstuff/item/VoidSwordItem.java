
package net.mcreator.picklelordscoolstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.picklelordscoolstuff.PicklelordsCoolStuffModElements;

@PicklelordsCoolStuffModElements.ModElement.Tag
public class VoidSwordItem extends PicklelordsCoolStuffModElements.ModElement {
	@ObjectHolder("picklelords_cool_stuff:void_sword")
	public static final Item block = null;
	public VoidSwordItem(PicklelordsCoolStuffModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(VoidMetalItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("void_sword"));
	}
}
