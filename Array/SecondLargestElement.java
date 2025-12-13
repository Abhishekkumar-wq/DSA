public class SecondLargestElement{
    public static void main(String[] args){
        int[] arr={3,6,4,9,1};
      
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tempt=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tempt;
                    
                }
            }
           
        }
        System.out.println("Second largest element: "+arr[arr.length-2]);
    }
}