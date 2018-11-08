fun main(arg:Array<String>){
    println(canAddFish(10.0, listOf(2,2)))
    println(canAddFish(12.0, listOf()))
}

fun canAddFish(tankSize:Double, currentFish:List<Int>, fishSize:Int = 0, hasDecoration:Boolean = false):Boolean{
    var fishAmount:Int = 0
    for(fishSize in currentFish){
        fishAmount+=fishSize
    }
    var tankSize_ = if (hasDecoration) tankSize*0.8 else tankSize

    if (fishSize<=(tankSize_-fishAmount)) return true else return false
}