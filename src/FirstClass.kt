import java.util.*

fun main (args: Array<String>)
{
    var name : String? = "Pranay"
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
}