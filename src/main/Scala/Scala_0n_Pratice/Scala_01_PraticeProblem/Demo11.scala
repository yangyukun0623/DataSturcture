package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ�����������
  * ��������ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
  *
  * */
object Demo11 {
    def main(args: Array[String]): Unit = {
        for (x <- 1 to 20)
            print(fibnaci(x) + "  ")
    }

    def fibnaci(month:Int):Int = {
        if(month == 1 || month == 2){
            1
        }else {
            fibnaci(month - 1) + fibnaci(month - 2)
        }
    }
}
