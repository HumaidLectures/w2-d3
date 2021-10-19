object Math {
    var result = 1


    fun operation (num1:Int,num2:Int) {
        result += num1 * num2
        println(result)
    }
}


fun main() {

//    Math.operation(2,4)
//    Math.operation(3,5)
//    Math.operation(2,8)
//    Math.operation(6,4)
//
//    val gg = GG()
//    gg.addCounter()
//    gg.addCounter()
//    gg.addCounter()
//
//    GG.operation(3,6)
//    GG.operation(5,9)
//    GG.operation(2,7)



}

open class GG {

    var counter = 0

    fun addCounter (){
        counter++
        println(counter)
    }


    companion object{
        var result = 0
        fun operation (n1:Int,n2:Int){
            result += n1 * n2
            println(result)
        }
    }
}