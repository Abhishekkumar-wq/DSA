class node{
    int data;
    node next;
    node(int i){
        this.data=i;
    }
}
public class display{
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(100);
        head.next.next=new node(1000);

        display(head);



    }
    static void display(node head){
        node tempt=head;
        while(tempt!=null){
            System.out.println(tempt.data);
            tempt=tempt.next;


        }


    }


}