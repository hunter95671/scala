package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {

  def main(args: Array[String]): Unit = {

    //1.创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(88, 87, 86)

    println(arr1.mkString(","))
    println(arr2)
    println("==================")

    //2.访问元素
    println(arr2(0))
    arr2(0) = 19
    println(arr2(0))
    println("==================")

    //3.添加元素
    val newArr1 = arr1 :+ 15
    println(newArr1)
    println("==================")

    //追加在最后
    arr1 += 19
    println(arr1)
    println("==================")

    //追加在最前
    77 +=: arr1

    //append追加在最后
    arr1.append(16)

    //prepend追加在最前
    arr1.prepend(18)

    //insert插入
    arr1.insert(1, 23, 24)

    //insertAll插入一个数组
    arr1.insertAll(1, newArr1)

    //appendAll追加一个数组
    arr1.appendAll(newArr1)

    //4.删除元素remove   下标加删除数
    arr1.remove(3)
    println(arr1)
    println("==================")

    arr1.remove(0, 3)
    println(arr1)
    println("==================")

    // -= 删除指定的数
    arr1 -= 77
    println(arr1)
    println("==================")

    //5.可变数组转换为不可变数组
    val arr=ArrayBuffer(15,16,17)
    val newArr:Array[Int]=arr.toArray
    println(newArr)
    println("==================")

    //6.不可变数组转换为可变数组
    val buffer = newArr.toBuffer
    println(buffer)

  }
}
