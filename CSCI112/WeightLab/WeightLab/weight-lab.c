//
//  weight-lab.c
//  WeightLab
//  Instructor: Ronald Burgher Class: CSCI-112
//  Created by Shana Moore on 9/7/17.
//  Copyright © 2017 Shana Moore. All rights reserved.

/*  Compute the weight of a 200 pound person on the following planets:
 Mercury, Venus, Mars, Jupiter, Saturn, Uranus, and Neptune */


#include <stdio.h>

#define MERCURY 37.8        // conversion constant percentage
#define VENUS   90.7        // conversion constant percentage
#define MARS    37.7        // conversion constant percentage
#define JUPITER 236.0       // conversion constant percentage
#define SATURN  91.6        // conversion constant percentage
#define URANUS  88.9        // conversion constant percentage
#define NEPTUNE 112.0       // conversion constant percentage
#define PERSON_WEIGHT 200   // conversion constant in lbs


int main(void) {
    // Declare variables with appropriate data types
    FILE *fp = NULL;
    
    float mercury_weight = 0, venus_weight = 0, mars_weight = 0,
    jupiter_weight = 0, saturn_weight = 0, uranus_weight = 0,
    neptune_weight = 0;
    
    // Perform calculations and assign values to variables
    mercury_weight  = (MERCURY/100) * PERSON_WEIGHT;
    venus_weight    = (VENUS/100)   * PERSON_WEIGHT;
    mars_weight     = (MARS/100)    * PERSON_WEIGHT;
    jupiter_weight  = (JUPITER/100) * PERSON_WEIGHT;
    saturn_weight   = (SATURN/100)  * PERSON_WEIGHT;
    uranus_weight   = (URANUS/100)  * PERSON_WEIGHT;
    neptune_weight  = (NEPTUNE/100) * PERSON_WEIGHT;
    
    // Open file
    fp = fopen("csis.txt", "w");
    
    /* Display output (weight in lbs) listed by planet and
     output to file */
    printf("%7s: %5.1f \n", "Mercury", mercury_weight);
    fprintf(fp, "%7s: %5.1f \n", "Mercury", mercury_weight);
    
    printf("%7s: %5.1f \n", "Venus", venus_weight);
    fprintf(fp, "%7s: %5.1f \n", "Venus", venus_weight);
    
    printf("%7s: %5.1f \n", "Mars", mars_weight);
    fprintf(fp, "%7s: %5.1f \n", "Mars", mars_weight);
    
    printf("%7s: %5.1f \n", "Jupiter", jupiter_weight);
    fprintf(fp, "%7s: %5.1f \n", "Jupiter", jupiter_weight);
    
    printf("%7s: %5.1f \n", "Saturn", saturn_weight);
    fprintf(fp, "%7s: %5.1f \n", "Saturn", saturn_weight);
    
    printf("%7s: %5.1f \n", "Uranus", uranus_weight);
    fprintf(fp, "%7s: %5.1f \n", "Uranus", uranus_weight);
    
    printf("%7s: %5.1f \n", "Neptune", neptune_weight);
    fprintf(fp, "%7s: %5.1f \n", "Neptune", neptune_weight);
    
    //Close file
    fclose(fp);
    return 0;
}
