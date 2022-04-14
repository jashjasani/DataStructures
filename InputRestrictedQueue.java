public class Main {

    public static void main(String[] args) {
       Dequeue dequeue = new Dequeue(4);

        dequeue.insert(1);
        dequeue.insert(4);
        dequeue.insert(5);
        dequeue.insert(9);

        dequeue.deleteFromFront();
        dequeue.deleteFromRear();

        dequeue.display();
    }
}

class Dequeue{
    int front,rear;
    int arr[];
    int size;

    public Dequeue(int size) {
        this.size = size;
        arr=new int[size];
        front=rear=-1;
    }
    public void insert(int n){
        if(rear==size-1){
            System.out.println("Queue full");
        } else {
            rear++;
            arr[rear]=n;
            if(front==-1){
                front=0;
            }
        }
    }
    public void deleteFromFront(){
        if(front==-1){
            System.out.println("Queue empty");
        } else {
            System.out.println("Deleting : " + arr[front]);
            front++;
        }
    }
    public void deleteFromRear(){
        if(rear==-1){
            System.out.println("Queue empty");
        } else {
            System.out.println("Deleting : " + arr[rear]);
            rear--;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("Queue empty");
        } else {
            System.out.print("Queue : ");
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
        }
    }
}
