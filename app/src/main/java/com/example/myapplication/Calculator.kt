package com.example.myapplication
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.theme.Accent
import com.example.myapplication.ui.theme.Button


@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 12.dp,
    modifier: Modifier,
) {
    val viewModel = viewModel<CalculatorViewModel>()
    Box(modifier = modifier) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(12.dp)
            ,
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)

        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
                )

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .background(Button)
                    ,
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)

                        .background(Button)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)

                        .background(Button)
                        .weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .background(Button)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .background(Button)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .background(Accent)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .background(Button)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Subtract))

                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {

                        viewModel.onEvent(CalculatorEvent.Number(0))
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Calculate)
                    }
                )
            }
        }
    }
}


