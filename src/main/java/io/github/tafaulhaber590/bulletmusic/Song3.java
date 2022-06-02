package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

public class Song3 {
    public static void main(String[] args)
    {
        Pattern drums = new Rhythm("...S....O").getPattern().repeat(8);
        Pattern song = new Pattern("X[Volume]=2000 T120 I[SAWTOOTH] D5q D5is C5s Bb4q Bb4is A4s")
                                               .add("G4q G4is F#4s G4q Bb4q")
                                               .add("A4q D5is D5s D5i C5i Bb4i A4i")
                                               .add("G4i A4i Bb4i C5i D5h")
                                               .add("D5q D5is D5s G5q D5is C5s")
                                               .add("Bb4q Bb4is A4s G4q Bb4q")
                                               .add("A4q D5is D5s D5i C5i Bb4i A4i")
                                               .add("G4q Bb4is A4s G4q Bb4q")
                                               .add(drums)
                                               .repeat(2);

        Player player = new Player();
        player.play(song);
    }
}
