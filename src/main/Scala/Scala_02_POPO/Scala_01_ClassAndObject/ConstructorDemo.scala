package Scala_02_POPO.Scala_01_ClassAndObject

object ConstructorDemo {
  /**
    * Scala�������Ļ����﷨
    * class ����(�β�����){ //��������
    *     //����
    *     def this(�β��б�){ //����������
    *     }
    *
    *     def this(�β��б�){ //���������������ж��
    *     }
    * }
    *
    * //1.������������������Ϊthis�������ж����������ͨ����ͬ����������
    *
    * Scala������ע�������ϸ��
    * 1��Scala��������������ɶ��¶���ĳ�ʼ����������û�з���ֵ��
    * 2����������������ֱ�ӷ���������֮��[������]
    * 3������������ִ���ඨ���е��������
    * 4��������������޲�����С���ſ���ʡ�ԡ���������ʱ���õĹ��췽����С����Ҳ����ʡ��
    * 5����������������Ϊthis���������������ͨ����ͬ�����б��������
    * */
  def main(args: Array[String]): Unit = {

  }

  class Person(inName:String,intAge:Int){
    var name:String = inName
    var age:Int = intAge
    age += 10
    println("~~~~~~~~~~")

    override def toString: String = {
      "name=" + this.name + "\t age=" + this.age
    }

    println("ok~~~~~~~~")
    println("age=" + age)

    def this(name:String){
      //�����������������ڵ�һ����ʾ������������
      this("jack",10)
      //this
      this.name = name //���¸�ֵ
    }
  }
}
