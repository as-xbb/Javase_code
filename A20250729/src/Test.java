/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小赛毛
 * Date: 2025-07-29
 * Time: 8:28
 */
public class Test {

    public static void main(String[] args) {
        int a = 10;
        a += 1;//a = a + 1
        System.out.println(a);

        int c = 10;
        long d = 20L;
        //c = c + d;
        c += d;//运算符帮忙进行转换了
        System.out.println(c);
    }

    public static void main16(String[] args) {
        System.out.println(10 % 3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(11.5 % 2.0);//可以对小数进行求余数
        System.out.println(1 + 2.0);
    }

    public static void main15(String[] args) {
        //System.out.println(5 / 2);//2
        System.out.println(5 / 0);
    }

    //字符串变成整数
    public static void main14(String[] args) {
        String s = "123";
        //int a = Integer.valueOf(s);//底层实现 parseInt
        int a = Integer.parseInt(s);
        System.out.println(a + 1);
    }

    //整数变成字符串
    public static void fun() {
        int a = 123;
        String str = a+"";
        System.out.println(str);
        System.out.println("=====");

        String str1 = String.valueOf(a);
        System.out.println(str1);
    }

    public static void main13(String[] args) {
        int a = 10;
        //a == 10
        System.out.println("a = " + a);

        int c =20;
        System.out.println("a == " + a + c);
        System.out.println("a == " + (a + c));

        System.out.println(a + c + "=a + c");//第一个加号 计算求和   第二个加号的时候 是拼接

        //System.out.printlf("a = %d\n",a);
    }

    public static void main12(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = "word";
        System.out.println(str + str2);//使用+可以对字符串进行拼接

        System.out.println(str.charAt(0));
    }

    public static void main11(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
    }

    public static void main10(String[] args) {
        int a = 10;//4
        long b = 20;//8
        //a提升为long long类型 和 long类型 进行运算 结果就是long类型
        int c = (int)(a + b);
        long c2 = a + b;
    }

    public static void main9(String[] args) {
        int a = 10;
        long b = 100L;
        //b = a;
        a = (int)b;
    }

    public static void main8(String[] args) {
        //没有明确说明大小是多少字节？
        boolean b = true;
        System.out.println(b);
    }

    public static void main7(String[] args) {
        //char 类型 是2个字节 unicode字符集
        char cha1 = 'a';
        char cha2 = '高';
        System.out.println(cha1);
        System.out.println(cha2);
        Character c = 'p';
    }

    public static void main6(String[] args) {
/*        double d = 12.5;
        System.out.println(d);*/

        float f = 12.5F;
        System.out.println(f);
    }

    public static void main5(String[] args) {
        /*
         字节型 1个字节
         char
         -2^7   2^7 -1
         */
        byte a = 10;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }

    public static void main4(String[] args) {
        /*
         短整型    2个字节
         -2^15  2^15    -1
         */
        short sh = 10;
        System.out.println(sh);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }

    public static void main3(String[] args) {
        /*
         长整型    8个字节
         */
        long a = 10L;
        System.out.println(a);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }

    public static void main2(String[] args) {
        //数据类型＋变量
        /**
         * 4个字节
         * 最大值：
         * 最小值：
         */
        int a = 10;
        System.out.println(a);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer b = 100;
        System.out.println(b);

        int c;
        c = 19;
        System.out.println(c);
    }

    public static void main1(String[] args) {
        System.out.println(10);
        //const
        final int size = 10;
        System.out.println();
    }
}
