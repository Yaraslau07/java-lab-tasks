package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonValidator {

    private static final Pattern LESSON_PATTERN = Pattern.compile(
            "^(MON|TUE|WED|THU|FRI)"
                    + " ([01]\\d|2[0-3]):([0-5]\\d)-([01]\\d|2[0-3]):([0-5]\\d)"
                    + " (\\d{3})"
                    + " ([A-Z][A-Za-z]+(?: [A-Za-z]+)*)$"
    );

    public static boolean isValid(String line) {
        Matcher matcher = LESSON_PATTERN.matcher(line);
        if (!matcher.matches()) {
            return false;
        }

        int startMinutes = Integer.parseInt(matcher.group(2)) * 60 + Integer.parseInt(matcher.group(3));
        int endMinutes = Integer.parseInt(matcher.group(4)) * 60 + Integer.parseInt(matcher.group(5));

        return endMinutes > startMinutes;
    }

    public static void validateFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println((isValid(line) ? "VALID   " : "INVALID ") + line);
            }
        }
    }
}
