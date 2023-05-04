package org.kras.crypto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    @Test
    void givenFileAndStrategies_whenChooseStrategy_thenCorrectEncryptorApplies(){
        File file = new File("test.pdf");
        Encryptor aesEncryptor = new AESEncryptor();
        file.encrypt(aesEncryptor);
        Encryptor rsaEncryptor = new RSAEncryptor();
        file.encrypt(rsaEncryptor);

        file.encrypt(Encryptor.rsaEncryptor);
        file.encrypt(Encryptor.aesEncryptor);

    }

}