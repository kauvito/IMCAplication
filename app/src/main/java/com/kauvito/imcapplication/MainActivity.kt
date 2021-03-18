package com.kauvito.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setListeners()

    }

    private fun setListeners(){
        alturaEDT?.doAfterTextChanged { text ->
        }

        pesoEDT?.doOnTextChanged { text, _, _, _ ->
        }

        calcularBTN?.setOnClickListener{
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura :String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null &&  altura != null){
            val imc = peso /(altura * altura)
            titleTXT.text = "Seu IMC é de %.2f".format(imc)
        }
    }
}