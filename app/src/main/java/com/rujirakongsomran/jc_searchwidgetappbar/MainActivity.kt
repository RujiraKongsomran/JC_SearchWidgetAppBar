package com.rujirakongsomran.jc_searchwidgetappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.rujirakongsomran.jc_searchwidgetappbar.ui.theme.JC_SearchWidgetAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_SearchWidgetAppBarTheme {

            }
        }
    }
}