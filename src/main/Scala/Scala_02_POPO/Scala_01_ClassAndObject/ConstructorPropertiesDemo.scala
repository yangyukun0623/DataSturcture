package Scala_02_POPO.Scala_01_ClassAndObject


/**
  * 属性高级
  *     1.构造器参数
  *         1）Scala类的主构造器的形参未用任何修饰符修饰，那么这个参数是局部变量
  *         2）如果参数使用val关键字声明，那么Scala会将参数作为类的私有的只读属性使用
  *         3）如果参数使用var关键字声明，那么Scala会将参数作为类的成员属性使用，并会提供属性对应的xxx()[类似getter方法]/xxx_$eq()[类似setter]方法，即这时的成员属性是私有的，但是可读写
  *     2.Bean属性
  *         给某个属性加入@BeanProperty注解后，会生成getXxx和setXxx方法
  *
  * */
object ConstructorPropertiesDemo {
  def main(args: Array[String]): Unit = {

  }

  class Car{

  }
}
