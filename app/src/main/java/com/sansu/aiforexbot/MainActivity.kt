package com.sansu.aiforexbot

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val screen = TextView(this)
        screen.text = "Sansu Real Forex Bot\n\nExness Demo\nXAUUSD\n\nBot: STOPPED"
        screen.textSize = 22f

        setContentView(screen)
    }
}
