open class functions (val name: String, var hp: Int, var lives: Int)
{
    val inventory = ArrayList<Loot>()
    val weapon = weapon("weapon", 10)
    open fun takeDMG(weapon: weapon)
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
            if (lives < 1)
            {
                lives -= 1
                println("$name has lost a life")
            }
            else
            {
               println("$name is dead! $name has made the wrong choices")
               lives -= 1
            }

        }
    }


    //inventory system
    fun showINV()
    {
        println("$name's Inventory:")
        for (item in inventory)
        {
            println("name: ${item.name} \\\\ worth : ${item.value}")
        }
        println("===============================")
    }

}