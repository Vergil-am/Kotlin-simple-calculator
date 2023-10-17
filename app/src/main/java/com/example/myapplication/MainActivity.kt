package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.theme.Background
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val buttonSpacing: Dp = 12.dp
                val state = viewModel.state
                Calculator(
                    state = state,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Background)
                    ,
                    buttonSpacing = buttonSpacing,
                )
                }
            }
        }
}




