package yeoldesoupe.unlimitedcactuscane.mixin;

import net.minecraft.block.CactusBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CactusBlock.class)
public class CactusBlockMixin {
	@Inject(at = @At("HEAD"), method = "randomTick")
	public void randomTick(CallbackInfo info) {
		System.out.println("Cactus!");
	}
}
