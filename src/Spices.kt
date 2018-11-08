fun main(args:Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.filter { it.startsWith("c") }.filter { it.endsWith("e") })
}