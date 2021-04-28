package yeoldesoupe.unlimitedcactuscane.mixin;

import net.minecraft.block.CactusBlock;
import net.minecraft.block.SugarCaneBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Constant;

@Mixin(value = {SugarCaneBlock.class, CactusBlock.class})
public abstract class TallboyVegetationMixin {
	@ModifyConstant(method = "randomTick", constant = @Constant(intValue = 3))
	private int maxint(int x) {
		return Integer.MAX_VALUE;
	}
}
