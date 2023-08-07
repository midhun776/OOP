class student{
    String name;
    int rollno;

    student(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollno;
    }
}

class Mvoc{
    public void printName(){
        student obj = new student("Kiran", 4);
        System.out.println(obj.getName());
    }
}

public class msgPassing2 {
    public static void main(String args[]){
        Mvoc obji = new Mvoc();
        obji.printName();
    }
}
