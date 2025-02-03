public class StackWithVector<T> implements IStack<T>{
    IStack<T> miVector = new Vector<>();
    
    @Override
    public void push(T item){
        miVector.add(item);
    }

    @Override
    public T pop(){
        return miVector.remove(stack.size() - 1);
    }

    @Override
    public T peek(){
        return miVector.get(stack.size() -1)
    }

    @Override
    public boolean isEmpty(){
        if (miVector.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}