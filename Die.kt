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
/**
 * Die class represents a single die with properties and methods to simulate dice behavior.
 *
 * @property type The type or name of the die (e.g., "d6").
 * @property sides The number of sides on the die.
 * @property currentSide The current side facing up on the die.
 * @constructor Creates a Die object with default values.
 */
class Die(private var type: DieType = DieType.D6, private var sides: Int = 6) {
    private var currentSide: Int = roll()

    /**
     * Gets the type of the die.
     *
     * @return The type of the die.
     */
    fun getType(): DieType {
        return type
    }

    /**
     * Sets the type of the die.
     *
     * @param type The type of the die.
     */
    fun setType(type: DieType) {
        this.type = type
    }

    /**
     * Gets the number of sides on the die.
     *
     * @return The number of sides on the die.
     */
    fun getSides(): Int {
        return sides
    }

    /**
     * Sets the number of sides on the die.
     *
     * @param sides The number of sides on the die.
     */
    fun setSides(sides: Int) {
        this.sides = sides
    }

    /**
     * Gets the current side facing up on the die.
     *
     * @return The current side facing up on the die.
     */

    fun getCurrentSide(): Int {
        return currentSide
    }
    
    /** Initializes the die object by rolling it once to set a random side. */
    init {
        roll()
    }

    /**
     * Secondary constructor that takes the number of sides as a parameter. It sets the type based
     * on the number of sides and rolls the die to set a random side.
     *
     * @param sides The number of sides on the die.
     */
    constructor(sides: Int) : this(DieType.valueOf("D$sides"), sides)

    /**
     * Secondary constructor that takes both the type and the number of sides as parameters. It
     * rolls the die to set a random side.
     *
     * @param type The type or name of the die.
     * @param sides The number of sides on the die.
     */
    constructor(type: DieType, sides: Int) : this(type, sides)

    /** Rolls the die to generate a random side. */
    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
