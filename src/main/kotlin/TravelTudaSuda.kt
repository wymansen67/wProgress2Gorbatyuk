abstract class TravelTudaSuda : TravelInfo {
        var number:UInt = 1U
        var length:UInt = 10U
        var brakeTime:UInt = 5U
        var pricePerDay:UInt = 15U
        open var price:UInt = 0U

        override fun GetTravelInfo() {
                println("Цена поездки 1 д = 15$")
        }
        fun GetNumber(): UInt {
                return number
        }
        fun SetNumber(number: UInt){
                this.number = number
        }

        fun GetLength(): UInt {
                return length
        }
        fun SetLength(length: UInt) {
                this.length = length
        }
        fun GetBrakeTime(): UInt {
                return brakeTime
        }
        fun SetBrakeTime(brakeTime: UInt){
                this.brakeTime = brakeTime
        }
        fun GetPrice() :UInt {
                price = (length / 10u) * pricePerDay
                return price
        }

}