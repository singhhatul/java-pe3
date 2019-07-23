package com.stackroute.pe3;

import java.io.File;
import java.io.FilenameFilter;

public class FindFiles {
    public int getFileCount(String folderLocation) {
        if (folderLocation == null) {
            return 0;
        } else {
            int count = 0;
            File file = new File(folderLocation);
            File[] files = file.listFiles(new FilenameFilter() {

                @Override
                public boolean accept(File dir, String name) {
                    if (name.toLowerCase().endsWith(".txt")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            for (File f : files) {

                count++;
            }
            return count;
        }
    }
}
