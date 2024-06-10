// ////////////////////////////////////////////////////////
// 
// J_Button2.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     命令式按钮及其动作事件处理例程。
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


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_Button2 extends JFrame
{
    public J_Button2( )
    {
        super("动作事件例程");
        Container c = getContentPane( );
        JButton b = new JButton("单击0次");
        J_ActionListener a = new J_ActionListener( );
        b.addActionListener(a);
        b.addActionListener(new ActionListener( )				//该对象只生成一次，而且立即注册，可采用匿名内部类
            {
                int m_count = 0;
            
                public void actionPerformed(ActionEvent e)
                {
                    JButton b= (JButton)e.getSource( );
                    b.setText("单击" + (++m_count) + "次");
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // addActionListener方法调用结束

        c.add(b, BorderLayout.CENTER);
    } // J_Button2构造方法结束

    public static void main(String args[ ])
    {
        J_Button2 app = new J_Button2( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(100, 80);
        app.setVisible(true);
    } // 方法main结束
} // 类J_Button2结束

