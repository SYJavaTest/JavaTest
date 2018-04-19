import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created by uccc on 2018/4/17.
 * 作用：静态变量和实例变量的区别
 * 1.无论创建多少个实例对象， 永远都只分配了一个 静态staticInt 变量
 * 2.每创建一个实例对象，就会分配一个 实例变量random
 * 3. 实例变量属于某对象的属性，必须创建实例对象，实例变量才会被分配空间
 * 4. 静态变量不属于某个实例对象，它属于类，所以不需要创建实例对象就可以直接使用
 * 5. 实例变量必须创建对象后，才可通过这个对象来使用实例变量，静态变量则可直接用类名引用
 */
class A{
    //声明变量并赋值
    public static String StaticA="A";
    //声明变量与赋值分离
    public static String StaticB;
    static {StaticB="B";}

    //静态语句块修改值
    static {
        StaticA="A1";
    }
    //构造函数
    public A(){
        StaticA ="A2";
    }
    public static void toChange(){
        StaticA="A3";
    }
}
public class StaticTest {
    private static int staticInt=2;
    private int random=2;
    public StaticTest(){
        staticInt++;
        random++;
    }
    public static void main(String[] args){
        //实例变量必须创建对象后，才可通过对象使用实例变量
        StaticTest test=new StaticTest();
        System.out.println("第一次创建StaticTest类型对象时，输出内容：\n"+"staticInt:"+test.staticInt+"\nrandom:"+test.random);
        StaticTest test1=new StaticTest();
        System.out.println("第二次创建StaticTest类型对象时，输出内容：\n"+"staticInt:"+test.staticInt+"\nrandom:"+test.random);
        System.out.println("静态变量赋值");
        System.out.println("静态变量不创建对象直接访问:"+A.StaticA);
        A intface=new A();
        System.out.println("实例变量创建对象后才能访问："+intface.StaticA);
        A.toChange();
        System.out.println("调用静态方法更改StaticA的值："+intface.StaticA);
        System.out.println("调用静态方法更改StaticA的值："+A.StaticA);




    }
}
