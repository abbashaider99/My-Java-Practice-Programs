class continuestatement{
    public static void main(String[] args){
        int i = 0;
        while(i<10){
            
            if(i==5){
                continue;
            }
            System.out.println("Value is: " +i);
            i++;
        }
        System.out.println("Program ended and leave the value of continue");
    }
}