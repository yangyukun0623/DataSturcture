package Scala_01_basic.Scala_01_DataType

object
Print {
  def main(args: Array[String]): Unit = {
    /**
      * Scala字符串插值-打印和格式化变量
      * 1.使用字符串插值类打印变量
      * 2.在对象属性上使用字符串插值
      * 3.使用字符串插值计算表达式
      * 4.使用字符串插值来设置文本格式
      * 5.使用f插值格式化数字
      * 6.使用原始插值
      * */
    //1.使用字符串插值类打印变量
    //在println语句开头添加前缀s
    //使用美元符号$来引用变量
    println("Step 1: Using String interpolation to print a variable")
    var favorite: String = "Glazed Donut"
    println(s"My favorite donut = $favorite")
    println()

    //2.在对象属性上使用字符串插值
    //创建案例类
    //case 类是创建域对象的一种方法，类似Java中的创建Plain Old Java Object(POJO)
    println("Step 2: Using String interpolation on object properties")
    case class Donut(name:String, ages:Int)
    var donut2: Donut = Donut("王继昌",23)
    println(s"My favorite donut name = ${donut2.name}, ages = ${donut2.ages}")
    println()

    //3.使用字符串插值计算表达式
    //通过使用花括号在字符串插值用于表达式
    println("Step 3: Using String interpolation to evaluate expressions")
    var donut3: Int = 10
    println(s"Are we buying 10 donuts = ${donut3 == 10}")
    println()

    //4.使用字符串插值来设置文本格式
    //在文本前面添加一些空格来设置字符串格式
    println("Step 4: Using String interpolation for formatting text")
    var donutName: String = "Vanilla Donut"
    var donutTast: String = "Tasty"
    println(f"$donutName%20s $donutTast")
    println()

    //5.使用f插值格式化数字
    println("Step 5: Using f interpolation to format numbers")
    var donutPrice: Double = 2.50
    println(s"Donut price = $donutPrice")
    //为变量打印小数点后两位
    println(f"Formatted donut price = $donutPrice%.2f")
    println()

    //6.使用原始插值
    //该原料路线插值将允许您打印任何  符号的字符串中。在下面的示例中，
    // 我们要打印甜甜圈名称后跟\ t，而不是将\ t评估到制表符空间
    println("Step 6: Using raw interpolation")
    var donut: String = "Vanilla Donut"
    println(raw"Favorite donut\t$donut")
  }
}
