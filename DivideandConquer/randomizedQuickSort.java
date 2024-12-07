public class randomizedQuickSort {
    public static int partition(int arr[],int l,int h){
        int randomIndex = l + (int)Math.random()%(h-l+1);
        int temp = arr[randomIndex];
        arr[randomIndex]=arr[l];
        arr[l]=arr[randomIndex];

        int pivot=arr[l];
        int i=l;
        for(int j=l+1;j<=h;j++){
            if(arr[j]<=pivot){
                i=i+1;
//            swap(arr[i],arr[j])
                 temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
//            swap(arr[l]==arr[i])
//            to get the coorect poistion of the pivot Element
             temp=arr[l];
            arr[l]=arr[i];
            arr[i]=temp;
        }
        return i;
    }
    //    Function of the quickSort Algorithm
    public static void quickSort(int arr[],int l,int h){
        if(l<h){
//            1.Divide the array into two subproblems
            int m=partition(arr,l,h);
//            2.Conquer the subproblems via the recursion
            quickSort(arr,l,m-1);
            quickSort(arr,m+1,h);
        }
    }
    //    Function to display the array
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[]={50,30,70,90,10,34,89,98,13};
        int n=arr.length;

        System.out.print("Array before sorting is : ");
        printArr(arr,n);

        quickSort(arr,0,n-1);

        System.out.print("Array after sorting is : ");
        printArr(arr,n);
    }
}
