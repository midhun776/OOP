class user{
    public String name;
    private String pswd;
    protected String phno;

    user(String name, String pswd, String phno){
        this.name=name;
        this.pswd=pswd;
        this.phno=phno;
    }

    public void printPswd(){
        System.out.println(pswd);
    }
}

class app extends user{

    app(String name, String pswd, String phno) {
        super(name, pswd, phno);
    }

    public void printName(){
        System.out.println(name);
    }

    //--! can't access private members of inherited class !--//

    // public void printPswd(){
    //     System.out.println(pswd);
    // }

    public void printPhno(){
        System.out.println(phno);
    }
    
}

public class inheritance {
    public static void main(String[] args) {
        app obj = new app("Dony", "IdukkiGold", "9947471467");
        
        obj.printName();
        System.out.println(obj.name);

        obj.printPhno();
        System.out.println(obj.phno);

        obj.printPswd();
        //System.out.println(obj.pswd);
    }    
}
