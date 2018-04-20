//
//  check.c
//  check
//
//  Created by Shana Moore on 10/25/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
//

#include <stdio.h>

// Declare file pointers
FILE *fpIn;

// Declare function prototypes for the following:
int outputHeaders(void);

int main(void) {
    // Declare vairables with appropriate data types
    
    // Assign variables
    fpIn = NULL;
    
    // Open files
    if (!(fpIn = fopen("fiftyrandom.txt", "r"))){
        printf("account.txt could not be opened for input.");
        return(1);
    }

    // Compute transactions
    /*while(!feof(fpIn)){
        fscanf(fpIn, "%c %lf\n", &code, &amount);
        if(code == 'I'){
            initialBalance(amount, &balance, &service, &openBalance);
        }
        else if (code == 'D'){
            deposit(amount, &balance, &service, &numDeposit, &amtDeposit);
        }
        else {
            check(amount, &balance, &service, &numCheck, &amtCheck);
        }
    } */
    
    // Close files
    fclose(fpIn);
    return 0;
}

int outputHeaders(void){
    printf("Transaction    Deposit     Check     Balance\n");
    printf("-----------    -------     -----     -------\n");
    return(0);
}
