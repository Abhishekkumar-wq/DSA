public class stringToArray{
    public static void main(String[] args){
        String s="Abhishek";    //ab ish string ko array m convert krna hoga
        char[] arr=s.toCharArray();    //aur yeha string array m convert hogai,yahho!!
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}