// ////////////////////////////////////////////////////////
// 
// J_Teacher.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ְ�����ʦ֮��ļ̳������̡�
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

class J_Employee
{
    public int m_workYear; // ����������

    public J_Employee( )
    {
        m_workYear = 1;
    } // J_Employee���췽������
} // ��J_Employee����

public class J_Teacher extends J_Employee
{
    public int m_classHour; // �ڿεĿ�ʱ

    public J_Teacher( )
    {
        m_classHour = 96;
    } // J_Teacher���췽������

    public void mb_printInfo( )
    {
        System.out.println("�ý�ʦ�Ĺ�������Ϊ" + m_workYear);
        System.out.println("�ý�ʦ�ڿεĿ�ʱΪ" + m_classHour);
    } // ����mb_printInfo����

    public static void main(String args[ ])
    {
        J_Teacher tom = new J_Teacher( );
        tom.mb_printInfo( );
    } // ����main����
} // ��J_Teacher����
