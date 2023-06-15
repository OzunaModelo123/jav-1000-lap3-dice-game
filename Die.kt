import kotlin.random.Random

enum class DiceType {
    D4, D6, D8, D10, D12, D20
}

class Die(private val sides: Int = 6, private var type: DiceType = DiceType.D6) {
    private var currentSide: Int = 1
}
