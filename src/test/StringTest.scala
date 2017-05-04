package test

object StringTest {
  //在 Scala 中，String 是一个不可变的对象，所以该对象不可被修改。
  //这就意味着你如果修改字符串就会产生一个新的字符串对象
  def main(args: Array[String]) {
      val buf = new StringBuilder;
      buf += 'a'
      buf ++= "bcdef"
      println( "buf is : " + buf.toString );
   }
}