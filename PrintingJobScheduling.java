import java.util.LinkedList;
import java.util.Queue;

public class PrintingJobScheduling {
    Queue<String> printer = new LinkedList<>();


    public void addDocument(String s){
        printer.add(s);
        System.out.println("New Document " + s + " is added to the queue");
    }

    public void printDocument(){
        while(!printer.isEmpty()){
            System.out.println("Printing " + printer.peek());
            System.out.println("Document " + printer.poll() + " is printed");
        }
    }

    public static void main(String[] args) {
        PrintingJobScheduling pjs = new PrintingJobScheduling();
        pjs.addDocument("D1");
        pjs.addDocument("D2");
        pjs.addDocument("D3");
        pjs.printDocument();
    }
}
