package com.example.user.newpath.Helper;

import android.util.Base64;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by User on 01/06/2017.
 */

public class MD5Custom {
    public  static String codificarMd5 (String password) {
        return Base64.encodeToString(password.getBytes(), Base64.DEFAULT).replace("(\\n\\r)", "");

    }

    public static String decodificarBase64 (String passwordCodificado) {
        return new String(Base64.decode(passwordCodificado, Base64.DEFAULT));
    }

}
