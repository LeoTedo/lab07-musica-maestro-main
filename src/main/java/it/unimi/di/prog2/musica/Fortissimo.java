package it.unimi.di.prog2.musica;

import org.jetbrains.annotations.NotNull;

public class Fortissimo implements MusicalInstrument{
   MusicalInstrument f;
    public Fortissimo(MusicalInstrument musicalInstrument){
        this.f = musicalInstrument;
    }
    @Override
    public @NotNull String play() {
        return f.play().toUpperCase();
    }
}
