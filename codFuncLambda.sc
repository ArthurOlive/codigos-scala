object codFor2{
    def main(args:Array[String]) {
        def funcDodro(i: Int): Int = i * 2

        var arr = for { i <- 1 to 20 if (i % 2) == 0 } yield i

        var dobro = arr.map(funcDodro)

        println(dobro)
    }
}