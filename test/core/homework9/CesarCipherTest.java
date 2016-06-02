package core.homework9;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class CesarCipherTest {
    static CesarCipher cesarCipher;
    @BeforeClass
    public static void setUpClass() throws Exception {
        cesarCipher = new CesarCipher();
    }

    @Test
    public void testEncrypt() throws Exception {
        String originalText = "abs3";
        String expectedResult = "dev6";
        Assert.assertEquals(expectedResult, cesarCipher.encrypt(originalText, 3));
    }

    @Test
    public void testDecrypt() throws Exception {
        String originalText = "dev6";
        String expectedResult = "abs3";
        Assert.assertEquals(expectedResult, cesarCipher.decrypt(originalText, 3));
    }
}