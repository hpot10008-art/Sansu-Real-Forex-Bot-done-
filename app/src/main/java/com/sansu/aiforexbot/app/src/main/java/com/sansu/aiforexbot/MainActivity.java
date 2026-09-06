package com.sansu.aiforexbot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView screen = new TextView(this);
        screen.setText("Sansu Real Forex Bot\n\nExness Demo\nXAUUSD\n\nBot: STOPPED");
        screen.setTextSize(22);

        setContentView(screen);
    }
}
