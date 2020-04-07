package Scala_01_basic.Scala_01_DataType

import java.util.Scanner

/**
  * 四、类型推断
  * 1.Scala类型推断
  * 2.使用推论声明Scala支持的类型
  * 3.使用Scala编译器将一种数据类型转换成为另一种数据
  * */
object Casting {
  def main(args: Array[String]): Unit = {
    var in:Int = new Scanner(System.in).nextInt()
    println(in)

    //1.类型推断
    println("Step 1: Immutable variable")
    //val donutsToBuy: Int = 5
    val donutsBought = 5
    println()

    //2.使用推论声明Scala支持的类型
    println("Step 2: Scala Types")
    val donutsBoughtToday = 5
    val bigNumberOfDonuts = 100000000L
    val smallNumberOfDonuts = 1
    val priceOfDonut = 2.50
    val donutPrice = 2.50f
    val donutStoreName = "Allaboutscala Donut Store"
    val donutByte = 0xa
    val donutFirstLetter = 'D'
    val nothing = ()
    println()

    //3.类型转换
    println("Step 3: Using Scala compiler to convert from one data type to another")
    val numberOfDonuts: Short = 1
    val minimumDonutsToBuy: Int = numberOfDonuts

    //4.用户驱动转换
    val  minimumDonutsToSell:String = numberOfDonuts.toString()

  }
}
















