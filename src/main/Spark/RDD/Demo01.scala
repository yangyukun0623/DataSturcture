package RDD

import org.apache.spark.{SparkConf, SparkContext}

/**
  * RDD创建的三种方式
  * 1.从集合中创建RDD
  * 2.从外部存储创建RDD
  * 3.从其它RDD转换
  * */
object Demo01 {
	def main(args: Array[String]): Unit = {
		//1.创建conf对象
		val conf = new SparkConf().setAppName("RDD")
		//2.创建SparkContext对象
		val sc = new SparkContext(conf)
		val rdd1 = sc.makeRDD(1 to 10)
    		.map(x => x + 1).collect()
		rdd1.foreach(println)
		sc.stop()
	}
}







































































