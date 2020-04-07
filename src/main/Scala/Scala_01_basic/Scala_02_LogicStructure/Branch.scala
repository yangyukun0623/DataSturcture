package Scala_01_basic.Scala_02_LogicStructure
/**
  * if��else���ʽ
  * 1.����֧��ʹ��if�Ӿ���Ϊ���
  * 2.˫��֧��ʹ��if��else�Ӿ���Ϊ���
  * 3.���֧��ʹ��if��else if��else�Ӿ���Ϊ���
  * 4.ʹ��if��else�Ӿ���Ϊ���ʽ
  *
  * */
object Branch {
  def main(args: Array[String]): Unit = {
    //1.����֧��ʹ��if�Ӿ���Ϊ���
    println("Step 1:Using if clause as a statement")
    val numberOfPeople = 20
    val donutsPerPerson = 2
    if (numberOfPeople > 10)
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    println()

    //2.˫��֧��ʹ��if��else�Ӿ���Ϊ���
    println("Step 2: Using if and else clause as a statement")
    val defaultDonutsToBuy = 8
    if(numberOfPeople > 10)
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    else
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    println()

    //3.���֧��ʹ��if��else if��else�Ӿ���Ϊ���
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

    //4.ʹ��if��else�Ӿ���Ϊ���ʽ
    println("Step 4: Using if and else clause as expression")
    val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
    println(s"Number of donuts to buy = $numberOfDonutsToBuy")


  }
}
