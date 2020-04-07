package Scala_01_basic.Scala_05_FunctionAndMethod

object Demo3 {
    def main(args: Array[String]): Unit = {
        println(monkey(1))
    }

    def monkey(n:Int):Int = {
        if (n == 10){
            1
        } else {
            2 * (monkey(n + 1) + 1)
        }
    }
}
