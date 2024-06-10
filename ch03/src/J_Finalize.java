// ////////////////////////////////////////////////////////
// 
// J_Finalize.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ʵ�������������ڵ����̡�
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

class J_Book1
{
    public int m_id; // ��ı��

    public J_Book1(int i)
    {
        m_id = i;
    } // J_Book���췽������

    protected void finalize( )
    {
        switch (m_id)
        {
        case 1:
            System.out.print("��Ʈ��");
            break;
        case 2:
            System.out.print("��Java������ƽ̡̳�");
            break;
        case 3:
            System.out.print("���������ա�");
            break;
        default:
            System.out.print("δ֪�鼮");
            break;
        } // switch������
        System.out.println("����Ӧ��ʵ������洢��Ԫ������");
    } // ����finalize����
} // ��J_Book����

public class J_Finalize
{
    public static void main(String args[ ])
    {
        J_Book1 book1= new J_Book1(1);
        //book1 = null;
        new J_Book1(2);
        new J_Book1(3);
        System.gc( ); // ����������������
    } // ����main����
} // ��J_Finalize����
