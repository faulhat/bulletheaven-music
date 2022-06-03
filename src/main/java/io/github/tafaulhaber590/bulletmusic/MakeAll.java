package io.github.tafaulhaber590.bulletmusic;

import java.io.File;
import java.io.IOException;

import org.jfugue.midi.MidiFileManager;

public class MakeAll {
    public static final String OUT = "out/";

    public static void saveSong(Song song, File file) throws IOException
    {
        MidiFileManager.savePatternToMidi(song.getPattern(), file);
    }

    public static void main(String[] args)
    {
        try {
            File file = new File(OUT + "main.mid");
            saveSong(new MainTheme(), file);

            file = new File(OUT + "boss.mid");
            saveSong(new BossTheme(), file);

            file = new File(OUT + "serene.mid");
            saveSong(new Serenity(), file);

            file = new File(OUT + "title.mid");
            saveSong(new Warsawian(), file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
