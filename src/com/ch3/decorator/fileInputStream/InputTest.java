package com.ch3.decorator.fileInputStream;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            //System.out.println(System.getProperty("user.dir")); make sure about the path
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/com/ch3/decorator/fileInputStream/test.txt")));
            while ((c = in.read()) >= 0)
                System.out.print((char)c);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
