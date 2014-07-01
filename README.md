Cipher-Texts
============

I plan to encrypt a text using a transposition cipher. The program can both encrypt and decrypt the messages. It will accept a string, and a choice of whether to encrypt or decrypt it. 

Transposition cipher works by changing the position of the letters in the sentence. 

The encryption aglorithm works as follows.
1. It breaks down the sentence into a square [Floor value. For 9 characters it is 3x3, for 12 it is 3x3 + 3, for 14 it is 3x3 + 5] (If there are extra characters, add them to the bottom of the square and convert them to *)
2. Once the square is built, (i.e a multidimensional array) push the characters of the sentence in row major order and insert '*' in place of an empty index.
3. Read the characters from the square in column major order to get the encrypted string.

Decryption algorithm works as follows.
1. It breaks down the sentence into a square, similarly as in case of encryption.
2. Once the square is built, (i.e a multidimensional array) push the characters of the encrypted string in column major order.
3. Read the characters from the square in row major order to get the decrypted string.

For Example:
“lets go geocaching” can be broken into :

l e t s
g o g e 
o c a c 
h i n g

The encrypted text will be lgoheocitgansecg

HRUNDOEDGEWYOD*AOIU* can be broken into :

H O W A
R E Y O
U D O I
N G D U
D E * *

The decrypted text will be HOWAREYOUDOINGDUDE

Samples:

Input : 						Output:
hiemanshu				   	hmsianenu
helloworld					hlodeor*lwl*
ardclnoio*diso*		 androidiscool

