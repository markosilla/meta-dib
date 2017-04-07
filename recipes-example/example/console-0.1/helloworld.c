#include <stdio.h>
#include <time.h>

int main(int argc, char **argv)
{
    printf("Hello World!____\n");
    time_t t;
    time(&t);
    printf("\n current time is : %s",ctime(&t));
    return 0;
}
