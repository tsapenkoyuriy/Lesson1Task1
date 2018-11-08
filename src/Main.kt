fun add(x:Int, y:Int):Int=x+y
fun differ(x:Int, y:Int):Int=x-y
fun mult(x:Int, y:Int):Int=x*y

fun main(args:String){
    val operations:Array<String> = arrayOf("+","-","*","/","=")
    val digits:Array<String> =arrayOf("0","1","2","3","4","5","6","7","8","9")
    var screen:String = "0"
    var accumulator:String=""
    var operationPool:String=""
    var key:String = ""
    fun press(key:String){
        if(key in digits){
            if(screen.equals("0"))
                screen = key else screen += key
        }
        if(key in operations){
            if (!screen.equals("0")){
                if (operationPool.equals("")){
                    accumulator = screen
                    operationPool=key
                    screen="0"
                }else{
                    when(operationPool){
                        "+" ->{
                            var x:Int = accumulator.toInt()
                            var y:Int = screen.toInt()
                            accumulator = add(x,y).toString()
                            screen="0"
                            operationPool = key
                        }
                        "-" ->{
                            var x:Int = accumulator.toInt()
                            var y:Int = screen.toInt()
                            accumulator = differ(x,y).toString()
                            screen="0"
                            operationPool = key
                        }
                        "*" ->{
                            var x:Int = accumulator.toInt()
                            var y:Int = screen.toInt()
                            accumulator = mult(x,y).toString()
                            screen="0"
                            operationPool = key
                        }
                    }
                }
            }

        }
    }


}