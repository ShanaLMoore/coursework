//
//  main.c
//  Miles-to-Kilometeres Conversion Program
//
//  Created by Shana Moore on 8/24/17.
//  Copyright © 2017 Shana Moore. All rights reserved.
//

#include <stdio.h>
#define KMS_PER_MILE 1.609 /* conversion constant */

int main(void) {
    double miles,
    kms;
    
    // Get the distance in miles
    printf("Enter the distance in miles> ");
    scanf("%lf", &miles);
    
    // Convert the distance to kilometers
    kms = KMS_PER_MILE * miles;
    
    // Display the distance in kilometers
    printf("That equals %f kilometers.\n", kms);
    
    return 0;
}
