package Ciphers;

public interface Cipher {

    String encode(String TextToEncode);
    String decode(String TextToDecode);
}
