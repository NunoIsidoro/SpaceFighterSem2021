package ipca.example.spacefighter

import kotlin.random.Random

class Star {

    var x = 0
    var y = 0
    var speed = 0
    var maxX = 0
    var minX = 0
    var maxY = 0
    var minY = 0



    fun update (playerSpeed : Int) {
        x -= playerSpeed
        x-= speed

        if (x < 0) {
            x = maxX

            val generator = Random()
            y = generator.nextInt(maxY)
            speed = generator.nextInt(15)
        }
    }

    fun getStartingWidth() : Float {

    }
}