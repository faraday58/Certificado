package com.mexiti.certificado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mexiti.certificado.ui.theme.CertificadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CertificatingCourse("Jorge Armando Rodríguez Vera")
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre: String, modifier: Modifier = Modifier) {

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Image(
                    painter = painterResource(id = R.drawable.escudounam_negro)
                    , contentDescription = null,
                    modifier = modifier.size(50.dp,50.dp)

                )
                Text(text = "Departamento de Desarrollo")
                Image(painter = painterResource(id = R.drawable.escudofi_negro), contentDescription = null,
                    modifier = modifier.size(50.dp,50.dp)
                )

            }
            Spacer(modifier = modifier.height(20.dp))
            Text(
                text = "This certicate is presented to:",
                modifier = modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

              Box(
                contentAlignment = Alignment.Center,
                modifier = modifier
                    .fillMaxWidth()
            )

            {
                Image(
                    painter =
                painterResource(id = R.drawable.android_fondo) ,
                    contentDescription =null,
                    modifier = modifier.fillMaxWidth(),
                    alpha = 0.1F
                )
                Text(
                    text = nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth()
                )
            }
            Spacer(
                modifier = modifier
                    .height(20.dp)
            )
            Text(text = "has successfully completed a 2 hours course on")
            Text(text = "Android",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(
                modifier = modifier
                    .height(50.dp)
            )

            Row(
                modifier =
                    modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(painter = painterResource(id = R.drawable.signature_1) ,
                        contentDescription =  null,
                        modifier = modifier.
                    size(50.dp,50.dp))
                    Text(text = "Julian Álvarez",
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = "Representatives")

                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(painter = painterResource(id = R.drawable.signature_2) ,
                        contentDescription =  null,
                        modifier = modifier.
                        size(50.dp,50.dp))
                    Text(text = "Dark Lord",
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = "Representatives")


                }
            }


        }

}


@Preview(showBackground = true)
@Composable
fun CertificatingCoursePreview() {
    CertificadoTheme {
        CertificatingCourse("Jorge Armando Rodríguez Vera")
    }
}