package com.aspose.pdf.examples;

import com.aspose.pdf.examples.AsposePdfFacades.Images.*;

import java.io.File;

public class Utils {

    public static void main(String[] args) {
        ConvertPDFPagesToDifferentImageFormats.runExamples();
        // ExtractImagesFromTheWholePDFToFiles.runExamples();
    }

    private static File dir = null;

    public static String getSharedDataDir() {
        if (dir == null) {
            dir = new File("src/main/resources/");
        }
        return dir.toString() + File.separator;
    }

    public static String getDataDir(String testID) {
        return getSharedDataDir() + testID;
    }

    public static String getOutDir(String testID) {
        return "testout/" + testID;
    }
}
