import jdk.nashorn.internal.objects.NativeJava.type

fun main(args:Array<String>){
    val numbers:Array<Int> = arrayOf(11,12,13,14,15)
    //for(element in numbers) print("$element ")

    val numbersList = mutableListOf<String>()

    for(element in numbers){
        numbersList.add(element.toString())
    }

    println(numbersList)

}