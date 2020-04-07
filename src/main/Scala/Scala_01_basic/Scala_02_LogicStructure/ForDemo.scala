package Scala_01_basic.Scala_02_LogicStructure

object ForDemo {
    def main(args: Array[String]): Unit = {
        println(for (i <- 1 to 10) yield i % 3)

        var str = "Hello"
        val s = 0 until (str.length,2)
        for (x <- s){
            print(x + " ")
        }
        println()
        str.filter(_ % 2 == 0).map(2 * _)

    }

}
