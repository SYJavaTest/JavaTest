/**
 * name: shangying
 * Created by uccc on 2018/4/13.
 */
/**
 * 类方法详细说明
 * 类名：FreshJuice
 * 功能：果汁型号大小
 * 创建人：尚莹
 * 创建时间：2018/4/13.
 */
class FreshJuice
{
    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}  //枚举FreshJuiceSize这个方法的值有这三个值
    FreshJuiceSize size;

}

public class FreshJuiceTest {
    public static void main(String[] args)
    {
        /**
         * 调用FreshJuice类选择型号
         */
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.print("采用枚举法，选择了");
        System.out.print(juice.size);
        System.out.println("果汁！");
        FreshJuice smalljuice = new FreshJuice();
        smalljuice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.print("采用枚举法，选择了");
        System.out.print(smalljuice.size);
        System.out.println("果汁！");



    }

}

