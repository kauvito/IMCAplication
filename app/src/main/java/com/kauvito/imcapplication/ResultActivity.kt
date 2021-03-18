package com.kauvito.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Log.w("lifecicle", "Create - criando a tela")
        //finish() //Finaliza a aplicação direto, não passa pelo ciclo de vida
    }
    override fun onStart() {
        super.onStart()
        Log.w("lifecicle", "Start - tela visual criada")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecicle", "Resume - é possivel interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecicle", "Pause - não é possivel interagir com a tela, perdeu o foco")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecicle", "Stop - a tela não esta mais visivel, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecicle", "\nRestart - a tela esta retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecicle", "\nDestroy - a tela foi destruida")
    }
}