abstract class dada {
    abstract void show(); // this can be abstract or not...if this is abstract then class must be abstract
}

class papa extends dada {
    @Override
    void show() {
        System.out.println("This is show class of dada");
    }
}

class abstractclass {
    public static void main(String[] args) {
        papa pa = new papa();
        pa.show();
    }
}