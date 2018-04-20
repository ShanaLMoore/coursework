//
//  check.c
//  check
//
//  Created by Shana Moore on 10/25/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
//
#include <unistd.h>


#include <stdio.h>

// Declare file pointers
FILE *fpIn;
FILE *fpOut;

// Declare function prototypes for the following:
int outputHeaders(void);
int initialBalance(double amount, double *balance, double *service, double *openBalance);
int deposit(double amount, double *balance, double *service, int *numDeposit, double *amtDeposit);
int check(double amount, double *balance, double *service, int *numCheck, double *amtCheck);
int outputSummary(int numDeposit, double amtDeposit, int numCheck, double amtCheck, double openBalance, double service, double closeBalance);

int main(void) {
    // Declare vairables with appropriate data types
    char code;
    double amount, service, balance;
    double amtCheck, amtDeposit, openBalance, closeBalance;
    int numCheck, numDeposit;
    
    // Assign variables
    fpIn = NULL;
    fpOut = NULL;
    
    // Open files
    if (!(fpIn = fopen("../fiftyrandom.txt", "r"))){
        printf("account.txt could not be opened for input.");
        return(1);
    }
    if (!(fpOut = fopen("csis.txt", "w"))){
        printf("csis.txt could not be opened for output");
        return(1);
    }

    printf("%s", getcwd(NULL, 5000));

    
    amount =        0.0;
    service =       0.0;
    balance =       0.0;
    amtCheck =      0.0;
    amtDeposit =    0.0;
    openBalance =   0.0;
    closeBalance =  0.0;
    numCheck =      0.0;
    numDeposit =    0.0;
    
    outputHeaders();
    
    // Compute transactions
    while(!feof(fpIn)){
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
    }
    
    closeBalance = balance - service;
    outputSummary(numDeposit, amtDeposit, numCheck, amtCheck, openBalance, service, closeBalance);
    
    // Close files
    fclose(fpIn);
    fclose(fpOut);
    return 0;
}

int outputHeaders(void){
    printf("Transaction    Deposit     Check     Balance\n");
    printf("-----------    -------     -----     -------\n");
    fprintf(fpOut, "Transaction     Deposit     Check     Balance\n");
    fprintf(fpOut, "-----------     -------     -----     -------\n");
    return(0);
}

int initialBalance(double amount, double *balance, double *service, double *openBalance){
    // Monthly service charge of $3.00 to maintain account
    (*service) += 3.00;

    // Calculate balance
    (*openBalance) = amount;
    (*balance) = *openBalance;
    
    // Display output
    printf("Initial Balance %28.2lf\n", *openBalance);
    fprintf(fpOut, "Initial Balance %28.2lf\n", *openBalance);
    
    return (0);
}

int deposit(double amount, double *balance, double *service, int *numDeposit, double *amtDeposit){
    // Service charge for each deposit made
    (*service) += 0.03;
    
    // Calculate balance
    (*amtDeposit) += amount;
    (*balance) = (*balance + amount);
    
    // Display output
    printf("Deposit %14.2lf %21.2lf\n", amount, *balance);
    fprintf(fpOut, "Deposit %14.2lf %21.2lf\n", amount, *balance);
    
    (*numDeposit) += 1;
    return (0);
}

int check(double amount, double *balance, double *service, int *numCheck, double *amtCheck){
    // Service charge for each check cashed
    (*service) += 0.06;
    
    // If overdraft, balance < 0.00, service charge $5.00
    if(*balance < 0.00){
        (*service) += 5.00;
        
        // Calculate balance
        (*amtCheck) += amount;
        (*balance) = (*balance - amount);
    }
    else {
        // Calculate balance
        (*amtCheck) += amount;
        (*balance) = (*balance - amount);
    }
    
    // Display output
    printf("Check %27.2lf %10.2lf\n", amount, *balance);
    fprintf(fpOut, "Check %27.2lf %10.2lf\n", amount, *balance);
    
    (*numCheck) += 1;
    return (0);
}

int outputSummary(int numDeposit, double amtDeposit, int numCheck, double amtCheck, double openBalance, double service, double closeBalance){
    printf("\nSummary \n---------------------------------------------\nTotal number deposits: %d\nTotal amount deposits: %.2lf\n\nTotal number checks: %d\nTotal amount checks: %.2lf\n\nTotal service charge: %.2lf\n\nOpening balance: %.2lf\nClosing balance: %.2lf\n", numDeposit, amtDeposit, numCheck, amtCheck, service, openBalance, closeBalance);
    fprintf(fpOut, "\nSummary \n---------------------------------------------\nTotal number deposits: %d\nTotal amount deposits: %.2lf\n\nTotal number checks: %d\nTotal amount checks: %.2lf\n\nTotal service charge: %.2lf\n\nOpening balance: %.2lf\nClosing balance: %.2lf\n", numDeposit, amtDeposit, numCheck, amtCheck, service, openBalance, closeBalance);
    return(0);
}
