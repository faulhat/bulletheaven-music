package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.ChordProgression;

public class BossTheme implements Song {
    public Pattern getPattern()
    {
        // The boss fight theme
        // Original work
        Pattern drums = new Rhythm("*......O*......O").getPattern().setTempo(200).repeat(12);

        Pattern bass = new Pattern("V1 I[ELECTRIC_BASS_PICK] G3i  G3i  G3i  G3i  G3i  G3i  F3i F3i")
                                .repeat(2)
                                .add(
                                    new Pattern(            "Ab3i Ab3i Ab3i Ab3i Ab3i Ab3i G3i G3i")
                                        .repeat(2)
                                )
                                .repeat(6);
        Pattern chords = new ChordProgression("I VI").setKey("C").allChordsAs("V2 $0ww $1ww").getPattern().repeat(6);
        Pattern mainPattern = new Pattern("T200").add(drums, bass, chords);

        return mainPattern;
    }
}
