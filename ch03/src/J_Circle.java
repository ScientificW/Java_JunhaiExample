// ////////////////////////////////////////////////////////
// 
// J_Circle.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     Բ���̡�
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
// ��Ȩ:
// ʹ�ñ����ӣ���ע������:
//     Ӻ����. Java�������. ����: �廪��ѧ������, 2008.
// ��Ϸ�ʹ�����̣�����;Ӧ���Ϸ�������Ҳ�Ӧ���κ�������κ�
// �˺�����ʧ��ͬʱ��ע��̲����߼�������û�ж����������κγ�
// ŵ�뱣֤��
// �������õķ�������������:
// ������������̲ĵ�һ������(�򱾳����������̲ĵ������޸�)
//     Ӻ����. Java�������. ����: �廪��ѧ������, 2008.
//
// Ӻ������д��һЩ�̲ĺͽ̲�����:
//      [1] Ӻ����. Java�������. ����: �廪��ѧ������, 2008.
//      [2] Ӻ����. Java������ƽ̳̣���2�棩. 
//          ����: �廪��ѧ������, 2007.
//      [3] Ӻ����. Java�������ϰ�⼯(���ο���). 
//          ����: �廪��ѧ������, 2006.
//      [4] Ӻ����. Java�������. ����: �廪��ѧ������, 2004.
//
// ////////////////////////////////////////////////////////

public class J_Circle implements J_Shape
{
    public double m_x, m_y; // Բ������
    public double m_radius; // �뾶

    public J_Circle(double r)
    {
        m_x = 0;
        m_y = 0;
        m_radius = r;
    } // J_Circle���췽������

    public J_Circle(double x, double y, double r)
    {
        m_x = x;
        m_y = y;
        m_radius = r;
    } // J_Circle���췽������

    // ���㲢������״�����
    public double mb_getArea( )
    {
        return (Math.PI*m_radius*m_radius);
    } // ����mb_getArea����
} // ��J_Circle����
