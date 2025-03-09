package org.kks.restaurant.services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Lazy
@Service
public class RestaurantTrainService {

    @Value("${python.run.path}")
    private String runPath;

    @Value("${python.script.path}")
    private String scriptPath;

    public void process() {
        try {
            System.out.println("머신러닝 유입1");
            ProcessBuilder builder = new ProcessBuilder(runPath, scriptPath + "/train.py");
            System.out.println(runPath);
            System.out.println(scriptPath);
            System.out.println("머신러닝 유입2");
            Process process = builder.start();
            System.out.println("머신러닝 유입3");
            int exitCode = process.waitFor();
            System.out.println("머신러닝 유입4");
            System.out.println(exitCode);
            InputStream err = process.getErrorStream();
            System.out.println("머신러닝 유입5");
            String errorString = new String(err.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println("머신러닝 유입6");
            if (!errorString.isEmpty()) {
                System.err.println("Python 오류 메시지: " + errorString);
            }

        } catch (Exception e) {
            System.out.println("혹시?");
        }
    }
}
