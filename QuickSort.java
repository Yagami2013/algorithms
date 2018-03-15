/**
 * Created by hj on 2018/3/5.
 */
public class QuickSort {
    public int[] ar;
    public int lenth;
    public QuickSort(int[] ar){
        this.ar=ar;
        this.lenth=ar.length;
    }
    public static void main(String[] args){
        //int[] ar={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] ar={-5,38,15,15,15,36,26,27,2,46,4,19,50,48};
        QuickSort obj=new QuickSort(ar);
        obj.showArray(ar);
        obj.sort(ar,0,ar.length-1);
        obj.showArray(ar);

    }
    public int partition(int[] arr,int left,int right){
        int key=arr[left];
        int i=left;
        int j=right;
        while(i<j){
            while (arr[j]>=key&&i<j){
                j--;
            }
            while (arr[i]<key&&i<j){
                i++;
            }
            swap(arr,i,j);
            System.out.println("left="+left+",right="+right);
            System.out.println("i="+i);
            System.out.println("j="+j);
            showArray(arr);
        }
        //swap(i,pivot_index);
        //System.out.println(i);
        return i;

    }
    public void sort(int[] arr,int min,int max){
        if(min>=max){return;}
        if(min<max){
            if(min==(max-1)){
                if(arr[min]>arr[max]){
                    swap(arr,min,max);
                }
            }else {
                int pivot_index=partition(arr,min,max);
                sort(arr,min,pivot_index+1);
                sort(arr,pivot_index+1,max);
            }

        }
    }
    public void swap(int[] ar,int x1,int x2){
        if(x1<0||x1>lenth-1||x2<0||x2>lenth-1||x1==x2) return;
        int tmp=ar[x1];
        ar[x1]=ar[x2];
        ar[x2]=tmp;
    }
    public void showArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
}
