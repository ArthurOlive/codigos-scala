object codFunc{
    def isPar(num: Int) : Boolean = {
        if (num % 2 == 0) return true
        else return false
    }

    def isImpar(num: Int) = num match {
        case x if x % 2 == 0 => false
        case _ => true
    }

    def main(args: Array[String]) {
        println(isPar(10))
        println(isImpar(10))
        println(isImpar(7))
    }
}