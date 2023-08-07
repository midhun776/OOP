class student{
    private String name="Midhun";
    public int rollno;

    public void print(){
        System.out.println("Roll No "+rollno+" is "+name);
    }
}

public class abstraction {
    public static void main(String args[]){
        student obj = new student();

        obj.rollno = 5;
        //This object can't access private variables
        //System.out.println(obj.name);

        obj.print();
    }
}
