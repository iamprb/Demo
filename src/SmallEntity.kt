class SmallEntity{
    var name:String = ""
        set(value) {
        if (value == "Kotlin")
        {
           field=value
        }else{
            println("Entered value is not kotlin")
        }
    }
    get() = field

    var age:Int=0
    set(agevalue) {
        if(agevalue!=24)
        {
            println("This is not my age")
        }else{
           field=agevalue
        }
    }
    get() = field
}