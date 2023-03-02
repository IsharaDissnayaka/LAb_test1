public class Stack {
    private int MaxSize;
    private int arra[];
    private int Top;


    public Stack(int number){
        MaxSize=number;
        arra=new int[MaxSize];
        Top=-1;
    } 


    public boolean ISFull(){
        return(Top==MaxSize-1);
    }
    public boolean IsEmpty(){
        return(Top==-1);
    }
    public void Push(int num){
        if(ISFull()){
          System.out.println("Array IS Empty");
        }else{
            arra[++Top]=num;
        }
    }

    public int Pop(){
        if(IsEmpty()){
            System.out.println("Arra is Full");
            return -99;
        }else{
            return arra[Top--];
        }
    }

    public int Peek(){
        if(IsEmpty()){
            System.out.println("Arra is Full");
            return -99;
        }else{
            return arra[Top];
        }
    }
}
