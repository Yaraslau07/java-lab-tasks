package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentFilterTest {

    private final List<String> students = List.of(
            "Acikgoz\tEnes\t5",
            "Aksoy\tMuhammed\t4",
            "Adem\tAdil\t5",
            "Aleksankin\tMaksym\t2",
            "Asanov\tSadyk\t3",
            "Aslan\tOmar\t5"
    );

    private Path inputFile;
    private Path outputFile;

    @BeforeEach
    public void setUp() throws IOException {
        inputFile = Files.createTempFile("students-input", ".txt");
        Files.write(inputFile, students);

        outputFile = Files.createTempFile("students-output", ".txt");

        inputFile.toFile().deleteOnExit();
        outputFile.toFile().deleteOnExit();
    }

    @Test
    public void shouldWriteOnlyStudentsWithGrade5() throws IOException {
        StudentFilter.filterStudentsWithGrade5(inputFile.toString(), outputFile.toString());

        List<String> expected = List.of(
                "Acikgoz\tEnes\t5",
                "Adem\tAdil\t5",
                "Aslan\tOmar\t5"
        );
        List<String> actual = Files.readAllLines(outputFile);

        assertEquals(expected, actual);
    }
}
