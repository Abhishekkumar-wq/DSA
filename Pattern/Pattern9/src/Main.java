class main{
    static void pattern9(int n){
        int x=2*(n-1);

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=x;j++){
                System.out.print(" ");

            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            x-=2;
        }


    }
    public static void main(String[] args){
        int n=5;
        pattern9(n);
    }
}