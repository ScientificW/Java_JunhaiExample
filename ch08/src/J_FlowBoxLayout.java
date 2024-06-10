// ////////////////////////////////////////////////////////
// 
// J_FlowBoxLayout.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     组合布局方式例程。
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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class J_FlowBoxLayout
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame("组合布局方式例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(215, 150);
        Container c = app.getContentPane( );
        c.setLayout(new FlowLayout( ));				//顶层容器采用流式布局
        JPanel [ ] p = new JPanel[3];
        int i;
        for (i=0; i<3; i++)
        {
            p[i]= new JPanel( );
            p[i].setLayout(new BoxLayout(p[i], BoxLayout.X_AXIS));	//面板(内部容器)采用盒式布局，组件水平排列
            c.add(p[i]);							//将面板(内部容器)加入顶层容器
        } // for循环结束
        String s;
        JButton b;
        int [ ] pj = {0, 1, 1, 2, 2, 2};
        for (i=0; i<6; i++)
        {
            s = "按钮" + (i+1);
            b = new JButton(s);
            p[pj[i]].add(b);						//将按钮加入面板(内部容器)
        } // for循环结束
        app.setVisible(true);
    } // 方法main结束
} // 类J_FlowBoxLayout结束

