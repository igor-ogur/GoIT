package core.homework10;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

/**
 * Created by SKLAD-PC on 15.04.16.
 */
public class InputOutputMessengerTest {
    static CesarCipher cesarCipher;
    static InputOutputMessenger inputOutputMessenger;
    static File inputFile;
    static File outputFile;

    @BeforeClass
    public static void setUpClass() throws Exception {
        cesarCipher = new CesarCipher();
        inputOutputMessenger = new InputOutputMessenger();
        inputFile = new File("input.txt");
        outputFile = new File("output.txt");
    }

    @Test
    public void readMessageFromFileEncryptAndWriteToAnotherFile() throws Exception {
        String originalText = "Hello, JUnit!";
        String expectedResult = cesarCipher.encrypt(originalText, 5);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFile));
        bufferedWriter.write(originalText);
        bufferedWriter.close();
        inputOutputMessenger.readMessageFromFileEncryptAndWriteToAnotherFile(inputFile.getName(), outputFile.getName());
        BufferedReader bufferedReader = new BufferedReader(new FileReader(outputFile));
        String actualResult = bufferedReader.readLine();
        Assert.assertEquals(expectedResult, actualResult);
        bufferedReader.close();
    }

    @Test
    public void readMessageFromFileDecryptAndWriteToAnotherFile() throws Exception {
        String originalEncryptedText = "Mjqqt-'OZsny=";
        String expectedResult = cesarCipher.decrypt(originalEncryptedText, 5);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFile));
        bufferedWriter.write(originalEncryptedText);
        bufferedWriter.close();
        inputOutputMessenger.readMessageFromFileDecryptAndWriteToAnotherFile("input.txt", "output.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(outputFile));
        String actualResult = bufferedReader.readLine();
        Assert.assertEquals(expectedResult, actualResult);
        bufferedReader.close();
    }
}