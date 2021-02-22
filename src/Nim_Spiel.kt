fun main() {
    var items:Int = 20
    var name1:String
    var name2:String
    println("Player name 1:")
    name1 = readLine().toString()
    println("Player name 2:")
    name2 = readLine().toString()
    println("Welcomme to Nim-game $name1 and $name2!\nPlayer 1 starts the game!")

    while(items != 0) {
        println("$name1 how many items do you want to remove?")
        var y:Int = readLine()!!.toInt()
        if (y > 3){
            println("You cannot remove more than 3 items.")
            y = readLine()!!.toInt();
            items -= y
            println("There are still "+ items + " items")
        }
        else if(items == y) {
            items -= y
            println("There are still " + items + " items")
            println("Well done $name1 you won the game!!!")
            break;
        }
        else {
            items -= y
            println("there are still "+ items + " items")
        }
        println("$name2 how many items do you want to remove?")
        var x: Int = readLine()!!.toInt()
        if (x > 3) {
            println("You cannot more than 3 items remove.")
            x = readLine()!!.toInt();
            items -= x
            println("There are still "+ items + " items")
        }
        else if(items == x) {
            items -= x
            println("There are still " + items + "items")
            println("Well done $name2 you won the game!!!")
        }
        else {
            items -= x
            println("There are still "+ items + " items")
        }
    }
}