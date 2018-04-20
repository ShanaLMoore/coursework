//
//  string-lab.c
//  string lab
//
//  Created by Shana Moore on 11/1/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
/* 1. Create a C program that takes in the
 string “Palomar College” from the keyboard
 and stores it in a string array
 2. Use the strcpy function from the string.h
 library to copy the entry to a new string array
 3. Print the new string array on the console.
 4. Insert the word “Community” into the
 new string array
 5. Print the new string array on the console. */

#include <stdio.h>
#include <string.h>
#define MAX_LEN 50

int main(void) {
    // Declare two strings to join, plus a third that they'll go into
    char strA[MAX_LEN], *strB = " Community", strC[MAX_LEN];
    
    /* Declare an integer to determine how many characters will get inserted
    into the second string */
    int x = 7;

    // Get input from user
    printf("Enter this phrase - Palomar College\n");
    gets(strA);
    printf("You entered: %s\n", strA);

    // Copy the first x characters into strC
    strncpy(strC, strA, x);
    
    // Concatenate with the second string, strB
    strcat(strC, strB);
    
    // Concatenate with the remaining part of the first string, (strA+x)
    strcat(strC, strA+x);
    
    // Print the new string array on the console.
    printf("%s\n", strC);

    return 0;
}


