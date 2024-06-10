//【例3.5】  类的继承性。

public class Student1 extends Person1    //Student1是Person1类的子类
{
    private String speciality;           //专业，子类私有成员变量

    public Student1(String name, int age, String spec) //子类构造方法
    {
        super(name,age);                 //调用父类的构造方法
        this.speciality = spec;
    } 

    public static void main(String args[])
    {
        Person1 p1 = new Person1("李小明",21);
        p1.print();
        Student1 s1 = new Student1("王大伟",19,"计算机");
        s1.print();
        System.out.println(p1.getName()+" 比 "+s1.getName()+" 大 "+p1.olderThen(s1)+" 岁");
                                         //通过对象调用父类的实例成员方法
        s1.finalize();                   //继承父类的析构方法
        s1 = null;
        Person1.howMany();               //调用父类的类成员方法
        System.out.println();
    }
}
/*
程序运行结果如下：

Person1.count=1  Person1类  (李小明,21岁) 
Person1.count=2  Person1类  (王大伟,19岁)
李小明 比 王大伟 大 2 岁
释放对象 (王大伟,19岁) 
Person1.count=1

*/
