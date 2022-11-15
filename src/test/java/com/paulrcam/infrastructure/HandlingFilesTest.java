package com.paulrcam.infrastructure;

import com.paulrcam.operations.HandlingFiles;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;

public class HandlingFilesTest {
    @Test
    public void givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData() throws IOException {
        String expectedData = "RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00\n";

        Class<HandlingFilesTest> handlingFileTestClass = HandlingFilesTest.class;
        InputStream inputStream = handlingFileTestClass.getResourceAsStream("/inputs/rene13112022.txt");

        HandlingFiles handlingFiles= new HandlingFiles();

        String data = handlingFiles.readFromInputStream(inputStream);

        Assert.assertEquals(expectedData, data);
    }
}