#include <stdio.h>
#include <stdlib.h>
/*Dado un arreglo de enteros llamado nums y un entero llamado target, 
retorna los índices de los dos números tales que sumen el valor de target. 
Cada arreglo deberá tener exactamente una solución, 
no se puede usar un elemento dos veces. 
La solución se puede entregar en cualquier orden. */

void mostrarArreglo(int *nums, int tam){
    printf("nums[");
    for(int i=0; i<tam;i++){
        if(i==tam-1){
            printf("%d]\n",nums[i]);
            break;
        }
        printf("%d,",nums[i]);
    }
}

void darTam(int *tam){
    printf("Introduce el tamaño del arreglo: ");
    scanf("%d", &*tam); 
}

void llenarArreglo(int *arreglo,int n){
   for (int i = 0; i < n; i++) {
        printf("Introduce el valor nums[%d]: ", i);
        scanf("%d", &arreglo[i]);  // Llenar el arreglo con valores ingresados por el usuario
    }
}
void encontrarTarget(int target, int *arreglo,int n){
    int suma,encontrado=0;
    for(int i=0;i<n && !encontrado;i++){
        for(int j=i+1;j<n;j++){
            suma = arreglo[i] + arreglo[j]; 
            //printf("%d + %d = %d \n",arreglo[i],arreglo[j],suma);
            if(suma==target){
                printf("[%d,%d]\n",i,j);
                printf("%d + %d = %d \n",arreglo[i],arreglo[j],suma);
                encontrado=1;
                break;
            }
        }
    }
    if(!encontrado)
    printf("No se ha encontrado la suma a + b = target\n");
}


int main() {
    int target,n;
    int *nums;
    darTam(&n);
    nums = (int *)malloc(n * sizeof(int));
    //printf("%d",n);
    llenarArreglo(nums,n);
    printf("Introduce el target a buscar en el arreglo nums: ");
    scanf("%d", &target);
    mostrarArreglo(nums,n);
    encontrarTarget(target, nums,n);

    return 0;
}