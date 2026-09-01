fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(email = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage(os: String = "Unknown OS", email: String): String {
    return "There's a new sign-in request on $os for your Google Account $email."
}
