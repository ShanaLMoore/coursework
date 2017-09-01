//
//  main.c
//  sample-c-program
//
//  Created by Shana Moore on 8/29/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
//

#include <stdio.h>
#define MIN 1
#define MAX 15

FILE *fp;

int main(void) {
    // insert code here...
    int i;
    fp = fopen("csis.txt", "w");
    
    printf("%10s %10s %10s, %10s, %10s\n", "Value", "Square", "Cube", "Fourth", "Fifth");
    fprintf(fp, "%10s %10s %10s, %10s, %10s\n", "Value", "Square", "Cube", "Fourth", "Fifth");
    printf("%10s %10s %10s, %10s, %10s\n", "-----", "------", "----", "------", "-----");
    fprintf(fp, "%10s %10s %10s, %10s, %10s\n", "-----", "------", "----", "------", "-----");

    for (i = MIN; i <= MAX; ++i) {
        printf("%10d %10d %10d, %10d, %10d\n", i, i*i, i*i*i, i*i*i*i, i*i*i*i*i);
        fprintf(fp, "%10d %10d %10d, %10d, %10d\n", i, i*i, i*i*i, i*i*i*i, i*i*i*i*i);
    }
    fclose(fp);
    return 0;
}
