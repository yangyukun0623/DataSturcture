package Scala_01_basic.Scala_05_FunctionAndMethod

object Demo2 {
    def main(args: Array[String]): Unit = {
        println((1 to 10).toList)
        picture(10)
        println()
        multip(9)
        println()
        yang(4)
    }


    def picture(num:Int) = {
        for (x <- 1 to num){
            for (z <- 1 to(num - x)){
                print(" ")
            }
            for (y <- 1 to(2 * x - 1)){
                print("*")
            }
            println()
        }
    }

    def multip(num:Int) = {
        for (x <- 1 to(num)){
            for (y <- 1 to(x)){
                printf("%d*%d=%-2d ",y,x,x * y)
            }
            println()
        }
    }

    def yang(num:Int) = {
        var arr = Array.ofDim[Int](num,num)
        for (x <- 0 until(num)){
            arr(x)(x) = 1
            arr(x)(0) = 1
        }
        for (x <- 2 until(num)){
            for (y <- 1 until(x)){
                arr(x)(y) = arr(x - 1)(y) + arr(x - 1)(y - 1)
            }
        }

        for (x <- 0 until(num)) {
            for (z <- 0 until(num - x)){
                printf("%2c",' ')
            }
            for (y <- 0 to(x)) {
                printf("%-3d ", arr(x)(y))
            }
            println()
        }

    }

}
