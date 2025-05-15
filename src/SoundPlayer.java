import java.io.File;
import javax.sound.sampled.*;

public class SoundPlayer {
public static void playSound(String path) {
    new Thread(() -> {
        try {
            File file = new File(path);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }).start();
}

}
