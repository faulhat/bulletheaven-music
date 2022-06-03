package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public abstract class Song {
    public abstract Pattern getPattern();

    public void play()
    {
        new Player().play(getPattern());
    }
}
