package Scala_01_basic.Scala_03_ParttenMatch
/**
  * ���ʹ��Option��Some��None
  * 1.���ʹ��Option��Some- һ������ʾ��
  * 2.���ʹ��Option��None- һ������ʾ��
  * 3.�����ѡ����ʹ��ģʽƥ��
  * */
object OptionSomeNone {
  def main(args: Array[String]): Unit = {
    //1.���ʹ��Option��Some- һ������ʾ��
    println("Step 1: How to use Option and Some - a basic example")
    val glazedDonutTaste: Option[String] = Some("Very Tasty")
    println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

    //2.���ʹ��Option��None- һ������ʾ��
    println("\nStep 2: How to use Option and None - a basic example")
    val glazedDonutName: Option[String] = None
    println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

    //3.�����ѡ����ʹ��ģʽƥ��
    println("\nStep 3: How to use Pattern Matching with Option")
    glazedDonutName match {
      case Some(name) => println(s"Received donut name = $name")
      case None       => println(s"No donut name was found!")
    }

    println("\nTip 1: Filter None using map function")
    glazedDonutTaste.map(taste => println(s"glazedDonutTaste = $taste"))
    glazedDonutName.map(name => println(s"glazedDonutName = $name"))
  }
}
