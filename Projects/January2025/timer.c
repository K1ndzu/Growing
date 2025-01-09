#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <conio.h>

int hour = 0; minute = 0; second = 0; flag =0;
int printdata(){
    
    system("cls");
    printf("******************\n");
    printf("%d:%d:%d\n", hour, minute, second);
    printf("******************");
    
}

int select(){
    switch (getch())
    {
    case 49:
        flag = 0;
        break;
    case 50:
        flag = 1;
        break;
    case 51:
        hour = minute = second = 0;
        flag = 1;
        printdata();
        break;
    case 52:
        exit(0);
        break;
    }
    
}

void delay(ms){
    clock_t timeDelay = ms + clock();
    while(timeDelay>clock());
    
}

int counter(){
    while (!kbhit() && flag == 0)
    {
        if (minute > 59){
            minute = 0;
            hour++;
        }
        if (second > 59){
            second = 0;
            minute++;
        }
        printdata();
        delay(1000);
        second++;
    
        }
        select();
        
    }
    
    




int main(){
while(1) {
counter();
}
return 0;
}
