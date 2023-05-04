package org.kras.crypto;

public interface Encryptor {

  String encryptFile();

  static final Encryptor aesEncryptor = () -> "Applying AES";

  Encryptor rsaEncryptor = () -> "Applying RSA";

}
