class CITI(var citiRate:String):Bank(citiRate){
    var _citiRate:String

    init {
        _citiRate=citiRate
    }
    fun citiMessage(){
        println("This is CITI bank")
    }
}