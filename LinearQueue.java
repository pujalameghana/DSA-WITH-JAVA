import java.util.Scanner; 
 
public class LinearQueue  
{ 
       static final int MAX=5;
      static  int[] arr=new int[5];
     static  int front =0;
     static int rear=0; 
    public static boolean isEmpty() { 
        return front == rear; 
    } 
    public static boolean isFull() { 
        return rear == MAX; 
    } 
    public static void enqueue(int item)  
{ 
if(isFull()){
    System.out.println("queue is full");
}
else{
    arr[rear]=item;
    rear++;
System.out.println("enqueued" +item);

}
} 
 
    public static void dequeue()  
{ 
if(isEmpty()){
    System.out.println("queue is empty");
}
else{
    int x=arr[front];
    front++;
System.out.println("dequeued" +x);
}

} 
public static void display()  
{ 
        if(isEmpty()){
System.out.println("queue is empty");
}
else{
   System.out.println("queue elements: ");
for(int i=front;i<rear;i++){
   System.out.print(arr[i]+" ");
}
System.out.println();
     } 
}
    public static void main(String[] args)  
{ 
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter an element to enqueue: ");
                    int item = scanner.nextInt();
                    enqueue(item);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }          
} 
