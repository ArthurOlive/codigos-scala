val Default = ""



object codClass1{
    class Feijao (var nome: String){
        //polimorfismo de construtor
        def this() = {
            this(Default)
        }
        
        def getNome() : String = {
            return nome
        }

        override def toString = s"$nome"
    }
    
    def main(args:Array[String]) {
        var f = new Feijao("feijao")

        println(f.getNome())
    }
}