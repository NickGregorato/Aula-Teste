package com.example.aulateste

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aulateste.ui.theme.AulaTesteTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //declarando o author e o texto da mensagem
            MessageCard(Message("Nick","Hey!"))
        }
    }
}
//criando a classe message com duas variáveis: author e body
data class Message(val author:String, val body: String)

@Composable
fun MessageCard(msg: com.example.aulateste.Message) {
    //adicionando borda a mensagem
    Row(modifier = Modifier.padding(all = 8.dp)) {
        //Colocando a imagem
        Image(
            //Colocando a imagem do diretorio
            painter = painterResource(R.drawable.cat_photo),
            //Descrevendo o conteúdo
            contentDescription = "Cat photo",

            modifier = Modifier
                .size(40.dp)    //Definindo o tamanho da imagem
                .clip(CircleShape)  //Definindo o formato
        )
        //Adicionando um espaço entre a imagem e a coluna
        Spacer(modifier = Modifier.width(8.dp))

        Column  {
            //texto do author
            Text(text = msg.author)

            //Adicionando espaço entre o author e o texto da mensagem
            Spacer(modifier = Modifier.height(4.dp))

            //texto da mensagem
            Text(text = msg.body)
        }
    }
}
//preview do projeto
@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(
        msg = Message("Nick","Hey!")
    )
}
