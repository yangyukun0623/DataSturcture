package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * 题目：判断101-200之间有多少个素数，并输出所有素数。
  * */
object Demo12 {
    def main(args: Array[String]): Unit = {
        var count = 0
        for (x <- 101 to 200){
            if(prime(x)){
                count += 1
                print(x + " ")
            }
        }
        println("\n一共有" + count + "个素数")
    }

    def prime(num:Int):Boolean = {
        if (num == 1 || num == 2)
            false
        else {
            for (x <- 2 to math.sqrt(num).toInt){
                if(num % x == 0){
                    return false
                }
            }
            true
        }
    }
}
