public class queue {
    
    private int MaxSaize;
    private int Rear;
    private int Front;
    private int arra[];
    private int nitem;

    public queue(int size){
      MaxSaize=size;
      arra= new int[MaxSaize];
      Rear =-1;
      Front=0;
      nitem=0;
    }

    public boolean ISEmpty(){
        return(nitem==0);
    }

    public boolean ISFull(){
        return(Rear==MaxSaize-1);
    }

    public void insert(int number){
        if(!(nitem==MaxSaize)){
            if(Rear==MaxSaize){
                Rear = -1;
            }
            arra[++Rear]=number;
            nitem++;
        }else{
            System.out.println("Arra is Full");
        }
    }


    public int  delete(){
          if(nitem==0){
            System.out.println("arra IS Empty");
            return -99;
        }else{
               nitem--;
               int temp =arra[Front++];
               if(Front==MaxSaize)
                  {
                    Front=0;
                  }
               return temp;
            }
    }
    public int peek(){
        if(ISEmpty()){
            System.out.println("arra IS Empty");
            return -99;
        } else{
               int temp =arra[Front];
               if(Front==MaxSaize-1){
                Front=0;
               }
               return temp;
            }
    }
}
