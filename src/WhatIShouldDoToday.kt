fun main(args:Array<String>){
    print(whatShouldIDoToday(weather="rainy", mood = readLine(), temperature = 0))
}

fun whatShouldIDoToday(mood:String?="happy", weather:String = "sunny", temperature:Int = 24):String{
    return when{
        (mood=="happy")&&(weather=="sunny")->"Go walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else->"Stay home and read"
    }

}