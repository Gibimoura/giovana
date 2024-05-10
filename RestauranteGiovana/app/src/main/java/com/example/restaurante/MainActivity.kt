
//Pacote do projeto
package com.example.restaurante

//importação das bibliotecas que serão usadas
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

//criação da classe principal do arquivo
class MainActivity : AppCompatActivity() {

    //variável que será usada
    private lateinit var binding:ActivityMainBinding

    //função principal do evento
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //criação da variável username
        val username = intent.extras?.getString("username")

        //verificação do preenchimento do campo
        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
        }

        //criação da função que fecha a App
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }

        //função de evento que ativa a funcionalidade do mouse
        binding.buttonPedir.setOnClickListener {

            //atribuição de valor a uma variável que está na classe SplashActivity
            val i = Intent(this, SplashActivity::class.java)
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.toString())
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.toString())
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.toString())
          //iniciaçização da atividade Splash
            startActivity(i)
            //finalização da atividade Main
            finish()
        }

//função de evento que ativa funcionalidade de mouse
        binding.checkPizza.setOnClickListener {
            //verificação se a checkbox do item Pizza está selecionado
            if(binding.checkPizza.isChecked()){
                //caso verdadeiro
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            }else{
                //caso for falsa
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        //função de evento que adiciona uma funcionalidade de mouse
        binding.checkSalada.setOnClickListener {
            //verificação se a checkbox do item Salada está selecionado
            if(binding.checkSalada.isChecked()){
                //caso verdadeiro
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            }else{
                //caso contrário
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        //função de evento que adiciona uma funcionalidade de mouse
        binding.checkHamburger.setOnClickListener {
            //verificação se a checkbox do item Hamburger está selecionado
            if(binding.checkHamburger.isChecked()){
                //caso verdadeiro
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            }else{
                //caso contrário
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }

    }
}