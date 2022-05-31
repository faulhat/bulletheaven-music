package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

/**
 * Hello world!
 *
 */
public class Song1 
{
    public static void main( String[] args )
    {
        Pattern bass = new Pattern("Ab3i Ab3i Bb3q Ab3q Ab3i Ab3i | Ab3i Ab3i Bb3q Ab3q Ab3i Ab3i");
        bass.add("F3i F3i G3q F3q F3i F3i | F3i F3i G3q F3q F3i F3i");
        bass.setInstrument("ELECTRIC_BASS_PICK");
        bass.setTempo(300);

        Rhythm percussion = new Rhythm("OOO.O.OOOOO.O.OO");
        Pattern percPattern = percussion.getPattern().setTempo(300);

        Player player = new Player();
        player.play(bass.repeat(4), percPattern.repeat(8));
    }
}
