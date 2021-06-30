//Loot Types
enum class LootType{
    ARMOR, WEAPON
}
//Loot Values
class Loot(val name: String, val lootType: LootType, val value: Int){

}