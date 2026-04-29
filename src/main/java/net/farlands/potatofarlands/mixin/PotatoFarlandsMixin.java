package net.farlands.potatofarlands.mixin;

import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(OctavePerlinNoiseSampler.class)
public class PotatoFarlandsMixin {
	@Overwrite
    public static double maintainPrecision (double d) {return d;}
}