package Scala_01_basic.Scala_05_FunctionAndMethod

/**
  * 功能参数中使用选项
  * 1.如何在功能参数中定义选项
  * 2.如何调用具有Option参数的函数
  * 3.如何为选项参数分配默认值
  * 4.如何调用其Option参数具有默认值的函数
  *
  * 使用选项返回类型创建函数
  * 1.如何定义一个返回String类型Option函数
  * 2.如何使用getOrElse调用带有Option返回类型的函数
  * 3.如何使用模式匹配调用Option返回类型的函数
  * 4.如何使用map()函数以Option返回类型调用函数
  * 5.回顾函数calculateDonutCost()函数
  * */
object FunctionDemo2 {
  def main(args: Array[String]): Unit = {
    //功能参数中使用选项
    //1.如何在功能参数中定义选项
    println("Step 1")
    def calaulateDonutCost(donutName:String,quantity:Int,couponCode:Option[String]):Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")
      couponCode match {
        case Some(coupon) =>
          val discount = 0.1 // Let's simple a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
          totalCost
        case None => quantity * 2.50
      }
    }
    calaulateDonutCost("Total",10,None)
  }
}




































