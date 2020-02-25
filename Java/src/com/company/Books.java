package com.company;

import java.io.File;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Books {
    String path;
    ArrayList<Book> books;

    public Books(String path)
    {
        this.path = path;
    }

    public Books()
    {
        books = new ArrayList<Book>();
    }

    private void ReadFile()
    {
        try(FileReader reader = new FileReader("notes3.txt"))
        {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(::print);
        }
       catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String toString(){
        return "hhh";
    }
}
