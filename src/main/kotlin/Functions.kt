//Combat
open class Functions(val name: String, var hitpoints: Int, var life: Int, var level: Int) {
    val inventory = ArrayList<Loot>()
    val weapon = Weapon("weapon", 10)

    open fun takeDamage(weapon: Weapon)
    {
        var damage = weapon.vardamageInflicted
        var remainingHitpoints = hitpoints - damage
        hitpoints = remainingHitpoints

        if (remainingHitpoints > 0)
        {
            hitpoints = remainingHitpoints
            println("$name took $damage points of damage and has $hitpoints left.")
        }

        else
        {
            if (life < 1) {
                life -= 1
                println("$name has lost a life")
            } else {
                println("$name is dead! $name has no more lives left")
                life -= 1
            }
        }


    }


    //Inventory
    fun showInventory() {
        println("$name's Inventory:")
        for (item in inventory)
        {
            println("name: ${item.name} \\ worth: ${item.value}")
        }
        println("============================")
    }
}