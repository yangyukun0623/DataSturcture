package Scala_01_basic.Scala_02_LogicStructure
/**
  * forѭ��
  * 1.��1��5������1��5���ļ�forѭ��
  * 2.��1��5�ļ�forѭ��������5����������
  * 3.ʹ��forѭ���е�if��������ֵ
  * 4.ʹ��forѭ���е�if��������ֵ����ʹ��yield�ؼ��ַ��ؽ��
  * 5.��������Ա�����ά����
  *
  * */
object Circulation {
  def main(args: Array[String]): Unit = {
    //1.��1��5������1��5���ļ�forѭ��
    //�ؼ���to��ʾ��������ε���
    println("Step 1: A simple for loop from 1 to 5 inclusive")
    for (numberOfDonuts <- 1 to 5){
      println(s"NUmber of donuts to buy = $numberOfDonuts")

    }
    println()

    //2.��1��5�ļ�forѭ��������5����������
    //�ؼ���until��������������5
    println("Step 2: A simple for loop from 1 to 5,where 5 is NOT inclusive")
    for (numberOfDonuts <- 1 until 5){
      println(s"Number of donuts to buy = $numberOfDonuts")
    }
    println()

    //3.ʹ��forѭ���е�if��������ֵ
    println("Step 3: Filter values using if conditions in for loop")
    val donutIngredients = List("flour","sugar","egg yolks","syrup","flavouring")
    for (ingredient <- donutIngredients if ingredient == "sugar"){
      println(s"Found sweetening ingredient = $ingredient")
    }
    println()

    //4.ʹ��forѭ���е�if��������ֵ����ʹ��yield�ؼ��ַ��ؽ��
    println("Step 5: Filter values using if conditions in for loop and return the result back using the yield keyword")
    val sweeteningIngredients = for{
      ingredient <- donutIngredients
      if (ingredient == "sugar" || ingredient == "syrup")
    }yield ingredient
    println(s"Sweetening ingredients = $sweeteningIngredients")
    println()

    //5.��������Ա�����ά����
    println("Step 5: Using for comprehension to loop through 2-Dimensional array")
    val twoDimensionalArray = Array.ofDim[String](2,2)
    twoDimensionalArray(0)(0) = "filter"
    twoDimensionalArray(0)(1) = "sugar"
    twoDimensionalArray(1)(0) = "egg"
    twoDimensionalArray(1)(1) = "syrup"
    for {
      x <- 0 until 2
      y <- 0 until 2
    }println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")

  }
}
