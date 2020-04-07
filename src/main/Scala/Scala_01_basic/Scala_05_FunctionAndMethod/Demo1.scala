package Scala_01_basic.Scala_05_FunctionAndMethod

object Demo1 {
    def main(args: Array[String]): Unit = {
        for (x <- 1 to 10){
            val number = Fibonacci(x)
            if(number % 2 == 0)
                print(number + " ")
        }
        println()
        for (y <- 1 to 10){
            print(Fibonacci(y) + " ")
        }
    }

    def Fibonacci(index:Int):Int = {
        if (index == 1 || index == 2)
            1
        else
            Fibonacci(index - 1) + Fibonacci(index - 2)
    }
}
