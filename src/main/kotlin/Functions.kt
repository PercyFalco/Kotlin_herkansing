//Combat
open class Functions(val name: String, var hitpoints: Int, var life: Int, var level: Int) {
    val inventory = ArrayList<Loot>()
    val weapon = Weapon("weapon", 10)

    //take damage function
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



        //lives checker
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


    //show Inventory function
    fun showInventory() {
        println("$name's Inventory:")
        for (item in inventory)
        {
            println("name: ${item.name} \\\\ worth: ${item.value}")
        }
        println("============================")
    }
}