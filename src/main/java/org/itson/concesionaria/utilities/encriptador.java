package org.itson.concesionaria.utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class encriptador {

    private static final String clave = "EstaEsMiClaveSecreta";
    private static final String algoritmo = "AES/ECB/PKCS5Padding";

    public static String encriptar(String texto) throws Exception {
        SecretKeySpec key = new SecretKeySpec(clave.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance(algoritmo);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] textoEncriptado = cipher.doFinal(texto.getBytes());
            return Base64.getEncoder().encodeToString(textoEncriptado);
    }

    public static String desencriptar(String textoEncriptado) throws Exception {
        SecretKeySpec key = new SecretKeySpec(clave.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance(algoritmo);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] textoDesencriptado = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
        return new String(textoDesencriptado);
    }

}
