import java.util.Scanner;

interface stackInterface {
   void push(int value);
   int pop();
   void disp();
}
class Stack implements stackInterface {
   int a[];
   int value;
   int top;
   Stack(int size) {
      a = new int[size];
      top = -1;
   }
   public void push(int value) {
      if (top == 4) {
         System.out.println("Stack is OverFlow");
         return;
      } else {
         top++;
         a[top] = value;
      }
   }
   public int pop() {
      if (top == -1) {
         System.out.println("Stack is underflow");
         return -1;
      } else {
         int v = a[top--];
         return v;
      }
   }
   public void disp() {
      if (top == -1) {
         System.out.println("Stack is underflow");
         return;
      } else {
         System.out.println("Contents of the stack are: ");
         for (int i = top; i >= 0; i--) {
            System.out.println(a[i] + "");
         }
      }
   }
}

public class DriverStack {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ch;
      Stack s = new Stack(5);
      do {
         System.out.println("Enter the choices: ");
         System.out.println("1. Push 2. Pop 3. Disp 4. exit");
         ch = sc.nextInt();
         switch (ch) {
            case 1:
               System.out.println("Enter the value to be stored in the Stack");
               int val = sc.nextInt();
               s.push(val);
               break;
            case 2:
               s.pop();
               System.out.println("Popped");
               break;
            case 3:
               s.disp();
               break;
            case 4:
               System.exit(0);
               break;
         }
      } while (ch != 4);
      sc.close();
   }
}
