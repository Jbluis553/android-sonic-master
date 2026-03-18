package com.sonic.equalizer;

import android.media.audiofx.Equalizer;
import android.media.audiofx.BassBoost;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;

public class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private Equalizer mEqualizer;
    private BassBoost mBass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ID 0 aplica el efecto a toda la salida de audio del sistema
        initAudioEngine(0);
    }

    private void initAudioEngine(int sessionId) {
        // Configuración de Ecualizador Dinámico
        mEqualizer = new Equalizer(0, sessionId);
        mEqualizer.setEnabled(true);

        // Preset optimizado para Trap/HipHop (Curva en V)
        short bands = mEqualizer.getNumberOfBands();
        if (bands > 0) {
            mEqualizer.setBandLevel((short)0, (short)1000); // Graves profundos
            mEqualizer.setBandLevel((short)4, (short)800);  // Brillo nítido
        }

        // Configuración de Refuerzo de Bajos (Bass Boost)
        mBass = new BassBoost(0, sessionId);
        mBass.setStrength((short)1000); // 100% de potencia
        mBass.setEnabled(true);
    }
}

