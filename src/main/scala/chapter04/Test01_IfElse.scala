package chapter04

import scala.io.StdIn

object Test01_IfElse {

  def main(args: Array[String]): Unit = {
    println("请输入年龄")
    val age: Int = StdIn.readInt()

    //1.单分支
    if (age >= 18) {
      println("成年")
    }
    println("=======================")

    //2.双分支
    if (age < 18) {
      println("未成年")
    } else {
      println("成年")
    }


    //3.多分支
    if (age < 18) {
      println("童年")
    } else if (age >= 18 && age < 30) {
      println("中年")
    } else {
      println("老年")
    }

    //4.分支语句的返回值,具体返回值取决于满足条件的代码体的最后一行内容
    val result: Any = if (age < 18) {
      println("未成年")
      "未成年"
    } else {
      println("成年")
      18
    }

    //java三元运算符 a?b:c

    val res: String = if (age < 18) {
      "未成年"
    } else {
      "成年"
    }

    val res2 = if (age < 18) "未成年" else "成年"

    //5.嵌套分支

    val res3 :String = if (age < 18){
      "童年"
    }else {
      if(age>=18 && age<30){
        "中年"
      }else{
        "老年"
      }
    }




  }
}
