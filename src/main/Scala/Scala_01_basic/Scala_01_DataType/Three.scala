package Scala_01_basic.Scala_01_DataType

object Three {
    def main(args: Array[String]): Unit = {
        //Scala�в�֧����Ŀ�����
        //val num = 5 > 4 ? 5 : 4 //û��
        //��Scala��ʹ��if-elseʵ��
        val num = if (5 > 4) 5 else 4
        println(num)

        //�������������ֵ
        val n1 = 4
        val n2 = 8
        var res = if (n1 > n2) n1 else n2
        println("res = " + res)

        val n3 = 11
        res = if (res > n3) res else n3
        println("res = " + n3)

        //��������ȼ�
        /** 1.()[]
          * 2.��Ŀ����      ��~
          * 3.���������     // * / % + -
          * 4.��λ�����     >> >>> <<
          * 5.�Ƚ����������ϵ�������== !=
          * 6.λ����        & ^ \
          * 7.��ϵ�����    && ||
          * 8.��ֵ�����    = += -= *= /= %= >>= <<= &= ^= |=
          * */
    }
}
