package Scala_02_POPO.Scala_04_POPO
/**
  * ��װ��ʵ�ֲ���
  *     1�������Խ���˽�л�
  *     2���ṩһ��������set���������ڶ������жϲ���ֵ
  *     def setXxx(������:����):Unit = {
  *         //����������֤��ҵ���߼�
  *         ���� = ������
  *     }
  *     3���ṩһ����get���������ڻ�ȡ���Ե�ֵ
  *     def getXxx()[:��������] = {
  *         return ����
  *     }
  *
  * Scala�̳еĻ����﷨
  *     class ������ extends ������ { ���� }
  * */
object PrivateDemo {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "Nick"
    p.showInfo()

    val s = new Student
    s.name = "Click"
    s.studying()
  }

  class Person{
    var name:String = _
    var age:Int = _
    def showInfo() = {
      println("ѧ����Ϣ���£�")
      println("���֣�" + this.name)

    }

  }

  class Student extends Person{
    def studying() = {
      //�������ʹ�ø��������
      println(this.name + "ѧϰScala��...")
    }


  }
}
