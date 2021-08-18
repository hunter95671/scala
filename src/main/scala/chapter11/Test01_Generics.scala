package chapter11

object Test01_Generics {

  def main(args: Array[String]): Unit = {
    //1.协变和逆变
    val child: Parent = new Child
    //val childList: MyCollection[Parent] = new MyCollection[Child]   //协变
    val childList: MyCollection[SubChild] = new MyCollection[Child]   //逆变

    //2.上下限
    def test[A<:Child](a:A):Unit={
      println(a.getClass.getName)
    }

    test[Child](new SubChild)
    test[Child](new Child)
  }
}

//定义继承关系
class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

//定义带泛型的集合类型
//协变
//class MyCollection[+E] {}
//逆变
class MyCollection[-E] {}

