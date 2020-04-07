package Scala_01_basic.Scala_02_LogicStructure
/**
  * whileѭ�������ĳЩ���ݵ���е���
  * 1.�����Scala��ʹ��whileѭ��
  * 2.�����Scala��ʹ��do whileѭ��
  *
  *
  * */
object DoWhile {
  def main(args: Array[String]): Unit = {
    //1.�����Scala��ʹ��whileѭ��
    println("Step 1: How to use while loop in Scala")
    var numberOfDonutsToBake = 10
    while (numberOfDonutsToBake > 0) {
      println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
      numberOfDonutsToBake -= 1
    }

    //2.�����Scala��ʹ��do whileѭ��
    println("\nStep 2: How to use do while loop in Scala")
    var numberOfDonutsBaked = 0
    do {
      numberOfDonutsBaked += 1
      println(s"Number of donuts baked = $numberOfDonutsBaked")
    } while (numberOfDonutsBaked < 5)
  }
}
