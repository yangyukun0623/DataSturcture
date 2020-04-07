package Scala_01_basic.Scala_02_LogicStructure
/**
  * for循环
  * 1.从1到5（包含1和5）的简单for循环
  * 2.从1到5的简单for循环，其中5不包括在内
  * 3.使用for循环中的if条件过滤值
  * 4.使用for循环中的if条件过滤值，并使用yield关键字返回结果
  * 5.用于理解以遍历二维数组
  *
  * */
object Circulation {
  def main(args: Array[String]): Unit = {
    //1.从1到5（包含1和5）的简单for循环
    //关键字to表示包含第五次迭代
    println("Step 1: A simple for loop from 1 to 5 inclusive")
    for (numberOfDonuts <- 1 to 5){
      println(s"NUmber of donuts to buy = $numberOfDonuts")

    }
    println()

    //2.从1到5的简单for循环，其中5不包括在内
    //关键字until不包括迭代次数5
    println("Step 2: A simple for loop from 1 to 5,where 5 is NOT inclusive")
    for (numberOfDonuts <- 1 until 5){
      println(s"Number of donuts to buy = $numberOfDonuts")
    }
    println()

    //3.使用for循环中的if条件过滤值
    println("Step 3: Filter values using if conditions in for loop")
    val donutIngredients = List("flour","sugar","egg yolks","syrup","flavouring")
    for (ingredient <- donutIngredients if ingredient == "sugar"){
      println(s"Found sweetening ingredient = $ingredient")
    }
    println()

    //4.使用for循环中的if条件过滤值，并使用yield关键字返回结果
    println("Step 5: Filter values using if conditions in for loop and return the result back using the yield keyword")
    val sweeteningIngredients = for{
      ingredient <- donutIngredients
      if (ingredient == "sugar" || ingredient == "syrup")
    }yield ingredient
    println(s"Sweetening ingredients = $sweeteningIngredients")
    println()

    //5.用于理解以遍历二维数组
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
