package Scala_01_basic.Scala_05_FunctionAndMethod

object FunctionDemo3 {
    def main(args: Array[String]): Unit = {
        def abs(x:Double) = if (x >= 0) x else -x
        println(abs(-1))

        def fac(n:Int) = {
            var r = 1
            for (i <- 1 to n) r = r * i
            r
        }

        def fact(n:Int):Int =  if (n <= 0) 1 else n * fact(n - 1)

        println(fac(3))
    }
}
