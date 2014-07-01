Cipher-Texts
============

I plan to encrypt a text using a transposition cipher. The program can both encrypt and decrypt the messages. It will accept a string, and a choice of whether to encrypt or decrypt it. 

Transposition cipher works by changing the position of the letters in the sentence. 

The encryption aglorithm works as follows.
It breaks down the sentence into a square (Floor value. For 9 characters it is 3x3, for 12 it is 3x3 + 3, for 14 it is 3x3 + 5) (If there are blank indexes left, add * to those indexes)
Once the square is built, (i.e a multidimensional array) push the characters of the sentence in row major order and insert '*' in place of an empty index.
Read the characters from the square in column major order to get the encrypted string.


Decryption algorithm works as follows.
It breaks down the sentence into a square, similarly as in case of encryption.
Once the square is built, (i.e a multidimensional array) push the characters of the encrypted string in column major order.
Read the characters from the square in row major order to get the decrypted string.


Samples:

1. hiemanshu---------hmsianenu
 
2. helloworld--------hlodeor*lwl*
 
3. ardclnoio*diso*---androidiscool

