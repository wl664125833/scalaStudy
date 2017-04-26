package test

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
  def main(args: Array[String]) {
    println(apply(layout, 10))

    println(factorial(0))
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
  }
}