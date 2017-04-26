package test

object test8 {
   def main(args: Array[String]) {
      val numList = List(1,2,3,4,5,6,7,8,9,10);
      // for 循环  过滤  for 循环集合
      for( a <- numList if a != 3; if a < 8 ){
         println( "Value of a: " + a );
      }
      for( x <- 1 to 3; b <- 1 to 3){
         println( "Value of x: " + x );
         println( "Value of b: " + b );
      }
      //不包含10
      for( a <- 1 until 10){
         println( "Value of a: " + a );
      }
      
      
      // for 循环   你可以将 for 循环的返回值作为一个变量存储
      var retVal = for{ a <- numList 
                        if a != 3; if a < 8
                      }yield a

      // 输出返回值
      for( a <- retVal){
         println( "Value of a: " + a );
      }
   }
}