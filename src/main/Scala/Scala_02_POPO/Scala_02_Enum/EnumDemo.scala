package Scala_02_POPO.Scala_02_Enum
/**
  * ������ʹ��ö��
  * 1.��δ���ö��
  * 2.��δ�ӡö�ٵ�Stringֵ
  * 3.��δ�ӡö�ٵ�IDֵ
  * 4.��δ�ӡö�����г�������ֵ
  * 5.��ζ�ö��ֵ����ģʽƥ��
  * 6.��θ���ö��ֵ��Ĭ��˳��
  * */
object EnumDemo {
  def main(args: Array[String]): Unit = {
    //1.��δ���ö��
    println("Step 1: How to create an enumeration")
    object Donut extends Enumeration {
      type Donut = Value
      val Glazed      = Value("Glazed")
      val Strawberry  = Value("Strawberry")
      val Plain       = Value("Plain")
      val Vanilla     = Value("Vanilla")
    }

    //2.��δ�ӡö�ٵ�Stringֵ
    println("\nStep 2: How to print the String value of the enumeration")
    println(s"Vanilla Donut string value = ${Donut.Vanilla}")

    //3.��δ�ӡö�ٵ�IDֵ
    println("\nStep 3: How to print the id of the enumeration")
    println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

    //4.��δ�ӡö�����г�������ֵ
    println("\nStep 4: How to print all the values listed in Enumeration")
    println(s"Donut types = ${Donut.values}")

    //5.��ζ�ö��ֵ����ģʽƥ��
    println("\nStep 5: How to pattern match on enumeration values")
    Donut.values.foreach {
      case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
      case _ => None
    }

    //6.��θ���ö��ֵ��Ĭ��˳��
    println("\nStep 6: How to change the default ordering of enumeration values")
    object DonutTaste extends Enumeration{
      type DonutTaste = Value
      val Tasty       = Value(0, "Tasty")
      val VeryTasty   = Value(1, "Very Tasty")
      val Ok          = Value(-1, "Ok")
    }
    println(s"Donut taste values = ${DonutTaste.values}")
    println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")
  }
}







































