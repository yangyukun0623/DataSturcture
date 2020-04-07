package Scala_02_POPO.Scala_01_ClassAndObject

object Constructor {

  class Perons{

    /*
    * ���һ����û����ʾ���������������Զ�
    * ӵ��һ���޲ι�����
    * */
    private var name = ""
    private var age = 0

    def this(name:String){ //����������
      this()   //������������
      this.name = name
    }

    def this(name:String, age:Int){ //��һ������������
      this(name)  //����ǰһ������������
      this.age = age
    }


    /**
      * �������ַ�ʽ��������
      * */
    def main(args: Array[String]): Unit = {
      val p1 = new Perons  //��������
      val p2 = new Perons("Fred")  //��һ������������
      val p3 = new Perons("Fred",42) //�ڶ�������������

      //ʵ��ScalaԴ�ļ��������
      val chatter = new NetWork
      val myFace = new NetWork

      val fred = chatter.join("Fred")
      val wilma = chatter.join("Wilma")
      fred.contacts += wilma
      val barney = myFace.join("Barney")
      //fred.contacts += barney


    }
  }
}
