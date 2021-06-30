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




        println("You are $username you are a part of the mutated race of the Dumdon.\n" +
                "as a child you trained with you muma and papo Wong fu.\n" +
                "Wong fu is the only reason why the tree of life still stands.\n" +
                "The tree of life is the essence of this biohazard world.\n" +
                "The tree makes sure there is life in this wasteland.\n" +
                "But the word is being threatened.\n" +
                "By so called world eaters.\n" +
                "The world eaters are slowly eating the roods of the tree of life.\n" +
                "these world eaters are stationed at each root of the tree.\n" +
                "The Jumbo puff at the western root.\n" +
                "The Porky Puff at the eastern root.\n" +
                "The Hoof Puff at northeastern root.\n" +
                "and as last the Murk Puff which is located at the Northwestern root.\n" +
                "But now we are going to focus on your fight with the Jumbo Puff.\n" +
                "You prepared yourself well.\n" +
                "You bought new pew pews and new gloves.\n" +
                "You surf with you upgraded Goo Glider to the western root.\n" +
                "Once arrived at the root you see the Jumbo Puff jumping off the root and landing in the water.\n" +
                "Type next to continue.")
                var line : String?
                line = readLine()!!.toLowerCase()

        while (line != "next"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }
        println("The Jumbo Puff looks at you at screams.\n" +
                "The water is making waves cause of the vibrations of the scream.\n" +
                "You surf the waves with your Goo Glider.\n" +
                "You look around you and see mines in the water.\n" +
                "You could use your grappling hook to attach guide the bombs next to the Jumbo Puff.\n" +
                "Or you could use your brand new pew pews and use your knowledge of wong fu.\n" +
                "Type hook for grappling the bombs or type fight to fight the Jumbo Puff head on")
                line = readLine()!!.toLowerCase()


    }
}














