/*
 * Copyright(C) 2016 thuebannhadat.com.vn. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * thuebannhadat.com.vn. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license
 * agreement you entered into with thuebannhadat.com.vn.
 */
package realestate.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.codec.binary.Base64;

import realestate.constants.ValueConstants;

/**
 * @author : DUNGPT
 * @PG_ID : RSAUtils
 * @createDate : 03.08.2016
 */
public class RSAUtils {

  /** The Constant LOGGER. */
  private static final Logger LOGGER = Logger.getLogger(RSAUtils.class);

  /**
   * Encrypt the plain text using public key.
   *
   * @param text the text
   * @return the byte[]
   */
  public static String encrypt(String text) {

    byte[] cipherText = null;

    try {
      // get an RSA cipher object and print the provider
      Cipher cipher = Cipher.getInstance(ValueConstants.CONST_RSA_ALGORITHM);

      // Encrypt the string using the public key
      ObjectInputStream inputStream = new ObjectInputStream(
          RSAUtils.class.getResourceAsStream(ValueConstants.CONST_PUBLIC_KEY));
      PublicKey publicKey = (PublicKey) inputStream.readObject();

      // encrypt the plain text using the public key
      cipher.init(Cipher.ENCRYPT_MODE, publicKey);

      cipherText = cipher.doFinal(text.getBytes());
    } catch (NoSuchAlgorithmException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    } catch (NoSuchPaddingException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    } catch (IOException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    } catch (ClassNotFoundException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    } catch (InvalidKeyException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    } catch (IllegalBlockSizeException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    } catch (BadPaddingException e) {
      LOGGER.error("#RSAUtils encrypt: " + e);
    }

    return Base64.encodeBase64String(cipherText);
  }

  /**
   * Decrypt text using private key.
   *
   * @param text the text
   * @return the string
   */
  public static String decrypt(String text) {

    byte[] dectyptedText = null;

    String result = null;
    try {
      // get an RSA cipher object and print the provider
      Cipher cipher = Cipher.getInstance(ValueConstants.CONST_RSA_ALGORITHM);

      // Decrypt the cipher text using the private key.
      ObjectInputStream inputStream = new ObjectInputStream(
          RSAUtils.class.getResourceAsStream(ValueConstants.CONST_PRIVATE_KEY));
      PrivateKey privateKey = (PrivateKey) inputStream.readObject();

      // decrypt the text using the private key
      cipher.init(Cipher.DECRYPT_MODE, privateKey);
      dectyptedText = cipher.doFinal(Base64.decodeBase64(text));

    } catch (NoSuchAlgorithmException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    } catch (NoSuchPaddingException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    } catch (IOException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    } catch (ClassNotFoundException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    } catch (InvalidKeyException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    } catch (IllegalBlockSizeException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    } catch (BadPaddingException e) {
      LOGGER.error("#RSAUtils decrypt: " + e);
    }

    if (dectyptedText != null) {
      result = new String(dectyptedText);
    }

    return result;
  }
}
