package Scala_01_basic.Scala_03_ParttenMatch
/**
  * Scala 的功能特征,即模式匹配
  * 1.模式匹配101-一个非常基本的示例
  * 2.模式匹配并返回结果
  * 3.使用通配符运算符进行模式匹配
  * 4.在相同条件下与两个或多个项目进行模式匹配
  * 5.模式匹配和在case子句中使用if表达式
  * 6.按类型进行模式匹配
  *
  * */
object Match {
  def main(args: Array[String]): Unit = {
    //1.模式匹配101-一个非常基本的示例
    println("Step 1: Pattern matching 101 - a very basic example")
    val donutType = "Glazed Donut"
    donutType match {
      case "Glazed Donut" => println("Very tasty")
      case "Plain Donut" => println("Tasty")
    }

    //2.模式匹配并返回结果
    println("\nStep 2: Pattern matching and return the result")
    val tasteLevel = donutType match {
      case "Glazed Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel")

    //3.使用通配符运算符进行模式匹配
    println("\nStep 3: Pattern matching using the wildcard operator")
    val tasteLevel2 = donutType match {
      case "Glazed Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel2")

    //4.在相同条件下与两个或多个项目进行模式匹配
    println("\nStep 4: Pattern matching with two or more items on the same condition")
    val tasteLevel3 = donutType match {
      case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel3")

    //5.模式匹配和在case子句中使用if表达式
    println("\nStep 5; Pattern matching and using if expressions in the case clause")
    val tasteLevel4 = donutType match {
      case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel4")

    //6.按类型进行模式匹配
    println("\nStep 6: Pattern matching by types")
    val priceOfDonut:Any = 2.50
    val priceType = priceOfDonut match {
      case price:Int => "int"
      case price:Double => "Double"
      case price:Float => "Float"
      case price:String => "String"
      case price:Boolean => "Boolean"
      case price:Char => "Char"
      case price:Long => "Long"
    }
    println(s"Donut price type = $priceType")
  }
}
