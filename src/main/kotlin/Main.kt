
fun main(args: Array<String>) {
school("akirachix")

var x = mySelf("Deborah",19)
    println(x)

    var z = word("Nebuccardnezzer")
    println(z)
    theTruth("deborah","cherotich")

    var fullName = "Debora Cherotich"
    println(fullName)
    var age = 20
    println(age)
    var phoneNumber = "+254700870092"
    println(phoneNumber)
var weightInKg = 57.12
println(weightInKg)

    var kenyan = true
    println(kenyan)



//  var y = isEven(8,6)

    var t = isEven(16)
    println(t)

    println(nairobiCounty("Nairobi"))

var e = place(50.7)
    println(e)
//    place(25.7)

    var r = myType("Deboracherotich")
    println(r)

}

fun school (name:String){
    println(name[0].toString() + name[2].toString() + name[3].toString())
}
fun mySelf (x:String, y:Int):String{

  var  structure = "Hi, my name is $x and i am $y years old "
    return structure
}
fun word (word1:String):Int {
    return word1.length
}


fun theTruth (say:String, not:String){
    if (say == "not" )
      println("Thats me")
    else{
        println("i dont knoew who is it")
    }
}


 fun isEven(num:Int):Boolean{

     if(num % 2 == 0)
         return true
     else{
         return false
     }
 }



//Extraction of substring from a string

fun nairobiCounty(name:String):String{
    var county = name.slice(2 until 6)
    return county

}


fun place(z:Double){
    var temprature = "The temprature is $z degrees celcius"
    println(temprature)
}

//slicing string

fun myType(name:String):String{
    var self = name.slice(2 until 8)
    return  self
}
