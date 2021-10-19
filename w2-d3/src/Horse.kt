class Horse : Animal() {

    init {
        sound()
    }

    override fun sound() {
        super.sound()
        println("neigh...")
    }
}