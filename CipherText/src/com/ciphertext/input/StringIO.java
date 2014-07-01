package com.ciphertext.input;

import java.util.Scanner;

public class StringIO {

	private boolean encrypt;
	private boolean decrypt;
	private String input;
	private String output;

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public boolean isEncrypt() {
		return encrypt;
	}

	public void setEncrypt(boolean encrypt) {
		this.encrypt = encrypt;
	}

	public boolean isDecrypt() {
		return decrypt;
	}

	public void setDecrypt(boolean decrypt) {
		this.decrypt = decrypt;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void getUserInput() {
		System.out.println("\n-------------------");
		System.out.println("1. Encrypt a String");
		System.out.println("2. Decrypt a String");
		System.out.println("0. Exit");
		System.out.println("Enter a value: ");

		Scanner sc = new Scanner(System.in);

		String choice = sc.nextLine();

		String inputString;
		String str;

		switch (choice) {

		case "1":
			System.out.println("Enter string to encrypt: ");
			str = sc.nextLine();
			inputString = str.replaceAll(" ", "");
			setDecrypt(false);
			setEncrypt(true);
			setInput(inputString);
			break;

		case "2":
			System.out.println("Enter string to decrypt: ");
			inputString = sc.nextLine();
			setDecrypt(true);
			setEncrypt(false);
			setInput(inputString);
			break;

		case "0":
			System.exit(0);

		default:
			System.out.println("Enter valid choice");
			setDecrypt(false);
			setEncrypt(false);
		}

	}

}
