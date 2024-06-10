//����3.4��  ʵ����Ա�����Ա��
//����3.5��  ��ļ̳��ԡ�
//����3.6��  ���з����Ķ�̬�ԡ�
//����3.7��  ����ʱ��̬�Ե�Ӧ�á�

public class Person1
{
    protected String name;               //������ʵ����Ա������������Ա
    protected int age;                   //����
    protected static int count=0;        //���������Ա���������༰����������

    public Person1(String name,int age)  //���췽��
    {
        this.set(name);
        this.set(age);
        count++;                         //������1
    } 

    public Person1(String name)          //���췽������
    {
        this(name,0);                    //���ñ���Ĺ��췽��
    } 
    
    public Person1()                     //���췽������
    {
        this("����δ֪",0);
    }
     
    public Person1(Person1 p1)           //���췽������
    {
        this(p1.name, p1.age);
    }

    public void finalize()               //��������
    {
        System.out.println("�ͷŶ��� ("+this.toString()+")");
                                         //����ʵ����Ա����
        this.count--;                    //������1
    }
    
    public void set(String name)         //���ó�Ա����ֵ
    {
        if (name==null || name=="")
            this.name = "����δ֪";
        else
            this.name = name;
    }
            
    public void set(int age)
    {
        if (age>0 && age<100)
            this.age = age;
        else
            this.age = 0;
    }
     
    public void set(String name, int age)
    {
        this.set(name);
        this.set(age);
    }
            
    public void set(Person1 p1)
    {
        this.set(p1.name);
        this.set(p1.age);
    }
            
    public String getName()              //��ó�Ա����ֵ      
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public static void howMany()         //���Ա������ֻ�ܷ������Ա����
    {
        System.out.print("Person1.count="+count+"  ");
    }
    
    public String belongClassName() 
    {
        String str="";                   //�ֲ�����������ʹ�����η�
        if (this instanceof Person1)     //�жϵ�ǰ�����Ƿ�����Person1��
            str="Person1";
        return str;
    }

    public String toString() 
    {
        return this.name+","+this.age+"��";
    }
    
    public void print()                  //ʵ����Ա����,���Է������Ա������ʵ����Ա����
    {
        this.howMany();                  //ͨ������������Ա����
        System.out.println(this.belongClassName()+"��  ("+this.toString()+")");
                                         //ͨ���������ʵ����Ա����
    }

    public int olderThen(Person1 p2)     //�Ƚ������˵�����
    {
        return this.age - p2.age;
    }
    
    public boolean equals(Object obj)    //����Object���з���
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj instanceof Person1) 
        {
            Person1 p1 = (Person1)obj;
            return this.name.equals(p1.name) && this.age==p1.age;
        }
        return false;
    }

    public static void main(String args[])   //main����Ҳ�����Ա����
    {
        Person1 p1 = new Person1("��С��",21);
        p1.print();
        Person1 p2 = new Person1("����ΰ",19);
        p2.print();
        System.out.println(p1.getName()+" �� "+p2.getName()+" �� "+p1.olderThen(p2)+" ��");
                                         //ͨ���������ʵ����Ա����
        p1.finalize();                   //���ö������������
        p1 = null;                       //p1Ϊ�ն���
        Person1.howMany();               //ͨ�������������Ա����
        System.out.println();
    }
}

/* 
�������н�����£�

Person1.count=1  Person1��  (��С��,21��) 
Person1.count=2  Person1��  (����ΰ,19��)
��С�� �� ����ΰ �� 2 ��
�ͷŶ��� (��С��,21��) 
Person1.count=1

*/
/*
    protected Date2 birthday;               //��������
    public int age()         //����
    {
        return this.age - b.age;
    }


������ȷ:

1����û�д����κζ���ʱ��������£�
Person1.count=0


    public void print()
    {
        System.out.println("������="+this.getClass().getName()+"  "+
             "������="+this.getClass().getSuperclass().getName()+"  ");
    } 
        System.out.println(this.getClass().getName()+"��  "+this.toString());  //���Ե���ʵ������

�������:

    public static int howMany()
    {
        Person1 objp=this;             //�����,�෽���в���ʹ��this����, non-static variable this cannot be referenced from a static context    
        return count;
    }

        public String str="";                   //�����,�ֲ�����������ʹ�����η�

        static String str="";                   //�ֲ�����������ʹ�����η�
    
*/