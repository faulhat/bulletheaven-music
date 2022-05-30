package io.github.tafaulhaber590.bulletmusic;

import org.jfugue.player.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player player = new Player();
        player.play("Eq Eq Fq Gq | Gq Fq Eq Dq | Cq Cq Dq Eq | Eqi Di Dq rq "
                  + "Eq Eq Fq Gq | Gq Fq Eq Dq | Cq Cq Dq Eq | Dqi Ci Cq");
    }
}
