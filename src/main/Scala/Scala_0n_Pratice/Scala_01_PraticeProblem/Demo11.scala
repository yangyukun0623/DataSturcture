package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月
  * 　　　后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
  *
  * */
object Demo11 {
    def main(args: Array[String]): Unit = {
        for (x <- 1 to 20)
            print(fibnaci(x) + "  ")
    }

    def fibnaci(month:Int):Int = {
        if(month == 1 || month == 2){
            1
        }else {
            fibnaci(month - 1) + fibnaci(month - 2)
        }
    }
}
