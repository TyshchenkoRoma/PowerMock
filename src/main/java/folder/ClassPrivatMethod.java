package folder;

public class ClassPrivatMethod {

    private String privatMethod() {
        System.out.println("Calling privat method");
        return "return :  Calling privat method";
    }

    public void pst() {
        System.out.println(privatMethod());
    }

    public String pst1() {
       return "Mock private method example: " + privatMethod();
    }
}
