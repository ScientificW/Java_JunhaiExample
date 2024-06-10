// ////////////////////////////////////////////////////////
// 
// J_Finalize.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     实例对象生命周期的例程。
// ////////////////////////////////////////////////////////
// Copyright:
//
// Using this example, please explicitly refer to the book:
//     Jun-Hai Yong. Textbook for Programming in Java. 
//     Beijing: Tsinghua University Press, 2008.
// The example should be used legally, beneficially and
// without any harm to anybody. Please note that the
// author and the publisher make no warranty of any kind
// on the examples provided.
// Citation examples:
// The program is an example in (or based on, or modified from)
//     Jun-Hai Yong. Textbook for Programming in Java. 
//     Beijing: Tsinghua University Press, 2008.
//
// Some books written by Jun-Hai Yong are:
//      [1] Jun-Hai Yong. Textbook for Programming in Java. 
//          Beijing: Tsinghua University Press, 2008.
//      [2] Jun-Hai Yong. Textbook for Programming in Java (Secend Edition). 
//          Beijing: Tsinghua University Press, 2007.
//      [3] Jun-Hai Yong. Exercises for Programming in Java.
//          Beijing: Tsinghua University Press, 2006.
//      [4] Jun-Hai Yong. Programming in Java. 
//          Beijing: Tsinghua University Press, 2004.
//
// 版权:
// 使用本例子，请注明引用:
//     雍俊海. Java程序设计. 北京: 清华大学出版社, 2008.
// 请合法使用例程，其用途应当合法有益而且不应对任何人造成任何
// 伤害或损失。同时请注意教材作者及出版社没有对例程做出任何承
// 诺与保证。
// 具体引用的方法及例子如下:
// 本程序是下面教材的一个例程(或本程序基于下面教材的例程修改)
//     雍俊海. Java程序设计. 北京: 清华大学出版社, 2008.
//
// 雍俊海编写的一些教材和教参如下:
//      [1] 雍俊海. Java程序设计. 北京: 清华大学出版社, 2008.
//      [2] 雍俊海. Java程序设计教程（第2版）. 
//          北京: 清华大学出版社, 2007.
//      [3] 雍俊海. Java程序设计习题集(含参考答案). 
//          北京: 清华大学出版社, 2006.
//      [4] 雍俊海. Java程序设计. 北京: 清华大学出版社, 2004.
//
// ////////////////////////////////////////////////////////

class J_Book1
{
    public int m_id; // 书的编号

    public J_Book1(int i)
    {
        m_id = i;
    } // J_Book构造方法结束

    protected void finalize( )
    {
        switch (m_id)
        {
        case 1:
            System.out.print("《飘》");
            break;
        case 2:
            System.out.print("《Java程序设计教程》");
            break;
        case 3:
            System.out.print("《罗马假日》");
            break;
        default:
            System.out.print("未知书籍");
            break;
        } // switch语句结束
        System.out.println("所对应的实例对象存储单元被回收");
    } // 方法finalize结束
} // 类J_Book结束

public class J_Finalize
{
    public static void main(String args[ ])
    {
        J_Book1 book1= new J_Book1(1);
        //book1 = null;
        new J_Book1(2);
        new J_Book1(3);
        System.gc( ); // 申请立即回收垃圾
    } // 方法main结束
} // 类J_Finalize结束

