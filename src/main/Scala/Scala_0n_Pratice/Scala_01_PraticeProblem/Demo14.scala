package Scala_0n_Pratice.Scala_01_PraticeProblem

import java.util.Scanner

import scala.util.control.Breaks._

/**
  * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
  * */
object Demo14 {
    def main(args: Array[String]): Unit = {
        val sc = new Scanner(System.in)
        var flag = true
        var num:Int = sc.nextInt()
        for (x <- 2 to num){
            while (num != x){
                if(num % x == 0){
                    print(s"$x * ")
                    num = num / x
                }else {

                }
            }
        }
    }
}
