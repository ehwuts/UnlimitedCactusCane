package yeoldesoupe.unlimitedcactuscane.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Constant;

@Mixin(value = {net.minecraft.block.SugarCaneBlock.class, net.minecraft.block.CactusBlock.class})
public abstract class TallboyVegetationMixin {
	@ModifyConstant(method = "randomTick", constant = @Constant(intValue = 3))
	private int maxint(int x) {
		return Integer.MAX_VALUE;
	}
}
