class Cat : Animal() {


    init {
//        sound()
//        adding(2.5 ,3)
        sub(2,1)
        sub(2.5,1.25)
        sub(3.5f,1.7f)
        sub(2.5,1)
    }

    override fun sound() {
        super.sound()
        println("meow...")
    }

    fun adding (n1:Any , n2:Any){
//        val num1 = n1 as Number // type casting
//        val num2 = n2 as Number
//        println(num1 + num2)

        if (n1 is Double && n2 is Double){
            println(n1 + n2)
        }

    }

    fun sub (n1: Any,n2: Any) {
        if (n1 is Int && n2 is Int) {
            println("the subtract of the two Integers is ${n1 - n2}")
        } else if (n1 is Double && n2 is Double) {
            println("the subtract of the two doubles is ${n1 - n2}")
        } else if (n1 is Float && n2 is Float) {
            println("the subtract of the two floats is ${n1 - n2}")
        }else {
            println("invalid input")
        }
    }

}