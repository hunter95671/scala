package chapter08

object Test01_PatternMatch {

  def main(args: Array[String]): Unit = {

    //1.基本定义语法
    val x: Int = 2
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    //2.示例：用模式匹配实现简单二元运算
    val a: Int = 25
    val b: Int = 7

    def matchDualOp(op: Char): Int = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => -1
    }

    println(matchDualOp('+'))
    println(matchDualOp('-'))
    println(matchDualOp('*'))
    println(matchDualOp('/'))
    println(matchDualOp('%'))
    println(matchDualOp('.'))

    println("================")

    //3.模式守卫
    //求一个整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(15))
    println(abs(-11))

  }
}
