public class Main {

    public static void main(String[] args) {
	    CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.insert(5);
        circularQueue.insert(6);
        circularQueue.insert(2);

        circularQueue.display();

        circularQueue.insert(4);
        circularQueue.delete();

        circularQueue.insert(4);
        circularQueue.display();
    }
}

class CircularQueue {
    int front = -1, rear = -1;
    int arr[];
    int size;
    public CircularQueue(int size) {
        arr = new int[size];
        this.size=size;
    }

    public boolean queueFull() {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int n) {
        if (queueFull()) {
            System.out.println("Queue is full");
        } else {
            rear=(rear+1)%(size);
            arr[rear] = n;
            if (front == -1) {
                front = rear;
            }
        }
    }
    public void delete(){
        if(front==-1){
            System.out.println("Queue empty");
        } else {
            front=(front+1)%(size);

        }
    }
    public void display(){
        if(front==-1){
            System.out.println("Queue empty");
        } else {
            System.out.print("Queue : ");
            if(rear>front){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            } else {
                for(int i=front;i<size;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int j=0;j<=rear;j++){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
