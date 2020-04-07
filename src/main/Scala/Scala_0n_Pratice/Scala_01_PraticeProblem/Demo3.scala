package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
  * */
object Demo3 {
    def main(args: Array[String]): Unit = {
        for (i <- 1 to 100000){
            val x = math.sqrt(i + 100)
            val y = math.sqrt(i + 268)
            if(x == x.toInt && y == y.toInt){
                println(i)
            }
        }
    }
}
