class Game {
    var path = mutableListOf<Directions>(Directions.START)
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val south = {path.add(Directions.SOUTH)}
    val north = {path.add(Directions.NORTH)}
    val end = {
        path.add(Directions.END)
        println("Game over")
    }
}