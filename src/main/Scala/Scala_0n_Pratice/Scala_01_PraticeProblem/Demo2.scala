package Scala_0n_Pratice.Scala_01_PraticeProblem

import java.util.Scanner

/**
  * ��Ŀ����ҵ���ŵĽ������������ɡ�����(i)���ڻ����10��Ԫʱ���������10%�������
  * ��������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ���
  * ��������7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����
  * ������40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������
  * ������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������i����Ӧ���Ž���������
  * */
object Demo2 {
    def main(args: Array[String]): Unit = {
        val $ = 10000
        var bonus = 0.0
        val i: Double = new Scanner(System.in).nextDouble()
        val bonus1 = 10 * $ * 0.1
        val bonus2 = bonus1 + 10 * $ * 0.75
        val bonus4 = bonus2 + 20 * $ * 0.5
        val bonus6 = bonus4 + 40 * $ * 0.15
        val bonus10 = bonus6 + 40 * $ * 0.15
        if (i <= 10 * $) {
            bonus = bonus1 + (i - 10 * $) * 0.075
        } else if (i <= 20 * $) {
            bonus = bonus1 + (i - 10 * $) * 0.075
        } else if (i <= 40 * $) {
            bonus = bonus2 + (i - 20 * $) * 0.05
        } else if (i <= 60 * $) {
            bonus = bonus4 + (i - 40 * $) * 0.03
        } else if (i < 100 * $) {
            bonus = bonus6 + (i - 60 * $) * 0.015
        } else {
            bonus = bonus10 + (i - 100 * $) * 0.01
        }

        println("bonus = " + bonus.toString)
    }
}
