/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fhalcom.dev.desing.patterns.cripto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


//import org.apache.commons.codec.binary.Base64;

public class CryptoUtils {

    //Variables usadas para encriptar y desencriptar
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private static Cipher cipher;
    private static SecretKey key;
    private static final String UNICODE_FORMAT = "UTF8";
    private static String myEncryptionKey = ".his**SpartaThis89Spart1";
    static {
        try {
            //String myEncryptionKey = ".his**SpartaThis89Spart1";
            String myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
            byte[] arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            KeySpec ks = new DESedeKeySpec(arrayBytes);
            SecretKeyFactory skf = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme);
            key = skf.generateSecret(ks);
			System.out.println(Base64.getEncoder().encodeToString(key.getEncoded()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param string
     * @return MD5 hash - 32 chars
     */
    public static String computeHashMD5(String string) {
        try {
            return byteArrayToHexString(CryptoUtils.computeHash(string, "MD5"));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param string
     * @return SHA-256 hash - 64 chars
     */
    public static String computeHashSHA256(String string) {
        try {
            return byteArrayToHexString(CryptoUtils.computeHash(string, "SHA-256"));
        } catch (Exception e) {
            return null;
        }
    }

    private static byte[] computeHash(String x, String algorithm) throws Exception {
        MessageDigest d = null;
        d = MessageDigest.getInstance(algorithm);
        d.reset();
        d.update(x.getBytes());
        return d.digest();
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
    
    
	public static String encrypt(String unencryptedString) {
		String encryptedString = null;
		try {
			System.out.println(Base64.getDecoder().decode(Base64.getEncoder().encodeToString(key.getEncoded())));
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] encryptedText = cipher.doFinal(plainText);
			//encryptedString = new String(Base64.encodeBase64String(encryptedText));
            encryptedString = Base64.getEncoder().encodeToString(encryptedText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}

	public static String decrypt(String encryptedString) {
		String decryptedText = null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] encryptedText = Base64.getDecoder().decode(encryptedString.getBytes(UNICODE_FORMAT));
			//byte[] encryptedText = Base64.decodeBase64(encryptedString);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText = new String(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptedText;
	} 
	
	/*
    public static String symmetricEncrypt(String text, String secretKey) {
        byte[] raw;
        String encryptedString;
        SecretKeySpec skeySpec;
        byte[] encryptText = text.getBytes();
        Cipher cipher;
        try {
            raw = Base64.decodeBase64(secretKey);
            skeySpec = new SecretKeySpec(raw, "AES");
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            encryptedString = Base64.encodeBase64String(cipher.doFinal(encryptText));
        } 
        catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        return encryptedString;
    }

    public static String symmetricDecrypt(String text, String secretKey) {
        Cipher cipher;
        String encryptedString;
        byte[] encryptText = null;
        byte[] raw;
        SecretKeySpec skeySpec;
        try {
            raw = Base64.decodeBase64(secretKey);
            skeySpec = new SecretKeySpec(raw, "AES");
            encryptText = Base64.decodeBase64(text);
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            encryptedString = new String(cipher.doFinal(encryptText));
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
        return encryptedString;
    }
    */
    


}
