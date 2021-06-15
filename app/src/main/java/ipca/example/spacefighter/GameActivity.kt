package ipca.example.spacefighter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    var gameView : GameView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val display = windowManager.defaultDisplay

        val size = Point()
        display.getSize(size)
        gameView = GameView(this)
        setContentView(gameView)
    }

    override fun OnPause(){


    }
}