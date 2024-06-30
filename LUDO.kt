fun main() {
    val T = readInt()
    repeat(T){
        val X = readInt()
        println(if(X == 6) "Yes" else "No")
    }
}

private fun readStr() = readln() // string line
private fun readInt() = readStr().toInt() // single int
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
