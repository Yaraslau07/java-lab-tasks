package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final String ASSETS = "src/assets/";

    public static void main(String[] args) throws IOException {
        StudentFilter.filterStudentsWithGrade5(
                ASSETS + "studentsEN.txt", ASSETS + "studentsWithGrade5.txt", StandardCharsets.UTF_16);
        LessonValidator.validateFile(ASSETS + "lessons.txt");
    }
}
