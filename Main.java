class Main{
    public static void main(String[] args) {
       queue q1 = new queue(5);
       q1.insert(14);
       q1.insert(22);
       q1.insert(30);
       q1.insert(32);
       q1.insert(40);
      
       Stack s1 = new Stack(5);

       while(!(q1.ISEmpty())){
        s1.Push(q1.delete());
       }
      
       while(!(s1.IsEmpty())){
        System.out.println(s1.Pop());
       }
    }


}