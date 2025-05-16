import javax.sound.sampled.*;

public class SoundPlayer {

    private static Clip bounceClip;
    private static Clip scoreClip;

    static {
        try {
            bounceClip = AudioSystem.getClip();
            AudioInputStream bounceAudio = AudioSystem.getAudioInputStream(
                SoundPlayer.class.getResourceAsStream("/sounds/bounce.wav"));
            bounceClip.open(bounceAudio);

            scoreClip = AudioSystem.getClip();
            AudioInputStream scoreAudio = AudioSystem.getAudioInputStream(
                SoundPlayer.class.getResourceAsStream("/sounds/score.wav"));
            scoreClip.open(scoreAudio);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playBounce() {
        if (bounceClip.isRunning()) {
            bounceClip.stop();  // ferma se sta ancora suonando
        }
        bounceClip.setFramePosition(0); // torna all'inizio
        bounceClip.start();
    }

    public static void playScore() {
        if (scoreClip.isRunning()) {
            scoreClip.stop();
        }
        scoreClip.setFramePosition(0);
        scoreClip.start();
    }
}
