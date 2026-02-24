public class moveZero{
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int n=arr.length;
        int count=0;  //count of non zero elements
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];  //place non zero element at the count index and increment count
            }
        }
        while(count<n){   //fill remaining elements with zero
            arr[count++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}