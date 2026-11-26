package org.example;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidationTest {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*\\.[A-Za-z]{2,}$");

    private boolean isValidEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    @Test
    public void shouldValidateEmailAddresses() {
        assertTrue(isValidEmail("test@example.com"));
        assertTrue(isValidEmail("test@stu.vistula.edu.pl"));

        assertFalse(isValidEmail("test@examplecom"));
        assertFalse(isValidEmail("test@vistula..pl"));
    }
}
