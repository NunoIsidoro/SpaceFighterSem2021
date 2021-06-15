package ipca.example.spacefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var gameView : GameView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        gameView = GameView(this)
        setContentView(R.layout.activity_main)
    }
}