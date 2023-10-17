package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Background

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = Background,
        ),
        modifier = Modifier
            .clip(CircleShape)
            .then(modifier)
        ) {
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.White
            )
    }
}