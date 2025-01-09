#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(){
    int _acum = 0;
    int _numb;
    char _Operando;
    int mds = 0;
    
while (mds == 0)
{
    



    printf("Pls, insert a number and a operator\nIf you want stop, in the operator, enter N\n");
    
    scanf("%d %c", &_numb, &_Operando);
    
    switch (_Operando)
    {
    case '+':
        _acum = _numb + _acum;
        printf("%d\n", _acum);
        break;
        

    case '-':
        _acum = _acum - _numb;
        printf("%d\n", _acum);
        break;

     case '*':
        _acum = _numb * _acum;
        printf("%d\n", _acum);
        break;

     case '/':
        _acum = _acum / _numb;
        printf("%d\n", _acum);
        break;
     case 'n':
        mds = mds + 1;
        printf("thanks for use the calculator");
        break;
        
    
    default:
    printf("this is not a valid valuable\n");
        break;
    }
    exit(0);
 }
}

