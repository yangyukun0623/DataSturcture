package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
  * */
object Demo3 {
    def main(args: Array[String]): Unit = {
        for (i <- 1 to 100000){
            val x = math.sqrt(i + 100)
            val y = math.sqrt(i + 268)
            if(x == x.toInt && y == y.toInt){
                println(i)
            }
        }
    }
}
