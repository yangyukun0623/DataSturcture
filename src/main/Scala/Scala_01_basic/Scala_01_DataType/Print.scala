package Scala_01_basic.Scala_01_DataType

object
Print {
  def main(args: Array[String]): Unit = {
    /**
      * Scala�ַ�����ֵ-��ӡ�͸�ʽ������
      * 1.ʹ���ַ�����ֵ���ӡ����
      * 2.�ڶ���������ʹ���ַ�����ֵ
      * 3.ʹ���ַ�����ֵ������ʽ
      * 4.ʹ���ַ�����ֵ�������ı���ʽ
      * 5.ʹ��f��ֵ��ʽ������
      * 6.ʹ��ԭʼ��ֵ
      * */
    //1.ʹ���ַ�����ֵ���ӡ����
    //��println��俪ͷ���ǰ׺s
    //ʹ����Ԫ����$�����ñ���
    println("Step 1: Using String interpolation to print a variable")
    var favorite: String = "Glazed Donut"
    println(s"My favorite donut = $favorite")
    println()

    //2.�ڶ���������ʹ���ַ�����ֵ
    //����������
    //case ���Ǵ���������һ�ַ���������Java�еĴ���Plain Old Java Object(POJO)
    println("Step 2: Using String interpolation on object properties")
    case class Donut(name:String, ages:Int)
    var donut2: Donut = Donut("���̲�",23)
    println(s"My favorite donut name = ${donut2.name}, ages = ${donut2.ages}")
    println()

    //3.ʹ���ַ�����ֵ������ʽ
    //ͨ��ʹ�û��������ַ�����ֵ���ڱ��ʽ
    println("Step 3: Using String interpolation to evaluate expressions")
    var donut3: Int = 10
    println(s"Are we buying 10 donuts = ${donut3 == 10}")
    println()

    //4.ʹ���ַ�����ֵ�������ı���ʽ
    //���ı�ǰ�����һЩ�ո��������ַ�����ʽ
    println("Step 4: Using String interpolation for formatting text")
    var donutName: String = "Vanilla Donut"
    var donutTast: String = "Tasty"
    println(f"$donutName%20s $donutTast")
    println()

    //5.ʹ��f��ֵ��ʽ������
    println("Step 5: Using f interpolation to format numbers")
    var donutPrice: Double = 2.50
    println(s"Donut price = $donutPrice")
    //Ϊ������ӡС�������λ
    println(f"Formatted donut price = $donutPrice%.2f")
    println()

    //6.ʹ��ԭʼ��ֵ
    //��ԭ��·�߲�ֵ����������ӡ�κ�  ���ŵ��ַ����С��������ʾ���У�
    // ����Ҫ��ӡ����Ȧ���ƺ��\ t�������ǽ�\ t�������Ʊ���ռ�
    println("Step 6: Using raw interpolation")
    var donut: String = "Vanilla Donut"
    println(raw"Favorite donut\t$donut")
  }
}
