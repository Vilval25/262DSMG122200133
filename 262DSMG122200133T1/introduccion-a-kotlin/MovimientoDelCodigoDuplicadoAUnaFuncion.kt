fun main() {
    printWeatherInformation("Ankara", lowTemp = 27, highTemp = 31, rainProbability = 82)
    printWeatherInformation("Tokio", lowTemp = 32, highTemp = 36, rainProbability = 10)
    printWeatherInformation("Cape Town", lowTemp = 59, highTemp = 64, rainProbability = 2)
    printWeatherInformation("Guatemala City", lowTemp = 50, highTemp = 55, rainProbability = 7)
}

fun printWeatherInformation(city: String, lowTemp: Int, highTemp: Int, rainProbability: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainProbability%")
    println()
}
