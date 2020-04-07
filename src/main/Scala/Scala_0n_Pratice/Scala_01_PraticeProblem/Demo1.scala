package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
  *
  * */
object Demo1 {
    def main(args: Array[String]): Unit = {
        var count = 0;
        for (x <- 1 to 4)
            for (y <- 1 to 4)
                for (z <- 1 to 4){
                    if (x != y && y != z && x != z){
                        count += 1;
                        println(x.toString + y.toString + z.toString)
                    }
                }
        println("共有 " + count.toString + " 个")
    }
}
