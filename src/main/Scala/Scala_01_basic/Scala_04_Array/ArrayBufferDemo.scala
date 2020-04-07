package Scala_01_basic.Scala_04_Array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    val b = new ArrayBuffer[Int]()
    //һ���յ����黺�壬׼���������
    b += 1
    println(b)
    //ArrayBuffer(1)
    //��+=��β�����Ԫ��
    b += (2,3,4,5)
    println(b)
    //ArrayBuffer(1,2,3,4,5)
    //��β����Ӷ��Ԫ�أ������Ű�����
    b ++= Array(8,13,21)
    println(b)
    //ArrayBuffer(1,2,3,4,5,8,13,21)
    //�������++=������׷���κμ���
    b.trimEnd(5)
    println(b)
    //ArrayBuffer(1,2,3)
    //�Ƴ����5��Ԫ��
    b.insert(2,6)
    println(b)
    //���±�2֮ǰ����6
    b.remove(2)
    println(b)
    //�Ƴ���2��Ԫ��
    b.remove(0,3)
    //�Ƴ��ӵ�0��λ�õ�����Ԫ��
    println(b)
  }
}
