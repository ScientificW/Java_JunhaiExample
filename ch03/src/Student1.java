//����3.5��  ��ļ̳��ԡ�

public class Student1 extends Person1    //Student1��Person1�������
{
    private String speciality;           //רҵ������˽�г�Ա����

    public Student1(String name, int age, String spec) //���๹�췽��
    {
        super(name,age);                 //���ø���Ĺ��췽��
        this.speciality = spec;
    } 

    public static void main(String args[])
    {
        Person1 p1 = new Person1("��С��",21);
        p1.print();
        Student1 s1 = new Student1("����ΰ",19,"�����");
        s1.print();
        System.out.println(p1.getName()+" �� "+s1.getName()+" �� "+p1.olderThen(s1)+" ��");
                                         //ͨ��������ø����ʵ����Ա����
        s1.finalize();                   //�̳и������������
        s1 = null;
        Person1.howMany();               //���ø�������Ա����
        System.out.println();
    }
}
/*
�������н�����£�

Person1.count=1  Person1��  (��С��,21��) 
Person1.count=2  Person1��  (����ΰ,19��)
��С�� �� ����ΰ �� 2 ��
�ͷŶ��� (����ΰ,19��) 
Person1.count=1

*/
