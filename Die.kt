import kotlin.random.Random

enum class DiceType {
    D4, D6, D8, D10, D12, D20
}

class Die(private val sides: Int = 6, private var type: DiceType = DiceType.D6) {
    private var currentSide: Int = 1
}

init {
    roll()
}

fun roll() {
    currentSide = Random.nextInt(1, sides + 1)
}

fun getCurrentSide(): Int {
    return currentSide
}

fun getType(): DiceType {
    return type
}

fun setType(newType: DiceType) {
    type = newType
}

fun getSides(): Int {
    return sides
}