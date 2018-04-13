/**
 * Created by uccc on 2018/4/13.
 */

/**
 * 构造方法的使用
 * 每个类都有一个默认的构造方法
 * 构造方法的名称必须与类同名
 * 一个类可以有多个构造方法
 */
public class Faction {
    //默认的构造方法
    public Faction(){
    }
    public Faction(String name)
    {
        System.out.println("方法的名字是：" + name);
    }
    public static void main(String[] args)
    {
        Faction myFaction = new Faction("tommy");
    }

}
