import java.io.*;
import java.text.Collator;
import java.util.*;

class  Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
public class Main {

    public static void main(String[] args) throws IOException
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Main T = new Main();
        T.solution(n , arr);

    }

    public void solution(int m, int[] arr) {
        int[] answer = insertionSort(arr);

        for(int n : answer){
            System.out.println(n);
        }

    }

    public int[] insertionSort(int[] arr){

        for(int i = 1; i< arr.length; i++) {
            int temp = arr[i], j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
             }
            arr[j+1] = temp;
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr){
        for(int j = 1; j < arr.length; j++){
            for(int i = 0 ; i < arr.length-j; i++)
            {
                if(arr[i]>arr[i+1]) swap(arr,i , i+1);
            }
        }
        return arr;
    }

    public int[] selectSort(int[] arr){
        int min;
        for(int i = 0 ; i < arr.length-1; i++)
        {
            min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]) min = j;
            }
            swap(arr,i,min);
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}