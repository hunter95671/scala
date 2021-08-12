package chapter05

object Test08_Practice {

  def main(args: Array[String]): Unit = {

    //练习一
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(fun(1, "tom", 'A'))
    println(fun(0, "", '0'))

    println("=============")

    //练习二
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(1)("tom")('A'))
    println(func(0)("")('0'))

    //匿名函数简写
    def func1(i: Int): String => Char => Boolean = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    //柯里化
    def func2(i:Int)(s:String)(c: Char):Boolean={
      if (i == 0 && s == "" && c == '0') false else true
    }
  }
}
