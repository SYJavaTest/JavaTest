/**
 * Created by uccc on 2018/4/16.
 */
//创建一个Puppy类
public class Puppy {
    //包含int型变量puppyAge
    int   puppyAge;
    //构造方法：输出名字
    public Puppy(String name)
    {
        System.out.println("小狗的名字是："+name);
    }
    //普通方法
    public void setAge(int Age)
    {
        puppyAge = Age;
    }
    //普通方法，有一个int型返回值，所以要有return返回语句
    public int getAge(){
        System.out.println("小狗的年龄是:"+puppyAge);
        return puppyAge;

    }
    public static void main(String[] args)
    {
        //创建一个类型为Puppy的dog对象
        Puppy dog = new Puppy("球球");
        //调用对象下的setAge()，getAge()方法
        dog.setAge(4);
        dog.getAge();
        //输出成员变量puppyAge的值
        System.out.println("变量值是"+dog.puppyAge);
    }




}
