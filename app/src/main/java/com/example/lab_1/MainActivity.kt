package com.example.lab_1

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab_1.ui.theme.Lab_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_1Theme {
                Column(
                    Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier.padding(vertical = 20.dp),
                        text = stringResource(R.string.FIO),
                        color = Color.Blue,
                        style = TextStyle(
                            fontSize = 35.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                    Text(
                        modifier = Modifier.padding(vertical = 20.dp),
                        text = stringResource(R.string.speciality),
                        color = Color.Blue,
                        style = TextStyle(
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center
                        )
                    )
                    Text(
                        modifier = Modifier.padding(vertical = 20.dp),
                        text = stringResource(R.string.group),
                        color = Color.Blue,
                        style = TextStyle(
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    var isPortrait =
                        LocalConfiguration.current.orientation == Configuration.ORIENTATION_PORTRAIT

                    Text(
                        modifier = Modifier.padding(all = 15.dp),
                        text = if (isPortrait) "Portrait view" else "Landscape view"
                    )
                }
            }
        }
    }
}
