fun main() {
    println(isTodayUsageGreaterThanYesterday(timeSpentToday = 300, timeSpentYesterday = 200))
}

fun isTodayUsageGreaterThanYesterday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
