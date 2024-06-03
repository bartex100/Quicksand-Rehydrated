package net.mokai.quicksandrehydrated.block.quicksands.core;
import net.minecraft.world.level.block.state.BlockState;

public interface QuicksandInterface {
    double getBubblingChance();
    double getOffset(BlockState blockstate);
    //String getTex();
    String coverageTexture();
}
