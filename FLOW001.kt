fun main() {
    val T = readInt()
    repeat(T){
        val(A,B) = readInts()
        println(A+B)
    }
}

private fun readStr() = readln() // string line
private fun readInt() = readStr().toInt() // single int
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
