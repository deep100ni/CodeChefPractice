fun main() {
    val T = readInt()
    repeat(T){
    var(A,B) = readInts()
        if(A >= B){
            print(B)
        }else{
            print(A)
        }
        println()
    }
}

private fun readStr() = readln() // string line
private fun readInt() = readStr().toInt() // single int
private fun readStrings() = readStr().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
