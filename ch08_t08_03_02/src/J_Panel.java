// ////////////////////////////////////////////////////////
// 
// J_Panel.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     随手画面板例程。
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

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;
import javax.swing.JPanel;

public class J_Panel extends JPanel
{
    private Vector<Vector<Point>> m_vectorSet
        = new Vector<Vector<Point>>( );

    public J_Panel( )
    {
        addMouseListener( new MouseListener( )
            {
                public void mouseClicked(MouseEvent e)
                {
                } // 方法mouseClicked结束

                public void mouseEntered(MouseEvent e)
                {
                } // 方法mouseEntered结束

                public void mouseExited(MouseEvent e)
                {
                } // 方法mouseExited结束

                public void mousePressed(MouseEvent e)
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    Vector<Point> v= new Vector<Point>( ); // 新的笔划
                    v.add(p); // 添加笔划的起点
                    m_vectorSet.add(v);
                } // 方法mousePressed结束

                public void mouseReleased(MouseEvent e)
                {
                } // 方法mouseReleased结束
            } // 实现接口MouseListener的内部类结束
        ); // addMouseListener方法调用结束
        addMouseMotionListener( new MouseMotionListener( )
            {
                public void mouseMoved(MouseEvent e)  
                {
                } // 方法mouseMoved结束

                public void mouseDragged(MouseEvent e) 
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    int n= m_vectorSet.size( )-1;
                    Vector<Point> v= m_vectorSet.get(n);
                    v.add(p); // 添加笔划的中间点或终点
                    repaint( );
                } // 方法mouseDragged结束
            } // 实现接口MouseMotionListener的内部类结束
        ); // addMouseMotionListener方法调用结束
    } // J_Panel构造方法结束

    protected void paintComponent(Graphics g)
    {
        g.clearRect(0 , 0, getWidth( ), getHeight( )); // 清除背景
        Vector<Point> v;
        Point s, t;
        int i, j, m;
        int n= m_vectorSet.size( );
        for (i=0; i<n; i++)
        {
            v= m_vectorSet.get(i);
            m= v.size( )-1;
            for (j=0; j<m; j++)
            {
                s= (Point)v.get(j);
                t= (Point)v.get(j+1);
                g.drawLine(s.x, s.y, t.x, t.y);
            } // 内部for循环结束
        } // 外部for循环结束
    } // 方法paintComponent结束

    public Dimension getPreferredSize( )
    {
        return new Dimension(250, 120);
    } // 方法getPreferredSize结束
} // 类J_Panel结束

