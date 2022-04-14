public class Main {

    public static void main(String[] args) {
	    Dequeue dequeue = new Dequeue(4);

        dequeue.insertAtFront(1);
        dequeue.insertAtFront(2);
        dequeue.insertAtRear(3);

        dequeue.display();

        dequeue.delete();
        dequeue.display();

    }
}

class Dequeue{
    int front,rear;
    int arr[];
    int size;
    int totalElements=0;

    public Dequeue(int size) {
        this.size = size;
        arr=new int[size];
        front=rear=-1;
    }

    public void insertAtFront(int n){
        if(totalElements==size){
            System.out.println("Queue full");
        } else {
            if(front==-1){
                front=0;
                rear=0;
                arr[front]=n;
            }else {
                front=((front-1)%size);
                if(front<0){
                    front=front+size;
                }
                arr[front]=n;
            }
            totalElements++;
        }
    }
    public void insertAtRear(int n){
        if (totalElements==size){
            System.out.println("Queue full");
        } else {
            rear=(rear+1)%size;
            arr[rear]=n;
            totalElements++;
        }
    }

    public void delete(){
        if(totalElements==0){
            System.out.println("Queue empty");
        } else {
            front++;
            if(rear==front){
                rear=-1;
                front=-1;
            }
        }
    }

    public void display(){
        if(totalElements==0){
            System.out.println("Queue empty");
        } else {
            System.out.print("Queue : ");
            if(rear<front){
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
