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
    private var currentSide: Int = roll()

    fun getType(): DieType {
        return type
    }

    fun setType(type: DieType) {
        this.type = type
    }

    fun getSides(): Int {
        return sides
    }

    fun setSides(sides: Int) {
        this.sides = sides
    }

    fun getCurrentSide(): Int {
        return currentSide
    }
    init {
        roll()
    }
    constructor(sides: Int) : this(DieType.valueOf("D$sides"), sides)

    constructor(type: DieType, sides: Int) : this(type, sides)

    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
