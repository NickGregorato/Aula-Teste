package com.example.aulateste

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulateste.ui.theme.AulaTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //O setContent "abriga e chama" a função/método MessageCard
        setContent {
            //MessageCard recebe um nome e configura o elemento de texto com esse nome.
            MessageCard("World")
            }
        }
    }
//Torna uma função composta.
 @Composable
//O MessageCard está recebendo um parâmetro.
 fun MessageCard(name: String){
     Text(text = "Hello $name!")
 }
//Com o Preview você visualiza as composições no Android.
@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard("World")
}

