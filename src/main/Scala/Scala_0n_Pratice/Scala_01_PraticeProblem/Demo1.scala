package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
  *
  * */
object Demo1 {
    def main(args: Array[String]): Unit = {
        var count = 0;
        for (x <- 1 to 4)
            for (y <- 1 to 4)
                for (z <- 1 to 4){
                    if (x != y && y != z && x != z){
                        count += 1;
                        println(x.toString + y.toString + z.toString)
                    }
                }
        println("���� " + count.toString + " ��")
    }
}
