package Scala_01_basic.Scala_01_DataType

object Demo {
    def main(args: Array[String]): Unit = {
        //Scala֧�ֵ�����
        //Scalaû���������ͣ���ͷ��ʼ��Ƶģ�����һ�������֧�����͵���

        /**
          * val ���ɱ����
          * �﷨��
          *     val <Name of our variable>:<Scala type> = <Some literal>
          * ���磺
          *     val dount: Int = 5
          *
          * var �ɱ����
          * �﷨����var
          * ���磺
          *     var some:String = "Dount"
          *     somr = "Vanilla"
          *
          * �ӳٳ�ʼ��
          * ��ĳЩ�����ĳ�ʼ���ӳٵ�Ӧ�ó���ʹ������ʱ����ʱ��
          * ͨ����Ϊ�ӳٳ�ʼ������Ҫʹ��lazy�ؼ���
          *
          * lazy val dountService = "initialize some dount service"
          *
          * ע�⣺
          *     ������δ�ƶ��������ͣ��������������Scala������֪����Ӧ��ΪString
          *     ���ͣ����Ϊ�����ƶ�
          * */

        /**
          * Scala֧�ֵ�����
          * Scalaû���������ͣ���ͷ��ʼ��Ƶģ�����һ�������֧�����͵���
          *
          * */
        //����
        val dountsBought: Int = 5
        //������
        val bigNUmberOfDonuts: Long = 10000000L
        //������
        val smallNumberOfDonuts: Short = 1
        //˫���ȸ�����
        val priceOfDonut: Double = 2.50
        //�����ȸ�����
        val donutPrice: Float = 2.50f
        //�ַ�������
        val dountStoreName: String = "allaboutscala Donut Store"
        //�ֽ�����
        val donutByte: Byte = 0
        //�ַ�����
        val donutFirstLetter: Char = 'A'
        //�����ͣ�����void
        val nothingL: Unit = ()

        //����һ��û�г�ʼ���ı���
        //�������ʱ������ʹ��ͨ���_
//        var least: String = _
//        least = "Plain Donut"
    }
}
