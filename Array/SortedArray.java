public class SortedArray{
    public static void main(String[] args){
        int[] arr={2,4,6,8,9};
        int i;

        for(i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                break;
            }

        }
        if(i== arr.length-1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}