import java.util.Scanner;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小赛毛
 * Date: 2025-07-29
 * Time: 13:03
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("输出且换行");
        System.out.print("输出但是不换行");
        System.out.printf("%d\n",19);//格式化输出
    }

    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);

        int n1 = scanner.nextInt();
        System.out.println(n1);

        float f = scanner.nextFloat();
        System.out.println(f);
        /*int sum = 0;
        for (int j = 1; j <= n; j++) {
            int ret = 1;
            for (int i = 1; i <= j; i++) {
                ret *= i;
            }
            sum += ret;
        }*/
        System.out.println(sum);
    }

    public static void main15(String[] args) {
        int sum = 0;
        for (int j = 0; j < 5; j++) {
            int ret = 1;
            for (int i = 1; i < j; i++) {
                ret *= i;
            }
            sum += ret;
        }
        System.out.println(sum);
    }

    public static void main14(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main13(String[] args) {
        //求出1~100之间 所有既能被三整除 也能被五整除 的数字 要使用break 或 continue 做
        int i = 1;
        while(i <= 100) {
            if(i % 15 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main12(String[] args) {
        int i = 1;
        while(i <= 7){
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    //1! + 2! + 3! + 4! + 5!
    public static void main11(String[] args) {
        int j = 1;
        int sum = 0;
        //外层循环负责求阶乘的和
        while(j <= 5) {
            int i = 1;
            int ret = 1;
            //里层循环负责完成求阶乘的细节
            while(i <= j){
                ret *= i;
                i++;
            }
            j++;
            sum += ret;
            //System.out.println(ret);
        }
        System.out.println(sum);
    }

    public static void main10(String[] args) {
        int i = 1;
        int ret = 1;
        while(i <= 5){
            ret *= i;
            i++;
        }
        System.out.println(ret);
    }

    public static void main9(String[] args) {

/*        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }*/

        //条件为真就会一直执行下去
        while(true){
            System.out.println("死循环");
        }
      /*  int a = 10;
        switch (a){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("haha");
                break;
        }*/
    }

    public static void main8(String[] args) {
        int x = 10;
        int y = 10;
        if (x == 20) {
            if (y == 10){
                System.out.println("aaa");
            }else {
                System.out.println("bbb");
            }
        }
    }

    public static void main7(String[] args) {
        int num = 10;
        if(num % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }

    public static void main6(String[] args) {
        boolean flg = true;
        if(flg){
            System.out.println("aaa");
        }
        else {
            System.out.println("nnn");
        }
    }

    public static void main5(String[] args) {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }

    public static void main4(String[] args) {
   /*     byte a = -1;
        System.out.println(a >>> 1);
    */

      int a = 10 > 20 ? 10 : 20;
        System.out.println(a);

        boolean flg = true == true == false ? false : true;
        System.out.println(flg);
    }

    public static void main3(String[] args) {
        int a = 1;
        int b = 2;

        //不存在短路
        System.out.println(10 > 20 & 10 < 0);//false
        System.out.println(10 < 20 | 10 >0);//true

//        System.out.println(a > b && 10/0 == 0);

//        System.out.println(a < b || 10/0 == 0);
//        System.out.println(!true);
//        System.out.println(!false);

/*        System.out.println(10 > 20 &10 / 0 == 0);//程序抛出异常 不会出现短路
        System.out.println(10 < 20|| 10 /0 == 0);//程序抛出异常 不会出现短路*/

      /*  System.out.println(a > b || a == 1);//true
        System.out.println(a < b || a == 2);//true
        System.out.println(a < b || a == 1);//true
        System.out.println(a > b || a == 2);//false*/
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        //注意在Java中 = 表示赋值，要与数学中的含义区分
        //在Java中 == 表示相等
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a < b);//true
        System.out.println(a > b);//false
        System.out.println(a <= b);//true
        System.out.println(a >= b);//false
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
