public class largestElementinArray{
    public static void main(String[] args){
        int[] arr={2,5,7,9,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        } 
        System.out.println("Largest Element: "+max);
    }
}