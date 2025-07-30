/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小赛毛
 * Date: 2025-07-30
 * Time: 20:53
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author 12629
 * @Description：
 */
public class Test {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("=====");
        //for each循环
        for (int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("===Arrays===");
        //操作数组的工具类  Arrays
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }

    public static void main21(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = new int[]{1,2,3,4,5,6};
        int[] array3 = new int[10];

        //int array4[] = {1,2,3,4}; 不建议

        int[] array4;
        array4 = new int[4];

        /*int[] array5;
        array5 = {1,2,3,4};*/

        boolean[] flg = new boolean[3];

    }












    public static int fac(int n) {
        if(n == 1) return 1;
        return n * fac(n-1);
    }

    public static void print(int n) {
        if(n < 10) {
            System.out.println(n);
            return;
        }
        print(n/10);
        System.out.println(n % 10);
    }

    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }

    public static int sumFunc(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 + sumFunc(n/10);
    }


    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main20(String[] args) {
        System.out.println(fib2(1));
        System.out.println(fib2(5));
        System.out.println(fib2(6));
        System.out.println(fib2(40));
    }

    public static int add(int a,int b) {
        return a+b;
    }
   /* public static double add(int a,int b) {
        return a+b;
    }*/


    public static int add(int a,int b,short c) {
        return a+b+c;
    }
    public static int add(int a,short c,int b) {
        return a+b+c;
    }
    public static double add(double a,double b) {
        return a+b;
    }

    public static void main13(String[] args) {
        int x = 1;
        int y = 2;
        int ret = add(x,y);
        System.out.println(ret);

        double d1 = 1.0;
        double d2 = 2.0;
        double ret2 = add(d1,d2);
        System.out.println(ret2);


        int a = 10;
        //int a = 20;

    }
    public static void func(int year) {
        year = 100;
    }

    //学完类和对象以后 才能真正理解 怎么交换
    public static void swap(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main12(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println(x +" " + y);
    }

    public static void main11(String[] args) {
        int year = 2008;
        //&year;
        func(year);
        System.out.println(year);
    }
    public static void main10(String[] args) {
        boolean ret = isLeapYear(2008);
        if(ret == true) {
            System.out.println("是闰年！");
        }
    }
    public static boolean isLeapYear(int year) {
        System.out.println("方法被调用了....");
        if((0 == year % 4 && 0 != year % 100) || 0 == year % 400){
            return true;
        }else{
            return false;
        }
    }

    public static void main9(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(100);//[0,100)
        System.out.println(randNum);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
            if(num < randNum) {
                System.out.println("小了");
            }else if(num == randNum) {
                System.out.println("等于");
                break;
            }else {
                System.out.println("大了");
            }
        }
    }

    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("读入一个整型：");
        int age = scan.nextInt();
        System.out.println(age);//12 回车

        scan.nextLine();

        System.out.println("读入一个字符串：");
        String str = scan.nextLine();
        System.out.println(str);

        System.out.println("读入一个小数：");
        float f = scan.nextFloat();
        System.out.println(f);

    }

    public static void main7(String[] args) {
        int n = 7;
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main6(String[] args) {
        int a = 24;
        int b = 18;
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }
    public static void main5(String[] args) {
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    public static void main4(String[] args) {
        for (int i = 0; i < 999999; i++) {
            int count = 0;
            int tmp = i;//123
            while (tmp != 0) {
                count++;
                tmp /= 10;
            }
            tmp = i;//123
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10,count);
                tmp /= 10;
            }
            if(sum == i) {                System.out.println(i);
            }
        }
    }

    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            for(int i = 0;i < a;i++) {
                for(int j = 0;j < a;j++) {
                    if(i == j || i+j == (a-1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main2(String[] args) {
        int n = 7;
        int i = 2;
        for (; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                break;
            }
        }
        if(i > Math.sqrt(n)) {
            System.out.println(n +" 是素数！");
        }
    }
    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 9) {
                count++;
            }
            if(i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
