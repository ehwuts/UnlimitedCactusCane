package yeoldesoupe.unlimitedcactuscane.mixin;

import net.minecraft.block.CactusBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Constant;

@Mixin(CactusBlock.class)
public class CactusBlockMixin {
	@ModifyConstant(method = "randomTick", constant = @Constant(intValue = 3))
	private int maxint(int x) {
		return Integer.MAX_VALUE;
	}
}
