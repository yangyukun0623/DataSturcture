package Scala_01_basic.Scala_05_FunctionAndMethod
/**
  * 如何创建和使用函数
  * 1.如何定义和使用没有参数且具有返回类型的函数、
  * 2.如何定义和使用不带括号的函数
  * 3.如何定义和使用没有返回类型的函数
  *
  * 使用参数创建函数
  * 1.如何用参数定义功能
  * 2.如何使用参数调用函数
  * 3.如何在功能参数中添加默认值
  * 4.如何使用具有默认值的参数调用函数
  *
  * */
object FunctionDemo1 {
  def main(args: Array[String]): Unit = {
    //如何创建和使用函数
    //1.如何定义和使用没有参数且具有返回类型的函数
    println("Step 1: How to define and use a function which has no parameters and has a return type")
    def favoriteDonut():String = {
      "Glazed Donut"
    }
    //函数主体中最后一行是将返回给调用方的那一行
    val myFavoriteDonut = favoriteDonut()
    println(s"My favorite donut is $myFavoriteDonut")

    //2.如何定义和使用不带括号的函数
    println("\nStep 2: How to define and use a function with no parenthesis")
    def leastFavoriteDonut = "Plain Donut"
    println(s"My least favorite donut is $leastFavoriteDonut")

    //3.如何定义和使用没有返回类型的函数
    println("\nStep 3: How to define and use a function with no return type")
    def printDonutSalesReport(): Unit = {
      // lookup sales data in database and create some report
      println("Printing donut sales report... done!")
    }
    printDonutSalesReport()

    //使用参数创建函数
    //1.如何用参数定义功能
    println("Step 1: How to define function with parameters")
    def calculateDonutCost(donutName: String, quantity: Int): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")
      // make some calculations ...
      2.50 * quantity
    }

    //2.如何使用参数调用函数
    println("\nStep 2: How to call a function with parameters")
    val totalCost = calculateDonutCost("Glazed Donut",5)
    println(s"Total cost of donut = ${totalCost}")
  }
}
