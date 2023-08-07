class student implements Handler{
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

interface Handler{
    public String getName();
}

class Mvoc{
    public void printName(Handler obj){
        System.out.println(obj.getName());
        
        //The method getRollNo() is undefined for the type Handler, so won't work
        //System.out.println(obj.getRollNo());
    }
}

public class msgPassing3 {
    public static void main(String args[]){
        student obj = new student("Alvin", 21);
        Mvoc obji = new Mvoc();
        obji.printName(obj);
    }
}
