package com.luv2code.springdemo;

import org.springframework.stereotype.Component;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private final ArrayList<String> fileFortunes = new ArrayList<>();
    private Random random = new Random();

    @Override
    public String getFortune() {
        writeFromFile2Array();
        int randomFortuneNumber = random.nextInt(fileFortunes.size());
        return fileFortunes.get(randomFortuneNumber);
    }

    private void writeFromFile2Array() {
        try {
            File file = new File("file.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                fileFortunes.add(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


