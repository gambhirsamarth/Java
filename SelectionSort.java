public class SelectionSort{
    public static void main(String args[]){

        int arr[]={67,78,22,13,1};
        int n = arr.length;
        System.out.println(n);

        for(int i=0;i<n-1;i++){
            int index = i;
            int minEle = arr[index];
            int jindex = -1;

            for(int j=i+1 ; j<n;j++){

                if(arr[j] < minEle){
                    minEle = arr[j];
                    jindex = j;

                }
            }

            int temp = arr[index];

            if(minEle != arr[index]){
                arr[index] = minEle;
                arr[jindex] = temp;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }   
    }
}