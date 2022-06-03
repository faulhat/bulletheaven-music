package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;

public class Serenity implements Song {
    public Pattern getPattern()
    {
        // Serenity mode theme
        // Literally just the first two bars of Gymnopedie No. 1
        Pattern song = new Pattern("T80 V0 rq D4h+B4h+F5h | rq A4h+C5h+F5h")
                                .add("  V1 G3hq           | D3hq")
                                .repeat(4);

        return song;
    }
}
