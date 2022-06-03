package io.github.tafaulhaber590.bulletmusic;

public class Jukebox {
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println(" Not enough args");
        }
        else if (args[0].equalsIgnoreCase("Boss"))
        {
            new BossTheme().play();
        }
        else if (args[0].equalsIgnoreCase("Main"))
        {
            new MainTheme().play();
        }
        else if (args[0].equalsIgnoreCase("Serene"))
        {
            new Serenity().play();
        }
        else if (args[0].equalsIgnoreCase("Warsaw"))
        {
            new Warsawian().play();
        }
        else {
            System.out.println("Please provide the name of a song.");
        }
    }
}
