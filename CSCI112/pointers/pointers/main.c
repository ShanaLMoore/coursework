//
//  main.c
//  pointers
//
//  Created by Shana Moore on 10/11/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
//

#include <stdio.h>
void
do_something(int *thisp, int that){
    int the_other;
    
    the_other = 5;
    that = 2 + the_other;
    *thisp = the_other * that;
}

int main(void) {
    int first, second;
    
    first = 1;
    second = 2;
    do_something(&second, first);
    printf("%4d%4d]n", first, second);
    
    return 0;
}

