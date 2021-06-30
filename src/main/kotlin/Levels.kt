class Levels() {
    fun main() {


        //Enemy's
        val jumboPuff = Enemy("Jumbo Puff", 1, 1,30)


        //weapons
        val Gun = Weapon("PeW PeWs", 1)
        val wongfu = Weapon("Wong Fu",1)
        val shockwave = Weapon("Shockwave",1)
        val Bomb = Weapon("Bomb", 1)


        //player
        println("Enter your character name")
        var username = readLine()

        while (username!!.isBlank()) {
            println("Please enter a valid character name")
            username = readLine()
        }
        val player = Player("$username", 1, 1, 14)


        //inventory
        val pistol = Loot("PeW pEwS", LootType.WEAPON, 1913)
        val gloves = Loot("Gloves", LootType.WEAPON, 2446)


        //intro
        println("You are $username you are a part of the mutated race of the Dumdon.\n" +
                "as a child you trained with you muma and papo Wong fu.\n" +
                "Wong fu is the only reason why the tree of life still stands.\n" +
                "The tree of life is the essence of this biohazard world.\n" +
                "The tree makes sure there is life in this wasteland.\n" +
                "But the word is being threatened.\n" +
                "By so called world eaters.\n" +
                "The world eaters are slowly eating the roots of the tree of life.\n" +
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
                player.inventory.add(gloves)
                player.inventory.add(pistol)
                player.showInventory()
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
                "You could use your grappling hook to attach the bombs onto your hook.\n" +
                "Or you could use your brand new pew pews and use your knowledge of wong fu.\n" +
                "Type next to continue")
                line = readLine()!!.toLowerCase()




        //Fight Jumbo Puff
        while (line != "next"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }

        println("What will you choice be?\n " +
                "Hook or fight\n" +
                "Type your choice.\n")
        line = readLine()!!.toLowerCase()


        if (line == "fight") {
            println("You run towards the Jumbo Puff.\n" +
                    "What are going to use you brand new pew pews or wong fu\n" +
                    "Type pew or wong fu\n"+
                    "Type your choice.\n")
            line = readLine()

            if(line == "pew") {
                println("You grab you pew pews out of your pocket\n" +
                        "With your finger on the trigger.\n" +
                        "You shoot your whole magazine empty.\n" +
                        "You reload you pew pews as fast as can.\n" +
                        "The Jumbo Puff is preparing a attack.\n" +
                        "The Jumbo Puff stands on his back feets.\n" +
                        "\"boem!\" the Jumbo Puff creates a huge wave on the ground.\n" +
                        "Jump or Block")
                }
                         line = readLine()!!.toLowerCase()
                         if(line == "jump"){
                             println("You jump over the shockwave.\n" +
                             "You continue to keep firing your pew pews.\n" +
                             "The world eater was starting to crumble.\n " +
                             "You run towards its mouth and fire your last bullet.\n" +
                             "You won.\n" +
                             "Only 3 more to go.")
                             jumboPuff.takeDamage(Gun)
                             player.showLives()
                         }
                         else if (line == "block") {
                             println("You prepare yourself for the shockwave.\n " +
                                     "You tried to block the attack but sadly did not succeed.")
                                      player.takeDamage(shockwave)
                                      player.showLives()

                         }


            else if(line == "wong fu") {
                println("You run towards the beast with your gloves.\n" +
                        "You jump on the beast its head and try smashing it into pieces.\n" +
                        "The beast was trying to get you off but you did not give in.\n" +
                        "You slide to the beast forehead and smash his eyes.\n" +
                        "Now the beast could not see you smash it till it goes down\n" +
                        "After 10 minutes of full one beating the shit out of the Jumbo Puff it goes down\n" +
                        "You won and saved the western root from destruction\n" +
                        "3 more to go")
                        jumboPuff.takeDamage(wongfu)
                        player.showLives()

                }
        }

        else if(line == "hook") {
            println("You hook a bomb with the Goo Glider\n" +
                    "You surf towards the Jumbo Puff.\n" +
                    "You drop the bomb right next to his front right feet" +
                    "You grab you pew pews and shoot the bomb.\n" +
                    "\"Boem!!\" The bomb explodes and the Jumbo Puff falls down.\n" +
                    "Its not dead yet.\n" +
                    "You grab another bomb and place it at his head this time.\n" +
                    "The Jumbo Puff looks at you and screams.\n" +
                    "You shoot your last bullet in your magazine at the bomb.\n" +
                    "\"Boem!\" The Jumbo Puff heads explodes into small pieces.\n" +
                    "Only 3 more to go!")
                    jumboPuff.takeDamage(Bomb)
                    player.showLives()
        }



    }
}














