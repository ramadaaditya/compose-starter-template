package com.ramada.composestartertemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ramada.composestartertemplate.ui.App
import com.ramada.composestartertemplate.ui.theme.ComposeStarterTemplateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeStarterTemplateTheme {
                App()
            }
        }
    }
}
