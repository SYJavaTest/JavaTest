/**
 * Created by uccc on 2018/4/16.
 */
public class java1 {
    String name,sex,great;
    public void setname(String name,String sex,String great){
        this.name = name ;
        this.great = great;
        this.sex = sex;
    }
    public void getprint()
    {
        System.out.println("调用java1文件方法，输出"+name+great+sex);
    }
    public static void main(String[] args){
        java1 diao=new java1();
        diao.setname("\nshangying\n","女\n","计算机一班\n");
        diao.getprint();
    }

}
