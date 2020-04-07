package Scala_01_basic.Scala_02_LogicStructure
/**
  * while循环构造对某些数据点进行迭代
  * 1.如何在Scala中使用while循环
  * 2.如何在Scala中使用do while循环
  *
  *
  * */
object DoWhile {
  def main(args: Array[String]): Unit = {
    //1.如何在Scala中使用while循环
    println("Step 1: How to use while loop in Scala")
    var numberOfDonutsToBake = 10
    while (numberOfDonutsToBake > 0) {
      println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
      numberOfDonutsToBake -= 1
    }

    //2.如何在Scala中使用do while循环
    println("\nStep 2: How to use do while loop in Scala")
    var numberOfDonutsBaked = 0
    do {
      numberOfDonutsBaked += 1
      println(s"Number of donuts baked = $numberOfDonutsBaked")
    } while (numberOfDonutsBaked < 5)
  }
}
