object codMatch{
    def main(args: Array[String]) {
        var i = 5

        i match {
            case 1  => println("January")
            case 2  => println("February")
            case 3  => println("March")
            case 4  => println("April")
            case 5  => println("May")
            case 6  => println("June")
            case 7  => println("July")
            case 8  => println("August")
            case 9  => println("September")
            case 10 => println("October")
            case 11 => println("November")
            case 12 => println("December")
            case _  => println("Invalid month")
        }

        i match {
            case a if 0 to 9 contains a => println("0-9 range: " + a)
            case b if 10 to 19 contains b => println("10-19 range: " + b)
            case c if 20 to 29 contains c => println("20-29 range: " + c)
            case _ => println("Hmmm...")
        }
    }
}