package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;

public class Serenity extends Song {
    public Pattern getPattern()
    {
        // Serenity mode theme
        // Literally just the first two bars of Gymnopedie No. 1
        Pattern song = new Pattern("T80 V0 rq D3h+B3h+F#4h | rq A3h+C#4h+F#4h")
                                .add("  V1 G3hq            | D3hq")
                                .repeat(4);

        return song;
    }
}
