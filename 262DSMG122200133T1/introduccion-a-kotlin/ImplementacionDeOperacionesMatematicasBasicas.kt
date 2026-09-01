fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val secondResult = add(firstNumber, thirdNumber)
    val thirdResult = subtract(secondResult, result)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $secondResult")
    println("$secondResult - $result = $thirdResult")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}
