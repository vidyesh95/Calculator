package com.astralai.calculator

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.astralai.calculator.ui.theme.Begonia
import com.astralai.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    CalculatorTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MyLayout()
        }
    }
}

@Composable
fun MyLayout() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ) {
                SelectionContainer(modifier = Modifier) {
                    Text(
                        text = "123,554,322,434,345\n+253,456,343",
                        fontSize = 40.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .padding(horizontal = 24.dp)
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .alpha(1f)
                    )
                }
                SelectionContainer(modifier = Modifier) {
                    Text(
                        text = "=123,554,322,434,345",
                        fontSize = 30.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .padding(horizontal = 24.dp, vertical = 16.dp)
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .alpha(0.6f),
                    )
                }
            }
        }

        Divider(modifier = Modifier.padding(horizontal = 24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "AC", fontSize = 30.sp, color = Begonia)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "<-", fontSize = 30.sp, color = Begonia)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "%", fontSize = 30.sp, color = Begonia)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "÷", fontSize = 30.sp, color = Begonia)
                    }
                }

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "7", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "8", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "9", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "×", fontSize = 30.sp, color = Begonia)
                    }
                }

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "4", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "5", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "6", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "-", fontSize = 30.sp, color = Begonia)
                    }
                }

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "1", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "2", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "3", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "+", fontSize = 30.sp, color = Begonia)
                    }
                }

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "VC", fontSize = 30.sp, color = Begonia)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "0", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = ".", fontSize = 30.sp)
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "=", fontSize = 30.sp)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(showBackground = true, name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun DefaultPreview() {
    MyApp()
}
