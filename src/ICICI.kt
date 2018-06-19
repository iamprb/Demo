class ICICI(var interestRate:String):Bank(interestRate  ) {

        var _rate:String
    init {
        _rate=interestRate
    }
    fun iciciMessage(){
        println("This is ICICI Bank")
    }
}