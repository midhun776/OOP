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
    public void printName(student obj){
        System.out.println(obj.getName());
    }
}

public class msgPassing1 {
    public static void main(String args[]){
        student obj = new student("Midhun", 5);
        Mvoc obji = new Mvoc();
        obji.printName(obj);
    }
}
