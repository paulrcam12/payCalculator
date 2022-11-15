package com.paulrcam.infrastructure;

import java.io.*;

public class HandlingFiles {

    protected String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                // resultStringBuilder.append(line).append("\n");
                 resultStringBuilder.append(line);

            }
        }
        return resultStringBuilder.toString();
    }
}
