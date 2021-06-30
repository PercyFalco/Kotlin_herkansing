//Player Value
class Player(name: String, hitpoints: Int, life: Int, level: Int) : Functions(name, hitpoints, life, level)
{

    //Lives
    fun showLives() {
        if (life < 1) {
            println("$name is dead!")

        } else {
            println("$name is alive!")
        }
    }

    //override function
    override fun toString(): String {
        return """
            name:  $name
            life:  $life
            level: $level
            weaponName: ${weapon.name}
            weaponDmg: ${weapon.damageInflicted}
            """
    }
}