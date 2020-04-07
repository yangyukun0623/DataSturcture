package Scala_02_POPO.Scala_01_ClassAndObject

import scala.beans.BeanProperty

object Object {
  class Counter{
    /**
      * Scala�����㽫����Ȩ����ָ�����ࡣprivate[����]���η����Զ������
      * ָ����ķ������Է��ʸ������ֶΡ���������������ǵ�ǰ������࣬����
      * ����������ⲿ��
      * */
    private[this] var v = 0 //������ĳ������.v�����ķ��ʽ���������

    private var value = 0
    def increment() { value += 1}
    def isLess(other:Counter) = value > other.value

  }

  /**
    * ��Scala�ֶα�עΪ@BeanProperty���Զ����������ķ���
    * */
  class Person{

    @BeanProperty var name:String = _
    //���������ĸ�����
    //1.name:String
    //2.name_=(newValue:String):Unit
    //3.getName():String
    //4.setName(newValue:String):Unit
  }
}
