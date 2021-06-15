package ipca.example.spacefighter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class Player {

    var x = 0
    var y = 0
    var speed = 0

    var boosting = false

    var maxX = 0
    var maxY = 0
    var minX = 0
    var minY = 0

    var bitmap : Bitmap

    private final val MAX_SPEED = 20
    private final val MIN_SPEED = 1

    private final val GRAVITY = -10

    constructor( context : Context, widht : Int, height : Int) {
        x = 75
        y = 50
        speed = 1
        bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.player)

        maxY = height - hitmap.height
        minY = 0
    }

    fun Update () {
        if (boosting) speed += 2
        else speed -= 5
        if (speed > MAX_SPEED) speed = MAX_SPEED
        if (speed < MIN_SPEED) speed = MIN_SPEED

        y -= speed + GRAVITY

        if (y > maxY) y = maxY
        if (y < minY) y = minY
    }

}