package reborncore.client.gui.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class SlotInput extends BaseSlot {

	public SlotInput(IInventory par1iInventory, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
	}

	public boolean isItemValid(ItemStack par1ItemStack) {
		return true;
	}

	public int getSlotStackLimit() {
		return 64;
	}

	@Override
	public boolean canWorldBlockRemove() {
		return false;
	}
}
