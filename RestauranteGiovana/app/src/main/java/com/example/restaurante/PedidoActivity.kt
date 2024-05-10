
//Pacote do projeto
package com.example.restaurante

//importação das bibliotecas que serão usadas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//criação da classe principal desta atividade
class PedidoActivity : AppCompatActivity() {
    //funçao principal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //colocação do layout nesta atividade
        setContentView(R.layout.activity_pedido)
    }
}