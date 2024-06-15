public class Insertion {
    //creating a Node Class(doubly LinkedList should take 3 pointer 1-previous(reference to previous node),2-data(to store actual data),3-prev(reference to the previous data))
    static class Node{
        int data;
        Node prev;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }
       private Node head;
       void push(int new_data){
        Node new_Node = new Node(new_data);

        new_Node.next = head;
        new_Node.prev = null;
       
      
       if(head != null){
        head.prev = new_Node;
       }
       head = new_Node;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    System.out.println();
    }


    
public static void main(String[] args) {
    Insertion list = new Insertion();
    list.push(5);
    list.push(10);
    list.push(15);
    System.out.println("Created Doubly Linked List is: ");
    list.printList();
}
          
}
