package homework10;


import java.io.*;

public class InputOutputMessenger {

    public void readMessageFromFileEncryptAndWriteToAnotherFile (String inputFileName, String outputFileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))){
            String s;
            while ((s = reader.readLine()) != null){
                s = new CesarCipher().encrypt(s, 5);
                writer.write(s+"\n");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readMessageFromFileDecryptAndWriteToAnotherFile (String inputFileName, String outputFileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))){
            String s;
            while ((s = reader.readLine()) != null){
                s = new CesarCipher().decrypt(s, 5);
                writer.write(s+"\n");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
