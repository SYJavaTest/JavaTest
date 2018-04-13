/**
 * Created by uccc on 2018/4/13.
 * 作者：尚莹
 * 文档用途：练习
 */

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


    /**
     * 构造方法的练习
     *
     *
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
     */


}

