import java.util.*

fun main (args: Array<String>)
{
    var name : String? = "Pranay"
    println(name?.length)
    var age :Int=24

    var secondClass = SecondClass()
    secondClass.givesMessage()
    var entity = Entity(age = 24,Name = "Kotlin")
    println(entity.Name)
    println(entity.age)
    entity.Name="Pranay"
    println(entity.Name)
    //Inheritance + constructor
    var icici= ICICI("6.5")
    icici.iciciMessage()
    var citi=CITI("6.7")
    citi.citiMessage()


    //Interoperability
    var javaEntity = Entities()
    javaEntity.day="Tuesday"
    javaEntity.weather="Overcast"
    println(javaEntity.day)
    println(javaEntity.weather)

    //For loop
    for(i in 0 until 11){
        println(i)
    }
    for(i in 10 downTo 1){
        println(i)
    }
    //User input
    var input = Scanner(System.`in`)
    var num1:Int?=input.nextInt()
    var num2:Int? = input.nextInt()
    println(num1?.minus(num2!!))

    //When statement
    when(12>15){
        true-> println("14")
        false->println("15")
    }
    //Label breaks
    loop@ for(i in 1..10)
    {
        println("Outer loop value $i")
        for(j in 1..10){
            println("Inner loop value $j")
            if(j==2)break@loop
            //This breaks outer loop
            //And hence breaks inner loop as well
        }
    }

    //Properties with custom getter and setter
    var smallEntity = SmallEntity()
    //This will set the values to the field
    smallEntity.age=24
    smallEntity.name="Kotlin" //No message will be displayed

    //will set the value to the field
    smallEntity.age=23
    smallEntity.name="Java"
    //Will print the message

    //Singleton pattern here
    Singleton.instance
    Singleton.instance.singletonString="My Singleton Class"
    println(Singleton.instance.singletonString)

  //Hashmaps
    val maps= mapOf(
            "key1" to 1,
            "Key2" to 2,
            "Key3" to 3
    )
    for ((key,value)in maps.entries)
    {
        println("$key -> $value")
    }

}