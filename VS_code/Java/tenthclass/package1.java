package VS_code.Java.tenthclass;
class Account{
    public String name;
    protected String email;
    String college;
    private String password;
    //getter and setter
    public String getPassword(){
    
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class package1 {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="My self";
        account1.email="agnik18@gmail.com";
        account1.college="Brainware";
        //account1.password="agh@er"    You can't access private things...
        account1.setPassword("avhk");
        System.out.println(account1.getPassword());
    }
    
}
