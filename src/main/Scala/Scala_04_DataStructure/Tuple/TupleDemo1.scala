package Scala_04_DataStructure.Tuple

object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val t = (1,3.14,"Fred")
        println("1 = " + t._1 + ", 2 = " + t._2 + ", 3 = " + t._3)

        //拉链操作
        val symbols = Array("<","-",">")
        val counts = Array(2,10,2)
        val pairs = symbols.zip(counts)
        println(pairs.toMap)
    }
}
