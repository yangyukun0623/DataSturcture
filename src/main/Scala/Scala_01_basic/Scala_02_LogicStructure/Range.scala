package Scala_01_basic.Scala_02_LogicStructure
/**
  * ���ʹ��Scala Range
  *
  * 1.����һ����1��5�������ļ����ַ�Χ
  *  2.����һ����1��5�����ַ�Χ�������������һ������5
  *  3.����һ����0��10�����ַ�Χ������2�ı�������
  *  4.����һ����ĸ��Χ����ʾ�ַ�a��z
  *  5.�ַ���Χ���û�ָ��������
  *  6.��Scala Rangeת��Ϊ����
  *
  *
  * */
object Range {
  def main(args: Array[String]): Unit = {
    //1.����һ����1��5�������ļ����ַ�Χ
    println("Step 1: Create a simple numeric range from 1 to inclusive")
    val from1To5 = 1 to 5
    println(s"Range from 1 to 5 inclusive = $from1To5")
    println()

    //2.����һ����1��5�����ַ�Χ�������������һ������5
    println("Step 2: Create a numberic range from 1 to 5 but excluding the last integer number 5")
    val from1Until5 = 1 until 5
    println(s"Range from 1 until 5 where 5 is excluded = $from1Until5")
    println()

    //3.����һ����0��10�����ַ�Χ������2�ı�������
    println("Step 3: Create a numberic range from 0 to 10 but increment with multiples of 2")
    var from0To10By2 = 0 to 10 by 2
    println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")
    println()

    //4.����һ����ĸ��Χ���ʾ��ĸa��z
    println("Step 4: Craete an alphabetical range to represent letter a to z")
    val alphabetRangeFromAToZ = 'a' to 'z'
    println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")
    println()

    //5.�ַ���Χ���û�ָ��������
    println("Step 5: Character ranges with user specified increment")
    val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
    println(s"Range of every other alphabet = $alphabetRangeFromAToZBy2")
    println()

    //6.��Scala Rangeת��Ϊ����
    //����.toList��.toSet��.toSeq����������Χ��Ӧ��ת��ΪList��Set��Sequence
    //����ת������ʱ�����������ˣ���������ʹ��.toList������.toList����
    //����.mkString��������������ÿ�ּ������͵��ַ�����ʾ��ʽ
    //��ν���Χת��ΪList��Set��Sequence��Array֮��ļ��ϡ�Ȼ������ʹ��mkString��������Ϊ�����е�Ԫ�ش����ַ�����ʾ��ʽ
    println("Step 6: Storing our ranges into collections")
    val listFrom1To5 = (1 to 5).toList
    println(s"Range to list = ${listFrom1To5.mkString(" ")}")
    val setFrom1To5 = (1 to 5).toSet
    println(s"Range to set = ${setFrom1To5.mkString(" ")}")
    val sequenceFrom1To5 = (1 to 5).toSeq
    println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")
    val arrayFrom1To5 = (1 to 5).toArray
    println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")
    //Ҫ���ʺʹ�ӡ�����е�ÿ��Ԫ�أ�������ͬ�������ʹ��foreach����������
    arrayFrom1To5.foreach(println(_))
  }
}
