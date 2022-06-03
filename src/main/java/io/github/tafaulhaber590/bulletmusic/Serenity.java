package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;

public class Serenity extends Song {
    public Pattern getPattern()
    {
        // Serenity mode theme
        // Literally just the first two bars of Gymnopedie No. 1
        Pattern song = new Pattern("T80 V0 rq D4h+B4h+F#5h | rq A4h+C#5h+F#5h")
                                .add("  V1 G3hq            | D3hq")
                                .repeat(4);

        return song;
    }
}
