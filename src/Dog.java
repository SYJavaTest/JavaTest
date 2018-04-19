/**
 * Created by uccc on 2018/4/13.
 */

/**
 * 创建一个Dog类，
 * 包含barking，hungry,sleeping三个方法
 * 创建人：尚莹
 */
class Dog1 {
    String color;
    int age;
    String breed;
    void barking()
    {
        System.out.println("汪汪汪");

    }
    void hungry()
    {}
    void sleeping()
    {}


}
public class Dog{
    public static void main(String[] args)
    {
        Dog1 dog = new Dog1();
        dog.barking();
    }
}


