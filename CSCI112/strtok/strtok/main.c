//
//  main.c
//  strtok
//
//  Created by Shana Moore on 10/30/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define STACK_SIZE

void push(char stack[], char item, int *top, int max_size)

int main(void) {
    char s[STACK_SIZE];
    int s_top = -1
    
    push(s, '2', &s_top, STACK_SIZE);
    return 0;
}

void push(char stack[], char item, int *top, int max_size){
    if(*top < max_size-1){
        ++(*top);
        stack[*top] = item;
    }
}
