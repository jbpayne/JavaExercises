package com.tts.exceptions;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("myFile");
            byte x = (byte) file.read();
            int y = x/3;
        } catch (IOException i) {

        } catch (ArithmeticException a) {

        }

        int x = 3;
        int y = 0;
        try {
            int z = x/y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Made it here.");
    }
}
