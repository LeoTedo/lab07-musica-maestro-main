package it.unimi.di.prog2.musica;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    IronRod ir = new IronRod();
    MusicalInstrument t = new Trumpet();
    MusicalInstrument h = new Horn();
    MusicalInstrument trombaforte = new Trumpet();
    MusicalInstrument g = new WaterGlassInstrument();
    MusicalInstrument i = new GermanMusicalInstrument(ir);
    MusicalInstrument f = new Fortissimo(trombaforte);
    ArrayList<MusicalInstrument> instruments = new ArrayList<>() {{
      add(t);
      add(h);
      add(g);
      add(i);
      add(f);
    }};
    System.out.println(instruments.size());
    //instruments.add(t);
    //instruments.add(h);
    //instruments.add(g);
    //instruments.add(i);
    Orchestra o = new Orchestra(instruments);
    System.out.println(o.play());
    //System.out.println(t.play());
    //System.out.println(g.play());
    //System.out.println(i.play());
    //System.out.println("Musica Maestro!!!");
  }
}
