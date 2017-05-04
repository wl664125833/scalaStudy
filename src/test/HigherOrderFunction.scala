package test

import java.util.Date

object HigherOrderFunction {
  //高阶函数（Higher-Order Function）就是操作其他函数的函数。
  //Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
  //以下实例中，apply() 函数使用了另外一个函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v：
  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
  //我么可以在 Scala 函数内定义函数，定义在函数内的函数称之为局部函数。
  //以下实例我们实现阶乘运算，并使用内嵌函数
  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }
  //Scala 匿名函数
  //  Scala 中定义匿名函数的语法很简单，箭头左边是参数列表，右边是函数体。
  //  使用匿名函数后，我们的代码变得更简洁了。
  //    下面的表达式就定义了一个接受一个Int类型输入参数的匿名函数:
  var factor = 3
  val multiplier = (i: Int) => i * factor
  //Scala 偏应用函数是一种表达式，你不需要提供函数需要的所有参数，只需要提供部分，或不提供所需参数。
  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }
  //柯里化(Currying)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。
  //新的函数返回一个以原有第二个参数为参数的函数
  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
  def main(args: Array[String]) {
    println(apply(layout, 10))

    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
    //Scala 匿名函数
    println("multiplier(1) value = " + multiplier(1))
    println("multiplier(2) value = " + multiplier(2))

    val date = new Date
    log(date, "message1")
    Thread.sleep(1000)
    log(date, "message2")
    Thread.sleep(1000)
    log(date, "message3")

    val str1: String = "Hello, "
    val str2: String = "Scala!"
    println("str1 + str2 = " + strcat(str1)(str2))
  }
}