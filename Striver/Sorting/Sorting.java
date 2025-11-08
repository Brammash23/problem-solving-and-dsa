public class Sorting {

    public static void main(String [] args)
    {

    }


    public static int [] selectionSort(int [] arr)
    {
        for(int i=0;i<arr.length-2;i++)
        {
            int min = i;
            for(int j=i;i<arr.length-1;j++)
            {
                if (arr[min]>arr[j]) {
                    min=j;
                }

            }
            swap(arr,i,min);
        }
        return arr;
    }

    public static int [] bubbleSort(int [] arr)
    {
        int didswap = 0;
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j+1]>arr[j])
                {
                    swap(arr,j,j+1);
                    didswap=1;
                }

                if (didswap == 0) {
                    break;
                }
            }
        }
    };
    
    public static int [] mergeSort(int [] arr,int low,int high)
    {
        if (low >= high) {
            return arr;
        }
        int mid = low + high /2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeArray(arr,low,mid,high);
        return arr;

    }

    public static int [] mergeArray(int [] arr,int low,int mid,int high){

        int n1=mid-low+1;
        int n2 = high-mid;
        int [] left = new int [n1];
        int [] right = new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i]=arr[low+1];
        }

        for(int j=0;j<n2;j++)
        {
            right[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=low;

        while(i<n1 && j<n2)
        {
            if (arr[i]<arr[j]) {
                arr[k++]=left[i++];
            }
            else
            {
              arr[k++]=right[j++];
            }
        }

        while(i<n1)
        {
            arr[k++]=left[i++];
        }

        while(j<n1)
        {
            arr[k++]=left[i++];
        }

        return arr;
        
    }; 

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    
}
