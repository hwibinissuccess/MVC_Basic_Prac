package hwibin.prac.testcode_prac;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab"; // 2글자
     }
}
