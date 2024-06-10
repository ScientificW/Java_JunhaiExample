// ////////////////////////////////////////////////////////
// 
// J_Text.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     文本编辑框例程。
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

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class J_Text
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame("文本编辑框例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(320, 120);
        Container c = app.getContentPane( );
        c.setLayout( new FlowLayout( ) );
        JTextField [ ] t = {
            new JTextField("正常文本:", 8), new JTextField("显示", 15),
            new JTextField("密码文本:", 8), new JPasswordField("隐藏", 15)};
        t[0].setEditable(false);			//设置文本框属性(是否可编辑)
        t[2].setEditable(false);
        for (int i=0; i<4; i++)
            c.add(t[i]);					//组件(文本框)加入容器
        app.setVisible(true);				//容器可见性设置
    } // 方法main结束
} // 类J_Text结束

