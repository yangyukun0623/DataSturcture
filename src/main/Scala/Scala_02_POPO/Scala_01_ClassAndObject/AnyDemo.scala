package Scala_02_POPO.Scala_01_ClassAndObject
/**
  * Scala的类型层次结构
  * Any类型是Scala类层次结构中最顶层的
  * 1.声明一个Any类型的变量
  * 2.声明一个类型为AnyRef的变量
  * 3.声明一个类型为AnyVal的变量
  * */
object AnyDemo {
  def main(args: Array[String]): Unit = {
    //1.声明一个Any类型的变量
    println("Step 1: Declare a variable of type Any")
    val favoriteDonut: Any = "Glazed Donut"
    println(s"favoriteDonut of type Any = $favoriteDonut")

    //2.声明一个类型为AnyRef的变量
    println("\nStep 2: Declare a variable of type AnyRef")
    val donutName: AnyRef = "Glazed Donut"
    println(s"donutName of type AnyRef = $donutName")

    //3.声明一个类型为AnyVal的变量
    println("\nStep 3: Declare a variable of type AnyVal")
    val donutPrice: AnyVal = 2.50
    println(s"donutPrice of type AnyVal = $donutPrice")
  }
}
