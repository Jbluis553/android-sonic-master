package com.sonic.equalizer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.media.audiofx.Equalizer;

public class MainActivity extends AppCompatActivity {
    private Equalizer mEqualizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Aquí inicializaremos el motor de audio
        mEqualizer = new Equalizer(0, 0);
        mEqualizer.setEnabled(true);
    }
}
