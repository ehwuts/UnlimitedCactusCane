package yeoldesoupe.unlimitedcactuscane.mixin;

import net.minecraft.block.SugarCaneBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Constant;

@Mixin(SugarCaneBlock.class)
public class SugarCaneBlockMixin {
	@ModifyConstant(method = "randomTick", constant = @Constant(intValue = 3))
	private int maxint(int x) {
		return Integer.MAX_VALUE;
	}
}
