package com.ciphertext.implementation;

import com.ciphertext.decrypt.Decryptor;
import com.ciphertext.encrypt.Encryptor;
import com.ciphertext.input.StringIO;
import com.ciphertext.interfaces.CipherInterface;

public class CipherTextImplementation {

	public static void main(String[] args) {
		System.out.println("Cipher Texts");
		while (true) {
			StringIO input = new StringIO();
			input.getUserInput();
			CipherInterface encryptdecrypt;
			if (input.isEncrypt()) {
				encryptdecrypt = new Encryptor(input);
				encryptdecrypt.constructMatrix();
				encryptdecrypt.getResultFromMatrix();
				System.out.println("Encrypted String is: "
						+ encryptdecrypt.getInput().getOutput());

			} else if (input.isDecrypt()) {
				encryptdecrypt = new Decryptor(input);
				encryptdecrypt.constructMatrix();
				encryptdecrypt.getResultFromMatrix();
				System.out.println("Decrypted String is: "
						+ encryptdecrypt.getInput().getOutput());
			}
		}

	}

}
