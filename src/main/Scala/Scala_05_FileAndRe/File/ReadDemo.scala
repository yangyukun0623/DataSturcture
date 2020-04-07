package Scala_05_FileAndRe.File

import scala.io.Source

object ReadDemo {
  def main(args: Array[String]): Unit = {
    val path = this.getClass.getClassLoader.getResource("myFile.txt").getPath
    val source = Source.fromFile(path,"GBK")
    //第一个参数可以是字符串或者是java.io.File
    //如果你知道文件使用的是当前平台缺省的字符编码，则可以省去第二个字符编码参数
    val lineIterator = source.getLines()
    for (l <- lineIterator){
      println(l)
    }
    source.close()
    println(" - - - - - - - - - - -")

  }
}
