import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        Main T = new Main();
        T.solution(arr);
    }

    public void solution(int[] arr) throws IOException{
        mergeSort(arr, 0, arr.length - 1);
        // countingSort(arr);
        //quickSort(arr, 0, arr.length-1);
        //int[] answer = insertionSort(arr);
        //int[] answer = bubbleSort(arr);
        // int[] answer = selectSort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int n : arr) {
            bw.write(n+"\n");
        }
        bw.close();
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = quickSortUtil(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    private int quickSortUtil(int[] arr, int left, int right) {
        int pivot = arr[left];
        int l = left, r = right;
        while(l < r){
            while(arr[r] > pivot && l < r) r--;
            while (arr[l] <= pivot && l < r) l++;
            swap(arr, l, r);
        }
        swap(arr, left, l);

        return l;
    }

    public void countingSort(int[] arr){
        // 문제에 나온 index 범위 만큼
        boolean[] temp = new boolean[2001];

        for(int i = 0; i < arr.length; i++){
            temp[arr[i]] = true;
        }

        for(int i = 0; i < temp.length; i++){
            if(temp[i]) System.out.println(i);
        }
    }
    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        mergeSortUtil(arr, left, mid, right);

    }

    private void mergeSortUtil(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int tempIndex = 0;
        //int tempIndex = left;
        
        int[] temp = new int[right-left+1];
        //int[] temp = new int[arr.length];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[tempIndex++] = arr[i++];
            } else {
                temp[tempIndex++] = arr[j++];
            }
        }
        /*앞(왼쪽)부분 배열에 원소가 남아있는 경우*/
        while (i <= mid) {
            temp[tempIndex++] = arr[i++];
        }
        /*뒤(오른쪽)부분 배열에 원소가 남아있는 경우*/
        while (j <= right) {
            temp[tempIndex++] = arr[j++];
        }

        int k = 0;
        while(left <= right){
            arr[left++] = temp[k++];
        }
        /*for (int index = left; index < tempIndex; index++) {
            arr[index] = temp[index];
        }*/
    }

    // 삽입 정렬
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    // 버블 정렬
    public int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    // 선택 정렬
    public int[] selectSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            swap(arr, i, min);
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
