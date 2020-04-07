package Scala_02_POPO.Scala_02_Enum
/**
  * 创建和使用枚举
  * 1.如何创建枚举
  * 2.如何打印枚举的String值
  * 3.如何打印枚举的ID值
  * 4.如何打印枚举中列出的所有值
  * 5.如何对枚举值进行模式匹配
  * 6.如何更改枚举值的默认顺序
  * */
object EnumDemo {
  def main(args: Array[String]): Unit = {
    //1.如何创建枚举
    println("Step 1: How to create an enumeration")
    object Donut extends Enumeration {
      type Donut = Value
      val Glazed      = Value("Glazed")
      val Strawberry  = Value("Strawberry")
      val Plain       = Value("Plain")
      val Vanilla     = Value("Vanilla")
    }

    //2.如何打印枚举的String值
    println("\nStep 2: How to print the String value of the enumeration")
    println(s"Vanilla Donut string value = ${Donut.Vanilla}")

    //3.如何打印枚举的ID值
    println("\nStep 3: How to print the id of the enumeration")
    println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

    //4.如何打印枚举中列出的所有值
    println("\nStep 4: How to print all the values listed in Enumeration")
    println(s"Donut types = ${Donut.values}")

    //5.如何对枚举值进行模式匹配
    println("\nStep 5: How to pattern match on enumeration values")
    Donut.values.foreach {
      case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
      case _ => None
    }

    //6.如何更改枚举值的默认顺序
    println("\nStep 6: How to change the default ordering of enumeration values")
    object DonutTaste extends Enumeration{
      type DonutTaste = Value
      val Tasty       = Value(0, "Tasty")
      val VeryTasty   = Value(1, "Very Tasty")
      val Ok          = Value(-1, "Ok")
    }
    println(s"Donut taste values = ${DonutTaste.values}")
    println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")
  }
}







































