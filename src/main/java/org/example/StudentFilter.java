package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentFilter {

    private static final Pattern GRADE_5_PATTERN = Pattern.compile("\\b5\\b");

    public static void filterStudentsWithGrade5(String inputPath, String outputPath) throws IOException {
        filterStudentsWithGrade5(inputPath, outputPath, StandardCharsets.UTF_8);
    }

    public static void filterStudentsWithGrade5(String inputPath, String outputPath, Charset charset)
            throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath, charset));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, charset))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = GRADE_5_PATTERN.matcher(line);
                if (matcher.find()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}
