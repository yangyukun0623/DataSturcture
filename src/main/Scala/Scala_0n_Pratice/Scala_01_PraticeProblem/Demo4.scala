package Scala_0n_Pratice.Scala_01_PraticeProblem

import java.util.Scanner

/**
  * 题目：输入某年某月某日，判断这一天是这一年的第几天？
  * */
object Demo4 {
    def main(args: Array[String]): Unit = {
        val sc:Scanner = new Scanner(System.in)
        val isLeapYear = Array(0,31,28,31,30,31,30,31,31,30,31,30,31)
        val leapYear = Array(0,31,29,31,30,31,30,31,31,30,31,30,31)

        val year:Int = sc.nextInt()
        val month:Int = sc.nextInt()
        val day:Int = sc.nextInt()
        var sum:Int = 0

        if(inLeapYear(year)){
            for (x <- 0 until month){
                sum += leapYear(x)
            }
            sum += day

        }else{
            for (x <- 0 until month){
                sum += isLeapYear(x)
            }
            sum += day
        }

        println(sum)
    }

    def inLeapYear(year:Int):Boolean = {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            true
        }else{
            false
        }
    }
}
