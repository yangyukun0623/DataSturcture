package Scala_02_POPO.Scala_01_ClassAndObject

import java.util.Scanner

object CatDemo {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)

    //����һֻè
    val cat = new Cat
    //��è�����Ը�ֵ
    //˵��
    //1.cat.name = "С��" ��ʵ����ֱ�ӷ������ԣ�����cat.name_$eq("С��")
    //2.cat.name �ȼ��� cat.name()
    cat.name = "С��"
    cat.age = 10
    cat.color = "��ɫ"
    println("ok~")
    printf("\nСè��Ϣ����:%s %d %s",cat.name,cat.age,cat.color)
  }

  //����һ����Cat
  //һ��class Cat��Ӧ���ֽ����ļ�ֻ��һ��Cat.class��Ĭ����public
  class Cat{
    //����/������������
    //˵��
    //1.������������var name:Stringʱ���ڵײ��Ӧprivate name
    //2.ͬʱ��������public����name()<=����=>getter public name_$eq()=>setter
    var name:String = ""//����ʼֵ
    var age:Int = _ // _��ʾ��ageһ��Ĭ��ֵ�����IntĬ��0
    var color:String = _ //_��colorĬ��ֵ�����String��Ĭ�Ͼ���""
  }
}
