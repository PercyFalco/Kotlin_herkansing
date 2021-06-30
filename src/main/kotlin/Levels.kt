class Levels() {
    fun main() {


        //Enemy's
        val jumboPuff = Enemy("Jumbo Puff", 1, 1,30)


        //weapons



        //player
        println("Enter your character name")
        var username = readLine()

        while (username!!.isBlank()) {
            println("Please enter a valid character name")
            username = readLine()
        }
        val player = Player("$username", 3, 3, 9)


        //inventory




        player.showInventory()

    }
}














