package Scala_01_basic.Scala_03_ParttenMatch
/**
  * 如何使用Option，Some和None
  * 1.如何使用Option和Some- 一个基本示例
  * 2.如何使用Option和None- 一个基本示例
  * 3.如何在选项中使用模式匹配
  * */
object OptionSomeNone {
  def main(args: Array[String]): Unit = {
    //1.如何使用Option和Some- 一个基本示例
    println("Step 1: How to use Option and Some - a basic example")
    val glazedDonutTaste: Option[String] = Some("Very Tasty")
    println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

    //2.如何使用Option和None- 一个基本示例
    println("\nStep 2: How to use Option and None - a basic example")
    val glazedDonutName: Option[String] = None
    println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

    //3.如何在选项中使用模式匹配
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
