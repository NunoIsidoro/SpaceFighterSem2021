package ipca.example.spacefighter

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView

class GameView: SurfaceView, Runnable {

    var playing = false

    var gameThread : Thread? = null

    lateinit var player : Player
    lateinit var surfaceHolder: SurfaceHolder
    lateinit var canvas: Canvas
    lateinit var paint: Paint

    private fun init(context: Context, with : Int, height : Int){
        player = Player(context, with, height)

        for (i in 1..100) {
            stars.add(Star(context, with, height))
        }
    }

    constructor(context : Context?, with: Int, height: Int) : super(context) {
        init(context!!, with, height)
    }

    constructor(context : Context?, with: Int, height: Int) : super(context) {
        init(context!!, with, height)
    }

    override fun run() {
        while (playing) {
            update()
            draw()
            control()
        }
    }

    fun update() {
        player.update()

        for (s )
    }

    fun draw() {
        if (surfaceHolder.surface.isValid) {
            canvas = surfaceHolder.lockCanvas()
            canvas.drawColor(Color.BLACK)

            paint.color = Color.WHITE
            for (s in stars) {
                paint.strokeWidth = s.getStartWidth
            }

            canvas.drawBitmap(player.bitmap,
                player.x.toFloat(),
                player.y.toFloat(), paint)



            surfaceHolder.unlockCanvasAndPost(canvas)
        }
    }

    fun control() {
        Thread.sleep(17)
    }

    fun pause() {
        playing = false
        gameThread?.join()
    }

    fun resume() {
        playing = true
        gameThread = Thread(this)
        gameThread?.start()
    }

    override fun OnTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN
        }
    }
}