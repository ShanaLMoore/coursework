//
//  read-and-sort.c
//  read-and-sort
//
//  Created by Shana Moore on 11/3/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
/* Develop a program that accomplishes
 the solution to the following instructions:
 Read a text file that contains a series of
 50 integer numbers into an array. Your
 solution should:
 1. Read a textfile named:
 “fiftyrandom.txt”
 2. Store the numbers in an array of integer.
 3. Use a bubble sort routine to order
 (sort) the numbers from low to high.
 4. Use a loop to display the sorted numbers
 on the screen. */

//printf("%s", getcwd(NULL, 5000)); - debugging notes for file input
// man 3 command(ie fopen) = c manuals - debugging notes for file input

#include <stdio.h>
#define MAX_LEN 50

// Declare function prototypes
int outputHeaders(void);

int main(void) {
    
    // Declare file pointers
    FILE *fpInp;

    // Declare variables
    int arr[MAX_LEN], n, i, j;
    
    // Assign variables
    n = 0;
    i = 0;
    j = 0;
    
    fpInp = NULL;
    
    // Open files
    if (!(fpInp = fopen("fiftyrandom.txt", "r"))){
        perror("fiftyrandom.txt could not be opened for input.");
        return(1);
    }
    
    // Parse file into an array
    while(!feof(fpInp)){
        fscanf(fpInp, "%d\n", &n);
        arr[i++] = n;
    }

    // Display your name and a line of dashes before the listing of sorted numbers
    outputHeaders();
    
    /* Bubble sort = go thru the array and compare each adjacent item.
     if out of order switch items. repeat */

    for(j=0; j < (sizeof(arr)/sizeof(arr[0]))-1; j++){
        for(i=0; i < (sizeof(arr)/sizeof(arr[0])); i++){
            int temp = 0;

            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    
    // Display the sorted numbers on the screen
    for(i=0; i < (sizeof(arr)/sizeof(arr[0])); i++){
        printf("The value is: %d\n",arr[i]);
    }
    
    // Close files
    fclose(fpInp);
 
    return 0;
}

// Function to display headers
int outputHeaders(void){
    printf("Shana - After the bubble up sort\n");
    printf("--------------------------------\n");
    
    return(0);
}
