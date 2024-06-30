fun main() {
    var N = readInt()
    if (N == 7) print("Thala") else print("Sadge")
}

private fun readStr() = readln() // string line
private fun readInt() = readStr().toInt() // single int
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
