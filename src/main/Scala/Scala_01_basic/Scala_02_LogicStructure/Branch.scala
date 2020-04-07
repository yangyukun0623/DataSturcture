package Scala_01_basic.Scala_02_LogicStructure
/**
  * if和else表达式
  * 1.单分支：使用if子句作为语句
  * 2.双分支：使用if和else子句作为语句
  * 3.多分支：使用if，else if和else子句作为语句
  * 4.使用if和else子句作为表达式
  *
  * */
object Branch {
  def main(args: Array[String]): Unit = {
    //1.单分支：使用if子句作为语句
    println("Step 1:Using if clause as a statement")
    val numberOfPeople = 20
    val donutsPerPerson = 2
    if (numberOfPeople > 10)
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    println()

    //2.双分支：使用if和else子句作为语句
    println("Step 2: Using if and else clause as a statement")
    val defaultDonutsToBuy = 8
    if(numberOfPeople > 10)
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    else
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    println()

    //3.多分支：使用if，else if和else子句作为语句
    println("Step 3: Using if, else if, and else clause as a statement")
    if(numberOfPeople > 10) {
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    } else if (numberOfPeople == 0) {
      println("Number of people is zero.")
      println("No need to buy donuts.")
    } else {
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    }
    println()

    //4.使用if和else子句作为表达式
    println("Step 4: Using if and else clause as expression")
    val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
    println(s"Number of donuts to buy = $numberOfDonutsToBuy")


  }
}
