package it.unimi.di.prog2.musica;

import org.jetbrains.annotations.NotNull;

public class WaterGlassInstrument extends WaterGlass implements MusicalInstrument{

    @Override
    public @NotNull String play() {
       return this.tap();
    }
}
