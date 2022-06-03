package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;

public class Warsawian implements Song {
    public Pattern getPattern()
    {
        // The main title theme
        // A copy of the Polish song "Whirlwinds of Danger"
        Pattern song = new Pattern("T240 I[SQUARE]   D5q D5is C5s Bb4q Bb4is A4s")
                                               .add("G4q G4is F#4s G4q Bb4q")
                                               .add("A4q D5is D5s D5i C5i Bb4i A4i")
                                               .add("G4i A4i Bb4i C5i D5h")

                                               .add("D5q D5is D5s G5q D5is C5s")
                                               .add("Bb4q Bb4is A4s G4q Bb4q")
                                               .add("A4q D5is D5s D5i C5i Bb4i A4i")
                                               .add("G4q Bb4is A4s G4q A4q")

                                               .add("Bb4q Bb4is Bb4s F4q Bb4q")
                                               .add("C5q C5is C5s F4q C5q")
                                               .add("C5q C5is C5s F5i Eb5i D5i C5i")
                                               .add("D5q D5is D5s D5q D5q")

                                               .add("D5q D5is D5s G5q D5is C5s")
                                               .add("Bb4q Bb4is A4s G4q Bb4q")
                                               .add("A4q D5is D5s D5i C5i Bb4i A4i")
                                               .add("G4q Bb4is A4s G4q rq")
                                               .repeat(3);

        return song;
    }
}
