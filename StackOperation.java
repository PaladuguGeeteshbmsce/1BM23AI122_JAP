
interface Stack{
    void push(int element);
    int pop();
    Boolean isEmpty();
    int size();
}

class FixedLengthStack implements Stack{

    private int[] stackArray;
    private int top;
    private int capacity;
    public FixedLengthStack(int capacity){
        this.capacity=capacity;
        this.stackArray=new int[capacity];
        this.top=-1;
    }
    @Override
    public void push(int element){
        if(top==capacity-1){
            System.out.println("the stack is full cannot push");
            return;
        }
        stackArray[++top]=element;
     }
    @Override
    public int pop(){
        if(isEmpty()){
            System.out.println("cannot pop stack is empty");
            return -1;
        }
        return stackArray[top--];
    }
    @Override
    public Boolean isEmpty(){
        return top==-1;
    }
    @Override
    public int size(){
        return top+1;
    }
}

class DynamicLengthStack implements Stack{
    private int[] stackArray;
    private int capacity;
    private int top;

    public DynamicLengthStack() {
        this.capacity = 2;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int element){
        if(top==capacity-1){
            System.out.println("increasing the capacity of stack");
            capacity=capacity*2;
            int[] newstackArray=new int[capacity];
            System.arraycopy(stackArray,0,newstackArray,0,stackArray.length);
            stackArray=newstackArray;
        }
        stackArray[++top]=element;

       }
    @Override
    public int pop(){
        if(isEmpty()){
            System.out.println("cannot pop");
            return -1;
        }
        return stackArray[top--];
    }
    @Override
    public Boolean isEmpty(){
        return top==-1;
    }
    @Override
    public int size(){
        return top+1;
    }

}

public class StackOperation {
    public static void main(String [] args) {
        /*FixedLengthStack stack1 = new FixedLengthStack(5);
        System.out.println("performing stack operations");
        performStackOperations(stack1);*/
       DynamicLengthStack stack2 = new DynamicLengthStack();
        System.out.println("performing stack operations for dynamic stack");
        performStackOperations(stack2);
    }
    public static void performStackOperations(Stack stack){
        System.out.println("is stack empyt"+stack.isEmpty());
        System.out.println("stack size is"+stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack size is"+stack.size());
        System.out.println("popped element is "+stack.pop());
        System.out.println("popped element is "+stack.pop());
    }



}
