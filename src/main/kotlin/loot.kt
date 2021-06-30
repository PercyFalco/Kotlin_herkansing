//Loot sort
enum class LootType {
    Armor,Weapon, Potion
}

//Loot
class Loot(val name: String, val lootType: LootType, val value: Int)