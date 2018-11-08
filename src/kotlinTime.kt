import java.util.*

fun main(args:Array<String>){
    print("Your birthday is ")
    val birthday:String? = readLine()
    println("Your fortune is: ${getFortuneCookie(birthday!!.toIntOrNull())}")
}

fun getFortuneCookie(birthday:Int?):String{
    val cookies=listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    return "Your fortune is [${cookies[birthday!!%cookies.size]}]"
}
fun getFortuneCookie():String{
    val cookies=listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    return "Your fortune is ${cookies[Random().nextInt(cookies.size)]}"
}

fun getBirthday():Int?{
    print("Your birthday is ... ")
    return readLine()!!.toIntOrNull()?:1
}