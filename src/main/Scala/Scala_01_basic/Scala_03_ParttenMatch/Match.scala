package Scala_01_basic.Scala_03_ParttenMatch
/**
  * Scala �Ĺ�������,��ģʽƥ��
  * 1.ģʽƥ��101-һ���ǳ�������ʾ��
  * 2.ģʽƥ�䲢���ؽ��
  * 3.ʹ��ͨ������������ģʽƥ��
  * 4.����ͬ������������������Ŀ����ģʽƥ��
  * 5.ģʽƥ�����case�Ӿ���ʹ��if���ʽ
  * 6.�����ͽ���ģʽƥ��
  *
  * */
object Match {
  def main(args: Array[String]): Unit = {
    //1.ģʽƥ��101-һ���ǳ�������ʾ��
    println("Step 1: Pattern matching 101 - a very basic example")
    val donutType = "Glazed Donut"
    donutType match {
      case "Glazed Donut" => println("Very tasty")
      case "Plain Donut" => println("Tasty")
    }

    //2.ģʽƥ�䲢���ؽ��
    println("\nStep 2: Pattern matching and return the result")
    val tasteLevel = donutType match {
      case "Glazed Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel")

    //3.ʹ��ͨ������������ģʽƥ��
    println("\nStep 3: Pattern matching using the wildcard operator")
    val tasteLevel2 = donutType match {
      case "Glazed Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel2")

    //4.����ͬ������������������Ŀ����ģʽƥ��
    println("\nStep 4: Pattern matching with two or more items on the same condition")
    val tasteLevel3 = donutType match {
      case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel3")

    //5.ģʽƥ�����case�Ӿ���ʹ��if���ʽ
    println("\nStep 5; Pattern matching and using if expressions in the case clause")
    val tasteLevel4 = donutType match {
      case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
      case "Plain Donut" => "Tasty"
      case _ => "Tasty"
    }
    println(s"Taste level of $donutType = $tasteLevel4")

    //6.�����ͽ���ģʽƥ��
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
