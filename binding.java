class Fruit{
    String name;
    int sweetness;

    public void setName(String name) {
        this.name = "fruit";
    };
    public void printName() {
        System.out.println(name);
    };


}

class Apple extends Fruit{
    public void setName(String name){
        this.name=name;
    }

    public void print() {
        System.out.println(name);
    };
}

public class binding {
    public static  void main(String args[]){
        Apple a1= new Apple();
        a1.setName("Orange");
        a1.print(); 

        Fruit f1= new Fruit();
        f1.setName("Grape");
        f1.printName();

        Fruit aj1= new Apple();
        aj1.setName("Lemon");
        aj1.printName();
    }
}
