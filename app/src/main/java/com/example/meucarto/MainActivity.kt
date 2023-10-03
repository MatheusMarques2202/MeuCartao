package com.example.meucarto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meucarto.ui.theme.MeuCartãoTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuCartãoTheme {
                textoCartao()
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun textoCartao() {

    Box {


        Image(
            painter = painterResource(id = R.drawable.dia_do_programador),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                text =
                "Feliz dia do programador ",
                fontSize = 70.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Cursive,
                color = Color.White,
                lineHeight = 100.sp,
                modifier = Modifier.padding(top = 150.dp)

            )
            Dedicatorio(nomes = "de prof ")
            Dedicatorio(nomes = "para matheus")
            


        }
    }
}

@Composable
fun Dedicatorio(nomes:String){
    Text(
        text = nomes,
        fontSize = 40.sp,
        fontFamily = FontFamily.Cursive,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, bottom = 30.dp),


        )
    
}
