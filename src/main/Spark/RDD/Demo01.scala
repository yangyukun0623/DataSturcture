package RDD

import org.apache.spark.{SparkConf, SparkContext}

/**
  * RDD���������ַ�ʽ
  * 1.�Ӽ����д���RDD
  * 2.���ⲿ�洢����RDD
  * 3.������RDDת��
  * */
object Demo01 {
	def main(args: Array[String]): Unit = {
		//1.����conf����
		val conf = new SparkConf().setAppName("RDD")
		//2.����SparkContext����
		val sc = new SparkContext(conf)
		val rdd1 = sc.makeRDD(1 to 10)
    		.map(x => x + 1).collect()
		rdd1.foreach(println)
		sc.stop()
	}
}







































































