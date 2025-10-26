package renwu1;
import java.util.ArrayList;
import java.util.Date;
public class Account {
    int[] arr = new int[10];

    //数组索引从0开始，方便取地址，arr指向数组首地址是一个指针；memset初始化数组
    for(
    int i = 0;
    i<4;i++)

    {
        arr[i] = i;
    }
    for(
    int i = 4;
    i>2;i--)

    {
        arr[i] = arr[i - 1];
    }

    arr[2]=666;//把2后面的都向后移一位

//动态数组底层仍是静态，它的作用是自动扩容空间，并封装增删改查的操作

    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<10;i++){
        arr.add(i);
    }
    arr.add(2,666);
    arr.add(4,888);
    arr.remove(2);
    int a=arr.get(0);
}