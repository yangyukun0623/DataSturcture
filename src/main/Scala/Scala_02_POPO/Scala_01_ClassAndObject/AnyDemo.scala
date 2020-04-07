package Scala_02_POPO.Scala_01_ClassAndObject
/**
  * Scala�����Ͳ�νṹ
  * Any������Scala���νṹ������
  * 1.����һ��Any���͵ı���
  * 2.����һ������ΪAnyRef�ı���
  * 3.����һ������ΪAnyVal�ı���
  * */
object AnyDemo {
  def main(args: Array[String]): Unit = {
    //1.����һ��Any���͵ı���
    println("Step 1: Declare a variable of type Any")
    val favoriteDonut: Any = "Glazed Donut"
    println(s"favoriteDonut of type Any = $favoriteDonut")

    //2.����һ������ΪAnyRef�ı���
    println("\nStep 2: Declare a variable of type AnyRef")
    val donutName: AnyRef = "Glazed Donut"
    println(s"donutName of type AnyRef = $donutName")

    //3.����һ������ΪAnyVal�ı���
    println("\nStep 3: Declare a variable of type AnyVal")
    val donutPrice: AnyVal = 2.50
    println(s"donutPrice of type AnyVal = $donutPrice")
  }
}
