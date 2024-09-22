#include <stdio.h>

int esPalindromo(int numero) {
    int invertido = 0, original = numero, resto;
    
    // Invertir el número
    while (numero != 0) {
        resto = numero % 10;
        invertido = invertido * 10 + resto;
        numero /= 10;
    }
    
    // Comparar el número original con el invertido
    return original == invertido;
}

void main() {
    int numero;
    
    // Entrada
    printf("Introduce un número: ");
    scanf("%d", &numero);
    
    // Verificación de si es palíndromo
    if (esPalindromo(numero)) {
        printf("El número %d es un palíndromo.\n", numero);
    } else {
        printf("El número %d no es un palíndromo.\n", numero);
    }
    
}
