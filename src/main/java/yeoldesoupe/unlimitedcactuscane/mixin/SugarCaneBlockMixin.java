package yeoldesoupe.unlimitedcactuscane.mixin;

import net.minecraft.block.SugarCaneBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SugarCaneBlock.class)
public class SugarCaneBlockMixin {
	@Inject(at = @At("HEAD"), method = "randomTick")
	public void randomTick(CallbackInfo info) {
		System.out.println("Sugar Cane!");
	}
}
