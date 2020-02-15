import Ciphers.Cipher;
import Ciphers.Implementation.CesarCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CesarCipherTest {
    protected final String testWithAplhabeticLetters = "abc";
    protected final String testWithAlphanumericLetters = "abc";
    protected final String expectedText = "def";
    protected final String alphanums = "def12";
    protected final String expectedAlphanums = "abc12";

    protected Cipher CesarCipher = new CesarCipher();

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void testIfOnlyAlphabeticLettersAreEncoded(){
        String decode = CesarCipher.encode(testWithAlphanumericLetters);
        Assertions.assertEquals(expectedText, decode);
    }
    @DisplayName("Testing decoding text with aphanums")
    @Test
    public void testDecoding(){
        String encode = CesarCipher.decode(alphanums);
        Assertions.assertEquals(expectedAlphanums, encode);
    }

}
