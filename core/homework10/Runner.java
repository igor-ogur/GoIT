package core.homework10;

public class Runner {
    public static void main(String[] args) {
        InputOutputMessenger messenger = new InputOutputMessenger();
        messenger.readMessageFromFileEncryptAndWriteToAnotherFile("original.txt", "encryptedFile.txt");
        messenger.readMessageFromFileDecryptAndWriteToAnotherFile("encryptedFile.txt", "decryptedFile.txt");
    }
}
