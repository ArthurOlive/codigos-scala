object codFor{
    def main(args:Array[String]) {

        var arr = for { i <- 1 to 20 if (i % 2) == 0 } yield i

        for (x <- arr) 
            println(x)

    }
}