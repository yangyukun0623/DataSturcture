package Scala_0n_Pratice.Scala_01_PraticeProblem

import java.util.Scanner

/**
  * 题目：企业发放的奖金根据利润提成。利润(i)低于或等于10万元时，奖金可提10%；利润高
  * 　　　于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提
  * 　　　成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于
  * 　　　40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于
  * 　　　100万元时，超过100万元的部分按1%提成，从键盘输入当月利润i，求应发放奖金总数？
  * */
object Demo2 {
    def main(args: Array[String]): Unit = {
        val $ = 10000
        var bonus = 0.0
        val i: Double = new Scanner(System.in).nextDouble()
        val bonus1 = 10 * $ * 0.1
        val bonus2 = bonus1 + 10 * $ * 0.75
        val bonus4 = bonus2 + 20 * $ * 0.5
        val bonus6 = bonus4 + 40 * $ * 0.15
        val bonus10 = bonus6 + 40 * $ * 0.15
        if (i <= 10 * $) {
            bonus = bonus1 + (i - 10 * $) * 0.075
        } else if (i <= 20 * $) {
            bonus = bonus1 + (i - 10 * $) * 0.075
        } else if (i <= 40 * $) {
            bonus = bonus2 + (i - 20 * $) * 0.05
        } else if (i <= 60 * $) {
            bonus = bonus4 + (i - 40 * $) * 0.03
        } else if (i < 100 * $) {
            bonus = bonus6 + (i - 60 * $) * 0.015
        } else {
            bonus = bonus10 + (i - 100 * $) * 0.01
        }

        println("bonus = " + bonus.toString)
    }
}
