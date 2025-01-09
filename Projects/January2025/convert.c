#include <stdlib.h>
#include <stdio.h>

int main(){
    system("cls");
    int seconds, minutes, hours, days;
    int d1;
    printf("opa, passa os numeros\n");
    scanf("%d", &d1);
    // Processos 
    days = d1/86400; // aqui mostra a importancia de organizar as variaveis e os processos

    hours = ((d1 - (days*86400))/3600); // fiquei travado aqui, por conta que ele estava fazendo o processo invertido

    minutes = ((d1 - (days*86400+hours*3600))/60); // começando dos segundos, ao inves dos dias

    seconds = (d1 - (days*86400+hours*3600+minutes*60));


    printf("\nCom isso, fica %d Dias %d Horas %d Minutos %d Segundos", days, hours, minutes, seconds);


    
    return 0;

}