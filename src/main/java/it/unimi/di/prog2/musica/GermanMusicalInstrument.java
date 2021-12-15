package it.unimi.di.prog2.musica;

import org.jetbrains.annotations.NotNull;

public class GermanMusicalInstrument extends IronRod implements MusicalInstrument{
    private final IronRod ironRod;
    public GermanMusicalInstrument(IronRod ironRod){
        this.ironRod = ironRod;
        assert ironRod != null;
    }
    @Override
    public @NotNull String play() {
        return ironRod.spiel();
    }
}
