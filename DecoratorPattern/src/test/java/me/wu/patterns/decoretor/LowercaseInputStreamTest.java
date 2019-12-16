package me.wu.patterns.decoretor;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStreamTest {
    public static void main(String[] args) {
        try {
            int c;
            InputStream in = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c=in.read())>=0){
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
