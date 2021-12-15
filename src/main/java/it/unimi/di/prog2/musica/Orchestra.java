package it.unimi.di.prog2.musica;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class Orchestra implements MusicalInstrument{
    private Collection<MusicalInstrument> instruments;
    public Orchestra(@NotNull Collection<MusicalInstrument> instruments){
        this.instruments = instruments;
    }
    @Override
    public @NotNull String play() {
        String musica = "";
        for (MusicalInstrument s:
             instruments) {
           musica += s.play() + "\n";
        }
        return musica;
    }
}
