Write a program that prompts the user (at the keyboard) for a value and searches the file numbers.text for that value, printing out the last position where the number appears in the file (the first number in the file is at position 1). If the number does not appear in the file, print out an appropriate message. Continue asking the user for values until they signal end-of-file  (in Windows one enters end-of-file at the keyboard by entering Ctl-Z, in Unix end-of-file is indicated by entering Ctl-D). The logic is the same as end-of-file on a disk file-- i.e., if your Scanner variable is named 'keyboard', you would have the loop condition 'while (keyboard.hasNextInt())'.

The name of your class should be FindLast.

For example, if the file numbers.text contains:

10
23
43
5
12
23
9
8
10
1
16
9

Here is a sample execution of the program.
User input is in bold. Your program should replicate the prompts and output:

Enter a number: 10

10 last appears in the file at position 9

Enter a number: 29

29 does not appear in the file

Enter a number: 9

9 last appears in the file at position 12

Enter a number:
