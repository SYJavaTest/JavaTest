
/**
 * Created by uccc on 2018/4/13.
 * 作者：尚莹
 * 文档用途：练习
 */
/******************************************枚举法的运用********************************************
class cap
{
    enum capsize{大,小}
    capsize size;
}


public class test {

    //枚举法的使用
    public static void main(String [] args)
    {
        cap juicesize = new cap();
        juicesize.size = cap.capsize.大;
        System.out.println("服务员：您好，请问你要多大型号的果汁呢？");
        System.out.println("顾  客：O__O 。。。我要一" + juicesize.size + "杯！");

    }
 }
*/

    /**************************************8构造方法的运用******************************************8
     * 构造方法的练习
     *
     *
public class test {

    public test (){
                                                                   //每一个类都有一个默认的构造方法
    }
                                                                   //构造方法必须与类名相同
                                                                   //一个类可以有多个构造方法
    public test (String name,String color)
    {
        System.out.println("调用构造方法输出的内容是");
        System.out.println("我有一只"+color+"小狗，名字是：" + name );
    }
    public static void main(String[] args)
    {
                                                                    //创建一个test对象
                                                                    //使用关键字new来创建一个对象
        test dog = new test("球球","白色");



    }
     }
     */


    /*******************************************方法的调用********************************
    public class test{
        int age;
        //构造方法的使用
        public test(String name)
        {
            System.out.println("执行测试的名字是"+name);
        }
        //普通无返回值的方法
        public void setage(int sage)
        {
            age = sage;
        }
        //普通有int返回的方法，需有return语句返回
        public int getage(){
            System.out.println("执行人员今年"+age+"岁");
            return age;
        }

        public static void main(String[] args)
        {
            test tester= new test("shangying");
            tester.setage(23);
            tester.getage();
            System.out.println(tester.age);
        }
    }
     **********/

   /**********枚举练习
class Car{
    enum cartype{text,bus,busway,train,plan}
    cartype type;
    }
    public class test{
        public static void main(String[] args)
        {
            Car car =new Car();
            car.type = Car.cartype.bus;
            System.out.println("用户选择的车类型是"+car.type);

        }
    }
    */
   /*******方法调用******
   public class test{
       String connect;
       public test(String name){
           System.out.println("调用构造方法，输出内容:"+name);
       }
       public void setTest(String detil){
           connect =detil;
           getTest();
       }
       public void getTest(){
           System.out.println("调用普通方法输出setTest方法输入的内容："+connect);
       }
       public static void main(String[] args){
          test people;
          people = new test("shangying");   //test people = new test("shangying")
          people.setTest("afajsdlgjsdalfjsdfljsdal");

       }


   }
    ***/


   /*********************************************************************

public class test{
    public void pupAge(){
        //定义的变量需要进行初始化
        int age=0;
        age = age + 7;
        System.out.println("小狗的年龄是"+age);
       }
       public static void main(String [] args){
        test a=new test();
        a.pupAge();
       }
   }
    *******/
   /************************
   public class test{
       int age;
       public void dogAge(int age){
           this.age=age;
           System.out.println("小狗年龄是："+age);
       }
       public static void main(String [] args){
           test Dog=new test();
           Dog.dogAge(5);
       }
   }
    *****/
   /***********************************************
   public class test{
       public String name;
       private double salary;//私有变量，仅在该类中可见
       public test(String empName){
           this.name=empName;
       }
       public void setSalary(double salary){
           this.salary=salary;
       }
       public void printEmp(){
           System.out.println("姓名是："+name);
           System.out.println("薪资是："+salary);
       }
       public static void main(String[] args){
           test emp=new test("小小");
           emp.setSalary(10000);
           emp.printEmp();
       }
   }
    **********/
   /*******************************************

   //静态变量i可以直接在main中调用，若i不为静态变量，则只能先创建对象后才可使用
   class B{
       static int i;
      void  ac(int ci){
           i=ci;
       }
   }
   public class test {
       public static void main(String[] args) {
           B.i = 10;
           B a = new B();
           B b = new B();
           System.out.println(B.i + "," + a.i + "," + b.i);
           a.ac(5);
           System.out.println(B.i + "," + a.i + "," + b.i);
       }
   }
    ******************/
   /****************************************静态变量和普通变量间的区别
    *  //静态变量又称类变量，只有一块存储空间
    *  //普通变量是没创建一个对象都创建一个存储空间，变量间互不干扰
   public class test{
       public static int a=0;
       public int b=0;
       public void cha(){
           a++;
           b++;
           System.out.println(a+","+b);
       }
       public static void main(String[] args){
           for(int k=0;k<6;k++){
               test sta=new test();
               sta.cha();
           }
       }

   }
    **************/

   /**************************java修饰符*******************************/
   //default(可缺省)在同一个包内可见
   //private在同一个类中可见
   //public对所有类可见
   //protected对同一个包

/***********************private修饰符***************
//私有变量name在其他类中不允许访问，但是可以通过public定义的方法 Setname() Getname()去修改和返回name值
class Siyou{
    private String name;
    String pname;
    public void Setname(String sname){
        this.name=sname;
    }
    public String Getname(){
        return name;
    }
    public void Setpname(String sname){
        this.pname=sname;
    }
}
public class test{
    public static void main(String[] args){
        Siyou n=new Siyou();
        n.Setname("String 类型返回值");
        System.out.println("私有变量只能调用方法引用："+n.Getname());
        n.Setpname("gongyou");
        System.out.println("公有变量可以在外部直接引用："+n.pname);
    }
}
 **********/

/**************************练习********************
public class test{
    private static int numInstances=0;
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    public test(){
        test.addInstance();
    }
    public static void main(String[] args){
        System.out.println(test.numInstances);
        System.out.println(test.getCount());
        for(int i=0;i<500;++i){
            new test();
        }
        System.out.println(test.numInstances);

    }
}

 **************8888*/



/*************************************
//final变量只能初始化一次
/*****************throws、throw****************************/
public class test{
public static void function() throws NumberFormatException{
    String s="abc";
    System.out.println(Double.parseDouble(s));
        }
        public static void main(String[] args) {
            try {
                function();
            }catch (NumberFormatException e){
                System.err.println("非数据类型不能转换");
            }
        }

}