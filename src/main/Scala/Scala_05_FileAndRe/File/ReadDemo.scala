package Scala_05_FileAndRe.File

import scala.io.Source

object ReadDemo {
  def main(args: Array[String]): Unit = {
    val path = this.getClass.getClassLoader.getResource("myFile.txt").getPath
    val source = Source.fromFile(path,"GBK")
    //��һ�������������ַ���������java.io.File
    //�����֪���ļ�ʹ�õ��ǵ�ǰƽ̨ȱʡ���ַ����룬�����ʡȥ�ڶ����ַ��������
    val lineIterator = source.getLines()
    for (l <- lineIterator){
      println(l)
    }
    source.close()
    println(" - - - - - - - - - - -")

  }
}
