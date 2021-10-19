open class A1 {

    var cCount = 0

    open fun cAdd () {
        cCount++
        println(cCount)
    }
    companion object{
        var count = 0

        fun addCount (){
            count++
            println(count)
        }

    }

    fun delResult () {

    }
}


fun main() {
    val x = A1()
    val y = A1()
//    x.addCount()
//    y.addCount()
//
//    A1.addCount()
//
//    x.cAdd()
//    x.cAdd()
//    x.cAdd()
//
//    Game.addCount()
//    Game.addCount()

    val i = A1()
    i.cAdd()

    val ooo = object : A1(){
        override fun cAdd() {
            super.cAdd()
            println("and this is your result")
        }
    }

    ooo.cAdd()

}


object Game {
    var count = 0

    fun addCount (){
        count++
        println(count)
    }
}
