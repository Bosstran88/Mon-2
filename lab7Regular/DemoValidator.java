package lab7Regular;

public class DemoValidator {
    public static void main(String[] args) {
        Validator simpleEmail = new Validator("\\w+@\\w+(\\.\\w+)+");
        System.out.println(simpleEmail.validate("abc@cde.com"));
        System.out.println(simpleEmail.validate("abcde.com"));
    }
}
