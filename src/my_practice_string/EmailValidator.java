package my_practice_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my_pract_basic.Super;

public class EmailValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN ="[a-zA-Z0-9_.]*@gmail[.]com";
//        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validate(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        String email = "example12@gmail.com";
        if (validator.validate(email)) {
            System.out.println(email + " is valid.");
        } else {
            System.out.println(email + " is invalid.");
        }
     
    }

}

