class bakwas{
    final void show()
    {
        System.out.println("This is the orignal final keyword");
    }
}

class finalmethod extends bakwas{
   void show(){  //here we're tring to modify the final method here. we cannot do that.
        System.out.println("This is the updated final keyword");
    }
    public static void main(String[] args){
     bakwas obj = new bakwas();
     obj.show();
}
}