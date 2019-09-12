package com.tts.lambdas;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;

import static org.junit.Assert.*;

public class FileFilterTests {
    private String dir = "src/test/java/com/tts";

    @Test
    public void listAllFiles() {
        File root = new File(dir);
        for (File f : root.listFiles())
            System.out.println(f);
    }

    @Test
    public void listOnlyJavaFiles() {
        File root = new File(dir);
        for (File f : root.listFiles(new FileFilter() {
            @Override
            public boolean accept (File pathname){
                return pathname.getName().endsWith(".java");
            }
        })) {
            System.out.println(f);
        }
    }

    @Test
    public void listOnlyJavaFilesUsingLambda() {
        File root = new File(dir);
        for (File f : root.listFiles(pathname -> pathname.getName().endsWith(".java"))) {
            System.out.println(f);
        }
    }

    @Test
    public void listAllFilesUsingLambda() {
        File root = new File(dir);
        for (File f : root.listFiles(pathname -> true)) {
            System.out.println(f);
        }
    }

    @Test
    public void listDirectoriesUsingLambda() {
        File root = new File(dir);
        for (File f : root.listFiles(pathname -> pathname.isDirectory())) {
            System.out.println(f);
        }
    }

    @Test
    public void listDirectoriesUsingMethodReference() {
        File root = new File(dir);
        for (File f : root.listFiles(File::isDirectory)) {
            System.out.println(f);
        }
    }
}