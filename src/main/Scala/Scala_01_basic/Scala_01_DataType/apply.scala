package Scala_01_basic.Scala_01_DataType

object apply {

    def main(args: Array[String]): Unit = {
        val a:Int = 10
        val b:Int = 1
        val c = b.+(a)
        println("hello".distinct)
        for (x <- 0 until  "hello".distinct.length){
            println("hello".distinct(x))
        }

        println("--------")
        println("Hello".apply(1))
        println("hello".take(1))
        println("hello".drop(1))
        println("hello".takeRight(1))
        println("hello".dropRight(1))
    }
}
