import java.util.*;
class stackToQueue{

    Stack<Integer> push_stack;
    Stack<Integer> pop_stack;

    public stackToQueue(){
        push_stack= new Stack<>();
        pop_stack= new Stack<>();
    }

    void push(int x){
        push_stack.push(x);
    }

    int pop(){
        if(pop_stack.isEmpty()){
            shift_to_otherStack();
        }    
        return pop_stack.pop();
    }

    void shift_to_otherStack(){
        while(!push_stack.isEmpty()){
            pop_stack.push(push_stack.pop());
        }
    }
    

    int peek(){
        if(pop_stack.isEmpty()){
            shift_to_otherStack();
        }
        return pop_stack.peek();
    }
}