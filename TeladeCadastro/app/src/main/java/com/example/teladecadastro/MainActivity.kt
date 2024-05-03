package com.example.teladecadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teladecadastro.ui.theme.TelaDeCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaDeCadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}


@Composable
fun App() {


    // POSICIONAR ELEMENTOS EM UMA COLUNA
    Column(
        Modifier
            .fillMaxWidth() // FAZER PEGAR TODA A TELA (COLUNA) INDEPENDENTE DO DISPOSITIVO
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,

    )
        {
            Row(
                Modifier
                    .padding(40.dp)
                    .fillMaxWidth()   // FAZER PEGAR TODA A TELA (COLUNA) INDEPENDENTE DO DISPOSITIVO
                    .background(Color.Black),
                Arrangement.Center

            ) {
                var text by remember { mutableStateOf("") }
                Text(
                    text = "App de Cadastro",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp,
                    color = Color.White
                )
            }

                            Row(
                                Modifier
                                    .padding(8.dp)
                                ) {
                                var text by remember { mutableStateOf("") }
                                    TextField(
                                        value = text ,
                                        onValueChange = {text = it },
                                        label = { Text("Nome:")})
                            }

                            Row(
                                Modifier
                                    .padding(8.dp)
                            ) {
                                var text by remember { mutableStateOf("") }
                                TextField(
                                    value = text ,
                                    onValueChange = {text = it },
                                    label = { Text("Endereço:")})
                            }

                            Row(
                                Modifier
                                    .padding(8.dp)
                            ) {
                                var text by remember { mutableStateOf("") }
                                TextField(
                                    value = text,
                                    onValueChange = { text = it },
                                    label = { Text("Bairro:") })
                            }

                            Row(
                                Modifier
                                    .padding(8.dp)
                            ) {
                                var text by remember { mutableStateOf("") }
                                TextField(
                                    value = text,
                                    onValueChange = { text = it },
                                    label = { Text("CEP:") }
                                )
                            }

                            Row(
                                Modifier
                                    .padding(8.dp)
                            ) {
                                var text by remember { mutableStateOf("") }
                                TextField(
                                    value = text,
                                    onValueChange = { text = it },
                                    label = { Text("Cidade:") })
                            }

                            Row(
                                Modifier
                                    .padding(8.dp)
                            ) {
                                var text by remember { mutableStateOf("") }
                                TextField(
                                    value = text,
                                    onValueChange = { text = it },
                                    label = { Text("Estado:") })
                            }

                                    // CRIAÇÃO DO BOTÃO
                                    Row (
                                        Modifier
                                            .padding(8.dp)

                                    ) {
                                        Button (onClick = {}){
                                            Text(text = "Enviar Dados")
                                    }
            }
        }
    }



//CRIA UM PREVIW DA VISÃO APP, PARA VISUALIZAR NO LADO//
@Composable
@Preview
fun AppPreview() {
    TelaDeCadastroTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App()
        }
    }
}




