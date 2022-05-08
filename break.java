class breakstatement{
    public static void main(String[] args){
        int i = 0;
        while(i<10){
            System.out.println("Value is: " +i);
            if(i==5){
                break;
            }
            i++;
        } 
        System.out.println("Program ended by break statement!");
    }
}