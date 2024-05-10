
//Pacote do projeto
package com.example.restaurante

//importação das bibliotecas que serão usadas
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

//criação da classe principal
class SplashActivity : AppCompatActivity() {
    //função onde acontece a parte do Splash
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //colocação do layout dessa atividade
        setContentView(R.layout.activity_splash)

        //método que cria a variável i que foi usada na MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            //variável i
            val i = intent
            //variável j que liga esta tela
            val j = Intent(this,PedidoActivity::class.java)
            j.putExtras(i)
            //começo da execução da tela
            startActivity(j)
        },2000)

    }
}