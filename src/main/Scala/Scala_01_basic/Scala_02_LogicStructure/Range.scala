package Scala_01_basic.Scala_02_LogicStructure
/**
  * 如何使用Scala Range
  *
  * 1.创建一个从1到5（含）的简单数字范围
  *  2.创建一个从1到5的数字范围，但不包括最后一个整数5
  *  3.创建一个从0到10的数字范围，但以2的倍数递增
  *  4.创建一个字母范围来表示字符a到z
  *  5.字符范围按用户指定的增量
  *  6.将Scala Range转换为集合
  *
  *
  * */
object Range {
  def main(args: Array[String]): Unit = {
    //1.创建一个从1到5（含）的简单数字范围
    println("Step 1: Create a simple numeric range from 1 to inclusive")
    val from1To5 = 1 to 5
    println(s"Range from 1 to 5 inclusive = $from1To5")
    println()

    //2.创建一个从1到5的数字范围，但不包括最后一个整数5
    println("Step 2: Create a numberic range from 1 to 5 but excluding the last integer number 5")
    val from1Until5 = 1 until 5
    println(s"Range from 1 until 5 where 5 is excluded = $from1Until5")
    println()

    //3.创建一个从0到10的数字范围，但以2的倍数递增
    println("Step 3: Create a numberic range from 0 to 10 but increment with multiples of 2")
    var from0To10By2 = 0 to 10 by 2
    println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")
    println()

    //4.创建一个字母范围类表示字母a到z
    println("Step 4: Craete an alphabetical range to represent letter a to z")
    val alphabetRangeFromAToZ = 'a' to 'z'
    println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")
    println()

    //5.字符范围按用户指定的增量
    println("Step 5: Character ranges with user specified increment")
    val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
    println(s"Range of every other alphabet = $alphabetRangeFromAToZBy2")
    println()

    //6.将Scala Range转换为集合
    //调用.toList，.toSet和.toSeq函数，将范围相应地转换为List，Set和Sequence
    //调用转换函数时，我们跳过了（），而是使用.toList而不是.toList（）
    //调用.mkString（）函数来创建每种集合类型的字符串表示形式
    //如何将范围转换为List，Set，Sequence和Array之类的集合。然后，我们使用mkString（）函数为集合中的元素创建字符串表示形式
    println("Step 6: Storing our ranges into collections")
    val listFrom1To5 = (1 to 5).toList
    println(s"Range to list = ${listFrom1To5.mkString(" ")}")
    val setFrom1To5 = (1 to 5).toSet
    println(s"Range to set = ${setFrom1To5.mkString(" ")}")
    val sequenceFrom1To5 = (1 to 5).toSeq
    println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")
    val arrayFrom1To5 = (1 to 5).toArray
    println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")
    //要访问和打印集合中的每个元素，您可以同样方便地使用foreach（）函数。
    arrayFrom1To5.foreach(println(_))
  }
}
