package Scala_01_basic.Scala_05_FunctionAndMethod

/**
  * ���ܲ�����ʹ��ѡ��
  * 1.����ڹ��ܲ����ж���ѡ��
  * 2.��ε��þ���Option�����ĺ���
  * 3.���Ϊѡ���������Ĭ��ֵ
  * 4.��ε�����Option��������Ĭ��ֵ�ĺ���
  *
  * ʹ��ѡ������ʹ�������
  * 1.��ζ���һ������String����Option����
  * 2.���ʹ��getOrElse���ô���Option�������͵ĺ���
  * 3.���ʹ��ģʽƥ�����Option�������͵ĺ���
  * 4.���ʹ��map()������Option�������͵��ú���
  * 5.�ع˺���calculateDonutCost()����
  * */
object FunctionDemo2 {
  def main(args: Array[String]): Unit = {
    //���ܲ�����ʹ��ѡ��
    //1.����ڹ��ܲ����ж���ѡ��
    println("Step 1")
    def calaulateDonutCost(donutName:String,quantity:Int,couponCode:Option[String]):Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")
      couponCode match {
        case Some(coupon) =>
          val discount = 0.1 // Let's simple a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
          totalCost
        case None => quantity * 2.50
      }
    }
    calaulateDonutCost("Total",10,None)
  }
}




































