package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;
import org.jfugue.rhythm.Rhythm;

public class MainTheme extends Song {
    public Pattern getPattern()
    {
        // The main overworld theme
        // Original work
        Rhythm rhythm = new Rhythm(".O..O^...OOOO^.^");
        Pattern drums = rhythm.getPattern().repeat(8);

        Pattern melody = new Pattern(  "ri A4q ri B4i C5i B4i ri | A4q A4i B4q C5i B4i ri")
                                .add(  "ri G4q ri A4i B4i A4i ri | G4q G4i A4q B4i A4i ri");
        Pattern harmony1 = new Pattern("ri G5q ri A5i B5i A5i ri | G5q G5i A5q B5i A5i ri");
        Pattern harmony = new Pattern(harmony1)
                                .add(  "ri A5q ri B5i C6i B5i ri | A5q A5i B5q C6i B5i ri");


        Pattern full = new Pattern("V0 rw")
                                    .repeat(4)
                                    .add(melody.repeat(7))
                                    .add(new Pattern("V1 I[SQUARE] rw").repeat(10))
                                    .add(harmony.repeat(6))
                                    .add(harmony1)
                                    .add(drums)
                                    .setTempo(180);
        
        return new Pattern(full, drums);
    }
}
