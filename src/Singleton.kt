class Singleton private constructor(){
    init {
        println("This is $this class")
    }
    private object Holder{
        val INSTANCE = Singleton()
    }
    companion object {
        val instance:Singleton by lazy{Holder.INSTANCE}
    }
    var singletonString:String?=""
}