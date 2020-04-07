package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * 题目：输出9*9口诀
  * */
object Demo8 {
    def main(args: Array[String]): Unit = {
        for (x <- 1 until 10){
            for (y <- 1 to x){
                print(s"$y * $x = ${x * y} ")
            }
            println()
        }
    }
}
