//【例3.4】  实例成员与类成员。
//【例3.5】  类的继承性。
//【例3.6】  类中方法的多态性。
//【例3.7】  运行时多态性的应用。

public class Person1
{
    protected String name;               //姓名，实例成员变量，保护成员
    protected int age;                   //年龄
    protected static int count=0;        //人数，类成员变量，本类及子类对象计数

    public Person1(String name,int age)  //构造方法
    {
        this.set(name);
        this.set(age);
        count++;                         //人数增1
    } 

    public Person1(String name)          //构造方法重载
    {
        this(name,0);                    //调用本类的构造方法
    } 
    
    public Person1()                     //构造方法重载
    {
        this("姓名未知",0);
    }
     
    public Person1(Person1 p1)           //构造方法重载
    {
        this(p1.name, p1.age);
    }

    public void finalize()               //析构方法
    {
        System.out.println("释放对象 ("+this.toString()+")");
                                         //调用实例成员方法
        this.count--;                    //人数减1
    }
    
    public void set(String name)         //设置成员变量值
    {
        if (name==null || name=="")
            this.name = "姓名未知";
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
            
    public String getName()              //获得成员变量值      
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public static void howMany()         //类成员方法，只能访问类成员变量
    {
        System.out.print("Person1.count="+count+"  ");
    }
    
    public String belongClassName() 
    {
        String str="";                   //局部变量，不能使用修饰符
        if (this instanceof Person1)     //判断当前对象是否属于Person1类
            str="Person1";
        return str;
    }

    public String toString() 
    {
        return this.name+","+this.age+"岁";
    }
    
    public void print()                  //实例成员方法,可以访问类成员变量和实例成员变量
    {
        this.howMany();                  //通过对象调用类成员方法
        System.out.println(this.belongClassName()+"类  ("+this.toString()+")");
                                         //通过对象调用实例成员方法
    }

    public int olderThen(Person1 p2)     //比较两个人的年龄
    {
        return this.age - p2.age;
    }
    
    public boolean equals(Object obj)    //覆盖Object类中方法
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

    public static void main(String args[])   //main方法也是类成员方法
    {
        Person1 p1 = new Person1("李小明",21);
        p1.print();
        Person1 p2 = new Person1("王大伟",19);
        p2.print();
        System.out.println(p1.getName()+" 比 "+p2.getName()+" 大 "+p1.olderThen(p2)+" 岁");
                                         //通过对象调用实例成员方法
        p1.finalize();                   //调用对象的析构方法
        p1 = null;                       //p1为空对象
        Person1.howMany();               //通过类名调用类成员方法
        System.out.println();
    }
}

/* 
程序运行结果如下：

Person1.count=1  Person1类  (李小明,21岁) 
Person1.count=2  Person1类  (王大伟,19岁)
李小明 比 王大伟 大 2 岁
释放对象 (李小明,21岁) 
Person1.count=1

*/
/*
    protected Date2 birthday;               //出生日期
    public int age()         //年龄
    {
        return this.age - b.age;
    }


程序正确:

1、当没有创建任何对象时，输出如下：
Person1.count=0


    public void print()
    {
        System.out.println("本类名="+this.getClass().getName()+"  "+
             "超类名="+this.getClass().getSuperclass().getName()+"  ");
    } 
        System.out.println(this.getClass().getName()+"类  "+this.toString());  //可以调用实例方法

程序错误:

    public static int howMany()
    {
        Person1 objp=this;             //编译错,类方法中不能使用this引用, non-static variable this cannot be referenced from a static context    
        return count;
    }

        public String str="";                   //编译错,局部变量，不能使用修饰符

        static String str="";                   //局部变量，不能使用修饰符
    
*/