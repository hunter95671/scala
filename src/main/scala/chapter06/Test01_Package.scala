//用嵌套风格定义包
package com{

  import com.hunter95.scala.Inner

  //在外层包中定义单例对象
  object Outer{
    var out:String="out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package hunter95{

    package scala{

      //在内层包中定义单例对象
      object Inner{
        var in:String="in"
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out="outer"
          println(Outer.out)
        }
      }
    }
  }
}
