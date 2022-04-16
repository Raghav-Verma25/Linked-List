import java.util.Scanner;

public class updation {
    Scanner sc = new Scanner(System.in);
    class Node{
        int data;
        Node next;
        Node(int value){
            this.data= data;
            this.next=null;
        }
    }

    public void createList(){
        System.out.println("Enter a size of Linkedlist ");
        int size = sc.nextInt();
        System.out.println("enter a 1 element ");
        int value = sc.nextInt();
        Node temp = new Node(value);
        Node head = null;
        temp.next=null;
        head = temp;

        for(int i=2 ; i< size+1 ; i++){
            System.out.println("enter " + i + " element ");
            int ele = sc.nextInt();
            Node n = new Node(ele);
            temp.next=n;
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        updation obj = new updation();
        obj.createList();
    }
}
