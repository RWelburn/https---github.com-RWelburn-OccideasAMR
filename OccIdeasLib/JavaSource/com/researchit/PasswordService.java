/**
 * Version:
 *     $Id: PasswordService.java,v 1.2 2008/05/26 08:22:00 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: PasswordService.java,v $
 *     Revision 1.2  2008/05/26 08:22:00  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public final class PasswordService
{
  private static PasswordService instance;
  
  private PasswordService() {
  }
  public synchronized String encrypt(String plaintext) throws Exception {
    MessageDigest md = null;
    try {
      md = MessageDigest.getInstance("SHA"); //step 2
    }
    catch(NoSuchAlgorithmException e) {
      throw new Exception(e.getMessage());
    }
    try {
      md.update(plaintext.getBytes("UTF-8")); //step 3
    }
    catch(UnsupportedEncodingException e) {
      throw new Exception(e.getMessage());
    }
    byte raw[] = md.digest(); //step 4
    String hash = (new BASE64Encoder()).encode(raw); //step 5
    return hash; //step 6
  } 
  public static synchronized PasswordService getInstance(){ //step 1
    if(instance == null) {
      return new PasswordService();
    } else {
      return instance;
    }
  }
}

