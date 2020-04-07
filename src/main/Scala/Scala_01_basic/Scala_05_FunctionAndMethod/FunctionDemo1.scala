package Scala_01_basic.Scala_05_FunctionAndMethod
/**
  * ��δ�����ʹ�ú���
  * 1.��ζ����ʹ��û�в����Ҿ��з������͵ĺ�����
  * 2.��ζ����ʹ�ò������ŵĺ���
  * 3.��ζ����ʹ��û�з������͵ĺ���
  *
  * ʹ�ò�����������
  * 1.����ò������幦��
  * 2.���ʹ�ò������ú���
  * 3.����ڹ��ܲ��������Ĭ��ֵ
  * 4.���ʹ�þ���Ĭ��ֵ�Ĳ������ú���
  *
  * */
object FunctionDemo1 {
  def main(args: Array[String]): Unit = {
    //��δ�����ʹ�ú���
    //1.��ζ����ʹ��û�в����Ҿ��з������͵ĺ���
    println("Step 1: How to define and use a function which has no parameters and has a return type")
    def favoriteDonut():String = {
      "Glazed Donut"
    }
    //�������������һ���ǽ����ظ����÷�����һ��
    val myFavoriteDonut = favoriteDonut()
    println(s"My favorite donut is $myFavoriteDonut")

    //2.��ζ����ʹ�ò������ŵĺ���
    println("\nStep 2: How to define and use a function with no parenthesis")
    def leastFavoriteDonut = "Plain Donut"
    println(s"My least favorite donut is $leastFavoriteDonut")

    //3.��ζ����ʹ��û�з������͵ĺ���
    println("\nStep 3: How to define and use a function with no return type")
    def printDonutSalesReport(): Unit = {
      // lookup sales data in database and create some report
      println("Printing donut sales report... done!")
    }
    printDonutSalesReport()

    //ʹ�ò�����������
    //1.����ò������幦��
    println("Step 1: How to define function with parameters")
    def calculateDonutCost(donutName: String, quantity: Int): Double = {
      println(s"Calculating cost for $donutName, quantity = $quantity")
      // make some calculations ...
      2.50 * quantity
    }

    //2.���ʹ�ò������ú���
    println("\nStep 2: How to call a function with parameters")
    val totalCost = calculateDonutCost("Glazed Donut",5)
    println(s"Total cost of donut = ${totalCost}")
  }
}
