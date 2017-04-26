package test

object test9 {
  //返回值，参数列表的函数
  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    sum //默认最后一行返回值
  }
  //函数调用
  def printMe {
    println("Hello, Scala!")
  }
  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }
  //变量名和变量类型使用 => 符号来设置传名调用
  //传值调用（call-by-value）：先计算参数表达式的值，再应用到函数内部；
  //传名调用（call-by-name）：将未计算的参数表达式直接应用到函数内部
  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  //传名调用（call-by-name）。
  def addByName(a: Int, b: => Int) = a + b
  //传值调用（call-by-value）
  def addByValue(a: Int, b: Int) = a + b
  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }
  def printStrings( args:String* ) = {
      var i : Int = 0;
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
  }
  def factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
  }
  def addInt2( a:Int=5, b:Int=7 ) : Int = {
      var sum:Int = 0
      sum = a + b
      sum
   }
  def main(args: Array[String]): Unit = {
    //函数调用
    println(addInt(1, 3))
    printMe
    time
    delayed(999)
    //函数传名调用
    delayed(time())
    /*
     * addByName(2, 2 + 2)  
      ->2 + (2 + 2)  
      ->2 + 4  
      ->6  
  
        addByValue(2, 2 + 2)  
      ->addByValue(2, 4)  
      ->2 + 4  
      ->6  
     */
    println(addByName(1, 2 + 2))
    println(addByValue(1, 2 + 2))
    //一般情况下函数调用参数，就按照函数定义时的参数顺序一个个传递。
    //但是我们也可以通过指定函数参数名，并且不需要按照顺序向函数传递参数
    printInt(b = 5, a = 7);
    //可变参数
    printStrings("Runoob", "Scala", "Python");
    //Scala 递归函数
    for (i <- 1 to 10) println(i + " 的阶乘为: = " + factorial(i) )
    //Scala 函数 - 默认参数值
    println( "返回值 : " + addInt2() );
  }
}