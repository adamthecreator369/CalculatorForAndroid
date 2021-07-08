/* Name: SoundEffects.java
 * Author: Adam B. Jost
 * Course: CPT-160 Section 80
 * Language: Java
 * Project: Calculator
 * Date: 4/29/2021
 */

package adamjost.calculator;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

import java.util.ArrayList;

public class SoundEffects {

    private static SoundEffects soundEffects;
    private SoundPool soundPool;
    private ArrayList<Integer> sounds;
    private int soundIndex;
    private int calculationSound;

    private SoundEffects(Context context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes attributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .build();
        }
        else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }

        sounds = new ArrayList<>();
        sounds.add(soundPool.load(context, R.raw.beep1, 1));
        sounds.add(soundPool.load(context, R.raw.beep2, 1));
        sounds.add(soundPool.load(context, R.raw.beep3, 1));

        calculationSound = soundPool.load(context, R.raw.calcbeep, 1);

        resetTones();
    }

    public static SoundEffects getInstance(Context context) {
        if (soundEffects == null) { soundEffects = new SoundEffects(context); }
        return soundEffects;
    }

    public void resetTones() {
        soundIndex = -1;
    }

    public void playTone(boolean advance_sound_index) {

        if (advance_sound_index) { soundIndex++; }
        else { soundIndex--; }

        if (soundIndex < 0) { soundIndex = 0; }
        else if (soundIndex >= sounds.size()) { soundIndex = 0; }

        soundPool.play(sounds.get(soundIndex), 1, 1, 1,
                0, 1);
    }

    public void play_calculate_sound() {

        soundPool.play(calculationSound, 0.5f,
                0.5f, 1, 0, 1);
    }

}