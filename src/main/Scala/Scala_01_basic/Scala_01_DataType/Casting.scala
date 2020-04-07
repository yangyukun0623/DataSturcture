package Scala_01_basic.Scala_01_DataType

import java.util.Scanner

/**
  * �ġ������ƶ�
  * 1.Scala�����ƶ�
  * 2.ʹ����������Scala֧�ֵ�����
  * 3.ʹ��Scala��������һ����������ת����Ϊ��һ������
  * */
object Casting {
  def main(args: Array[String]): Unit = {
    var in:Int = new Scanner(System.in).nextInt()
    println(in)

    //1.�����ƶ�
    println("Step 1: Immutable variable")
    //val donutsToBuy: Int = 5
    val donutsBought = 5
    println()

    //2.ʹ����������Scala֧�ֵ�����
    println("Step 2: Scala Types")
    val donutsBoughtToday = 5
    val bigNumberOfDonuts = 100000000L
    val smallNumberOfDonuts = 1
    val priceOfDonut = 2.50
    val donutPrice = 2.50f
    val donutStoreName = "Allaboutscala Donut Store"
    val donutByte = 0xa
    val donutFirstLetter = 'D'
    val nothing = ()
    println()

    //3.����ת��
    println("Step 3: Using Scala compiler to convert from one data type to another")
    val numberOfDonuts: Short = 1
    val minimumDonutsToBuy: Int = numberOfDonuts

    //4.�û�����ת��
    val  minimumDonutsToSell:String = numberOfDonuts.toString()

  }
}
















