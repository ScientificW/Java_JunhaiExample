// ////////////////////////////////////////////////////////
// 
// J_Hanoi.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     利用递归求解汉诺塔(Tower of Hanoi)问题的例程。
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

public class J_Hanoi
{
    public static void mb_hanoi(int n, char start, char temp, char end)
    {
        if (n<=1)
            System.out.println("将盘从" + start + "移到" + end);
        else
        {
            mb_hanoi(n-1, start, end, temp);
            System.out.println("将盘从" + start + "移到" + end);
            mb_hanoi(n-1, temp, start, end);
        } // if-else结构结束
    } // 方法mb_hanoi结束

    public static void main(String args[ ])
    {
        mb_hanoi(3, 'S', 'T', 'E');
    } // 方法main结束
} // 类J_Hanoi结束

