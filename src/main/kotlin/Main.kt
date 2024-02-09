fun usageCounter(timeSpentToday:Int,timeSpentYesterday:Int){
    if (timeSpentToday > timeSpentYesterday)
        println("You spent more time on the phone today compared to yesterday.")
    else if (timeSpentToday <= timeSpentYesterday)
        println("You spent same or littel than time on the phone today compared to yesterday.")
}

fun main() {
    usageCounter(300,300)
}