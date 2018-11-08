import java.lang.Math.random
import java.util.*

fun main(args:Array<String>){
    val random1 = random()
    val random2 = {random()}
    //print("$random1 \n ${random2().toString()!!.toDouble()}")

    val rollDice = { Random().nextInt(12).toString()}
    print(rollDice())
}

