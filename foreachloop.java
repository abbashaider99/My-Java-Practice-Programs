class foreachloop{
    public static void main(String[] args){
        int[] numbers = {2,4,6,8,-10,5};
        for(int number : numbers){
          System.out.println(number);
        }
        //now adding 1 in above array
        for(int number : numbers){
            int afteradd = number+1;
            System.out.println(afteradd);
        }
    }
}