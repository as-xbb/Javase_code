/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 小赛毛
 * Date: 2025-07-30
 * Time: 23:56
 */
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        /*System.out.println(array.length);//行数

        System.out.println(array[0].length);
        System.out.println(array[1].length);

        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
*/

        //二维数组 就是一个特殊的一维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }/**/

        System.out.println("=====");

        for(int[] tmpArray : array) {
            for(int x : tmpArray) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("=====");

        //String ret = Arrays.toString(array);
        String ret = Arrays.deepToString(array);
        System.out.println(ret);

        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];


        int[][] array4 = new int[2][];

    }

    public static void main10(String[] args) {
        /*int[] array1 = {1,2,31,4,15};
        int[] array2 = {1,2,31,41,15};
        System.out.println(array1 == array2);
        boolean flg = Arrays.equals(array1,array2);
        System.out.println(flg);
*/

        int[] ret = new int[10];
        Arrays.fill(ret,1,3,-1);
        System.out.println(Arrays.toString(ret));
    }



    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void main9(String[] args) {
        int[] array = {1,2,31,4,15};
        //int[] copy = Arrays.copyOf(array,array.length*2);
        //int[] copy = Arrays.copyOfRange(array,1,3);
        //int[] copy = copyArray(array);
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);
        System.out.println(Arrays.toString(copy));
    }

    public static void bubbleSort(int[] array) {
        //i 代表趟数
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg ==false) {
                return;
            }
        }
    }

    public static void main6(String[] args) {
        int[] array = {1,2,31,4,15};
        System.out.println("排序前的数组："+Arrays.toString(array));
        bubbleSort(array);//默认从小到大排序
        System.out.println("排序后的数组："+Arrays.toString(array));
    }

    public static void funcc1(int[] array) {
        array[0] = 99;
    }

    public static void funcc2(int[] array) {
        array = new int[]{9,8,7,6,5};
    }
    //
    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];
            if(i != array.length-1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }

    /**
     * 查找效率 比较低  因为 他是 挨个查找
     * @param array
     * @param key
     * @return
     */
    public static int findNum(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //二分查找-> 必须是有序的数组
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if(array[mid] == key) {
                return mid;
            }else if(array[mid] > key) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main5(String[] args) {
        int[] array = {1,2,31,4,15};
        System.out.println("排序前的数组："+Arrays.toString(array));
        Arrays.sort(array);//默认从小到大排序
        System.out.println("排序后的数组："+Arrays.toString(array));

        int index = Arrays.binarySearch(array,1,3,15);//[1,3)

        //int index = binarySearch(array,3);

        System.out.println(index);

        /*String str = "hello" + 1;
        System.out.println(str);

        char[] chars = {'a','c','d'};*/
        //chars += 1;
    }

    //需求：把数组当中的每个数据 扩大2倍
    public static int[] func1(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i] * 2;
        }
        return ret;
    }

    //需求：把数组当中的每个数据 扩大2倍 -> 数组本身上扩大
    public static void func2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        func2(array);
        System.out.println(Arrays.toString(array));

        //int[] array2 = null;
        //System.out.println(array2.length);
        //System.out.println(array2[0]);
    }
    public static void main2(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        int[] array2 = new int[]{1,2,3,4,5};
        array2[0] = 100;
        array2[1] = 200;
        array1 = array2;
        array1[2] = 300;
        array1[3] = 400;
        array2[4] = 500;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    public static int max2(int a,int b) {
        return a > b ? a : b;
    }

    public static int max3(int a,int b,int c) {
        int max = max2(a,b);
        int ret = max2(max,c);
        return ret;
    }

    public static int add(int a,int b) {
        return a+b;
    }

    public static float add(float a,float b,float c) {
        return a+b+c;
    }

    public static void main1(String[] args) {
        System.out.println(max3(1, 2, 3));
        /*int[] array = {1,2,3,4,5};
        String ret = Arrays.toString(array);
        System.out.println(ret);*/
    }
}
