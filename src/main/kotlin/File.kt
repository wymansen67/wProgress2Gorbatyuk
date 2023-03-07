import kotlinx.coroutines.*
var Train = Traim()
suspend fun main() {
    println("Дай значение, человек")
    var n = readln().toInt()
    GlobalScope.launch {
        for (i in 0..n) {
            Train.GetTravelInfo()
        }
        delay(5000L)
    }
    Train.GetPath()
    delay(10000L)
}
