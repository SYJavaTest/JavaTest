
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
/*****************throws、throw******************
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
 **********/
/***************算术运算符**************
public class test{
    public static void main(String[] args){
        int a=10,b=20,c=25,d=25;
        System.out.println("给定变量:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        System.out.println("不同运算结果:");
        System.out.println("a+b:"+(a+b));
        System.out.println("a-b:"+(a-b));
        System.out.println("a*b:"+(a*b));
        System.out.println("a%b:"+(a%b));
        System.out.println("a/b:"+(a/b));
        System.out.println("a++:"+(a++));
        System.out.println("当前a值："+a);
        System.out.println("++a:"+(++a));


    }
}*****/

/********************&&和||的运用***********
public class test{
    public static void main(String[] args){
        boolean a=true,b=false;
        System.out.println("a&&b:"+(a&&b));
        System.out.println("a||b:"+(a||b));
        System.out.println("!a:"+!a);

    }
}
 *******/
/*********************短路逻辑运算******
 public class test{
     public static void main(String[] args){
         int a=5;
         boolean b=(a<4)&&(++a>10);

         System.out.println("当前a的值为："+a);

     }
}******/
/*******************条件运算符（？：）**************
public class test{
    public static void main(String[] args){
        int a=5;
        int b;
        //判断a是否等于1，若等于则b=10，否则等于20
        b=(a==1)?10:20;
        System.out.println("输入b的值为："+b);
        b=(a==5)?10:20;
        System.out.println("输入b的值为："+b);

    }
}*********/
/*************8检查对象是否是某个特定类型************
public class test{
    public static void main(String[] args){
        String  a="3";
        boolean result;
        result=a instanceof String;
    }
}
 ********/
/*******************while循环********
public class test{
    public static void main(String[] args){
        int a=10,i=0;
        while (a<20){
            a++;
            i++;
            System.out.println("第"+i+"次循环，此时a的值为："+a);
        }
    }
}
 ***********/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*********************石头与宝石***********
class numJewelsInStones{
    public int numJeweLsInStones(int[] J,int[] S){
        int Jlen,Slen,a=0;
        Jlen=J.length;
        Slen=S.length;
        for (int i=0;i<Jlen;i++){
                for(int j=0;j<Slen;j++){
                    if(J[i]==S[j]){
                        a++;
                    }
                }
        }
        return a;

    }
}
public class test{
    public static void main(String[] args){
        int[] j={'s','d','f','a','b'};
        int[] t={'s','d'};

        numJewelsInStones a= new numJewelsInStones();
        System.out.println("宝石有"+a.numJeweLsInStones(j,t)+"个");
    }
}

 **************/

/************************test*****************************************************88
class ston{
    public  ston(int[] J,int[] S){
        int num=0;
        for(int i=0;i<J.length;i++){
            for(int j=0;j<S.length;j++){
                if(J[i]==S[j]){
                    num++;
                }
            }
        }
        System.out.println("石头中有"+num+"个宝石！");
    }
}
public class test{
    public static void main(String[] args){
        int[] j={'b','a'};
        int[] t={'a','A','A','b','b','b','b'};
        System.out.println("********************宝石与石头********************");
        System.out.print("宝石类型有：");
        for(int x:j){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println("");
        System.out.print("石头类型有：");
        for(int x:t){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println("");
        ston n=new ston(j,t);
    }
}
 ************************/
//  int [] j={'a','b'}
//   for(int x: j){System.out.println(x)}
//   循环输出数组j中的内容


/**********************************循环*****************************************/
//break;语句用来跳出整个语句块，跳出最里层的循环，并继续执行该循环下的语句
//continue让程序立即跳转到更新语句，进入下一次循环的迭代
    /****************brake语句的运用
public class test{
    public static void main(String[] args){
        for(int i=0;i<30;i++){
            for(int j=0;j<30;j++){
                if(i==j){
                    break;
                }else{
                    System.out.println(i+","+j);
                }
            }
        }
    }
}*****************/
/***********************continue*****************
public class test{
    public static void main(String[] args){
        for(int i=0;i<30;i++){
            for(int j=0;j<30;j++){
                if(i==j){
                    continue;
                }else{
                    System.out.println(i+","+j);
                }
            }
        }
    }
}
 ******/
/************************九九乘法表*****************
public class test{
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
               System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}********/
/************************等腰三角形*****************
public class test{
    public static void main(String[] args){
        int i,j,q;
        for(i=1;i<6;i++){
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            for(q=1;q<i*2;q++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
 **/
/*************
public class test{
    public static void main(String[] args){
        int i,p,q;
        for(i=1;i<6;i++){


            for(p=6;p>i;p--){
                System.out.print(" ");
            }
            for(q=1;q<=i*2-1;q++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
 **********/
/*******************************

public class test{
    public static void main(String[] args){
        int k=0;
        System.out.println("200以内能被7整除但不能被4整除的数字为：");
        for(int i=1;i<=200;i++){
            if(i%7==0 && i%4 !=0){
                k++;
                System.out.print(i+"  ");
                if(k%6==0){
                    System.out.println();
                }
            }
        }
    }
}
 **************/
/**************88
public class test{
    public static void main(String[] args){
       System.out.print("输入'《空房间》'内容");
       int a=9;
       char c='a';
       String b="sdfs12424df";
        List arry=new ArrayList();
        arry.add(b);

        System.out.println(Character.isLetter(a));
        System.out.println(Character.isLetter(c));
        System.out.println(arry.size());

    }
}************/
/********************输入一个数组，判断输入类型，输出数组运用foreach遍历输出数组****************8
 public class test{
    public static void main(String[] args){
     //声明一个int型的数组变量
     int [] arraynum;
     //该变量的数组长度为5
     arraynum=new int[5];
    //声明和创建一起
    System.out.print("请输入5个数字：");
    try{
        int [] array=new int[5];
        for(int i=0;i<arraynum.length;i++){
            Scanner input=new Scanner(System.in);
            arraynum[i]=input.nextInt();

         }
         System.out.print("输出数组：");
         for(int x:arraynum){
            System.out.print(x);
            System.out.print("  ");
        }
        int total=0;
        for(int i=0;i<arraynum.length;i++){

        total +=arraynum[i];
    }
    System.out.print("输出总数："+total);

     }catch (Exception e){
    System.out.print("输入内容格式不正确！");
 }


 }
 }*************************/

/***************************数组为函数的参数****************
class arary{
    public void shuzu(int[] array){
        for(int x:array){
            System.out.print(x);
            System.out.print(" ");
        }

    }
    public static int[] rshuzu(int[] array){
        int [] result=new int[array.length];
        for(int i=0;i<array.length;i++){
            result[i]=array[i];

        }
        return result;
    }
}
public class test{
    public static void main(String[] args){
        int [] a={5,6,7,8};
        arary s=new arary();
        System.out.println("调用函数，函数内输出：");
        s.shuzu(a);
        System.out.println("");
        System.out.println("函数返回数组类型：");
       for(int j:s.rshuzu(a)){
           System.out.println(j);
       }


    }
}*************/
/***********************冒泡排序****************
public class test{
    public static void main(String[] args){
        int[] a={56,45,23,745,123,645,37,34,54,456};
        System.out.print("原数组的顺序为：");
        for(int x:a){
            System.out.print(x+"  ");
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){//注意j<a.length-1  因为j+1不能大于数组长度
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("冒泡后数组的顺序为：");
        for(int k:a){
            System.out.print(k+"  ");
        }
        System.out.println();

    }
}
 ********/
/***********************选择排序************
public class test{
    public static void main(String[] args){
        int [] a={13,345,23,143,12,65,74,348,23};
        System.out.println("原数组为：");
        for(int x:a){
            System.out.print(x+"  ");
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-1;j++){
                int temp;
                if(a[j]>a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("从大到小排序：");
        for(int x:a){
            System.out.print(x+"  ");
        }
    }
}************/
/***************************8随机打乱并输出数组内容******************8
public class test{
    public static void main(String[] args){
        char [] chs={'我','是','好','孩','子'};
        int dex;
        int [] a=new int[chs.length];
        for(int i=0;i<chs.length;i++){
            dex=(int)(Math.random()*chs.length);
            a[i]=dex;
        }
        for(int j=0;j<a.length;j++){
            int k;
            k=a[j];
            System.out.print(chs[k]);

        }
        System.out.println();
    }
}******************8**************/
/*************************获取当前日期时间****************
import java.util.Date;
public class test{
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());//输出当前年月日时间点  周几
        System.out.println(date.getTime());//输出自1970年到现在的毫秒数
        System.out.printf("%tc%n",date);
        System.out.printf("%tF%n",date);
        System.out.printf("%tD%n",date);
    }
}
 ************/

/*public class test{
    public static void main(String args []){
        char [] helloArray={'r','u','n'};
        String []list={"ma","cao"};
        String helloString=new String(helloArray);
        System.out.println(helloString);
        System.out.println(helloString.length());
        System.out.println(helloArray);
        System.out.println(helloArray.length);
        List array=new ArrayList();
        array.add(list);
        System.out.println(array.size());

    }
}**/
/**
public class test{
    public static void main(String[] args){
        // 变量保存成绩
        int score = 53;

        // 变量保存加分次数
        int count = 0;


        //打印输出加分前成绩

        System.out.println("加分前成绩："+score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        while(score<60){
            count++;
            score++;

        }
        System.out.println("加分后成绩："+score);
        System.out.println("共加了"+count+"次！");
    }
}*/
public class test {

    public static void main(String[] args) {

        // 定义一个整型数组，并赋初值
        int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };

        int max = nums[0]; // 假定最大值为数组中的第一个元素
        int min = nums[0]; // 假定最小值为数组中的第一个元素
        double sum = 0;// 累加值
        double avg = 0;// 平均值
        int i;

        for ( i = 0; i < nums.length; i++) { // 循环遍历数组中的元素
            // 如果当前值大于max，则替换max的值
            if(i+1<nums.length){
                if(max<nums[i+1]){
                    max=nums[i+1];
                }


                // 如果当前值小于min，则替换min的值
                if(min>nums[i+1]){
                    min=nums[i+1];
                }
            }

            // 累加求和
            sum+=nums[i];

        }

        // 求平均值
        avg=sum/i;

        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);
    }
}