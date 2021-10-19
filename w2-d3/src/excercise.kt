fun main() {
    val a = A ()
    val b = B ()
    val c = C ()
    val d = D ()

    a.add(5,5)
    b.add(5,5)
    c.add(5,5)
    d.add(5,5)
}


open class A {
    open fun running () {

    }

    open fun add (n1:Int,n2:Int) :Int {
        return n1 + n2
    }
}


open class B : A () {
    open fun go () {

    }

    override fun add(n1: Int, n2: Int): Int {
        println("your result is: ")
        return super.add(n1, n2)
    }
}


class C : A () {
    override fun add(n1: Int, n2: Int): Int {
        println(n1 + n2)
        return super.add(n1, n2)
    }
}


class D : B () {
    override fun add(n1: Int, n2: Int): Int {
        return super.add(n1, n2)
    }

    override fun go() {
        super.go()
    }

    override fun running() {
        super.running()
    }
}