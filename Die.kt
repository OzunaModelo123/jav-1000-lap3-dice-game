import kotlin.random.Random

enum class DieType(val typeName: String) {
    D4("d4"),
    D6("d6"),
    D8("d8"),
    D10("d10"),
    D12("d12"),
    D20("d20"),
    D100("d100")
}

class Die(private var type: DieType = DieType.D6, private var sides: Int = 6) {
    private var currentSide: Int = 0

    init {
        roll()
    }

    fun roll(): Int {
        currentSide = Random.nextInt(1, sides + 1)
        return currentSide
    }

    fun getCurrentSide(): Int {
        return currentSide
    }
}

class DiceGame {
    fun playGame() {
        val die1 = Die()
        val die2 = Die(DieType.D10)

        println("Die 1: ${die1.getCurrentSide()}, Die 2: ${die2.getCurrentSide()}")
        println("Rolling Die 1...")
        die1.roll()
        println("Die 1: ${die1.getCurrentSide()}, Die 2: ${die2.getCurrentSide()}")
    }
}

fun main() {
    val game = DiceGame()
    game.playGame()
}
