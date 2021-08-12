package chapter05

object Test09_ClosureAndCurrying {

  def main(args: Array[String]): Unit = {

    def add(a:Int,b:Int):Int={
      a+b
    }

    //1.考虑固定一个加数场景
    def addByFour(b:Int):Int={
      4+b
    }

    //2.扩展固定加数改变的情况
    def addByFive(b:Int):Int={
      5+b
    }

    //3.将固定加数作为另一个参数传入，但是作为第一层参数传入
    def addByFour1(a:Int):Int=>Int={
      val a=4
      def addB(b:Int):Int={
        a+b
      }
      addB
    }

    def addByA(a:Int):Int=>Int={
      def addB(b:Int):Int={
        a+b
      }
      addB
    }

    println(addByA(12)(13))
    val addByFour2=addByA(4)
    println(addByFour2(5))

    //4.lambda表达式简写
    def addByA2(a:Int):Int=>Int={
      b=>a+b
    }

    def addByA3(a:Int):Int=>Int= a+_

    println(addByA2(12)(13))
    val addByFour3=addByA3(4)
    println(addByFour3(5))

    //5.柯里化
    def addCurrying(a:Int)(b:Int):Int={
      a+b
    }

    println(addCurrying(25)(25))

  }
}
