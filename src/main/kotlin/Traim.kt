class Traim() : TravelTudaSuda() {
    var from = "Undefined"
    var to = "Undefined"
    var arrivalTime = "Undefined"

    override fun GetTravelInfo() {
        print("Цена поездки поездки составит:")
        print(GetPrice())
    }

    fun GetPath() {
        println("Поезд отправляется из $from в $to")
        print("Путь займет ${GetLength()} дней")
    }

    fun GetAvgStats() {
        if (GetLength() > 5U)
            println("На пути предусмотрено от 3 остановок по $brakeTime минут")
    }
}