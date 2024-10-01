#include <stdio.h>

int my_atoi(const char *str) {
    int result = 0;
    int sign = 1;

    // 1. Saltar espacios en blanco
    while (*str == ' ') str++;

    // 2. Manejo de signo
    if (*str == '-') {
        sign = -1;
        str++;
    } else if (*str == '+') {
        str++;
    }

    // 3. Convertir caracteres a dígitos
    while (*str >= '0' && *str <= '9') {
        result = result * 10 + (*str - '0');
        //printf("%d \n",(*str - '0'));
        str++;
    }

    // 4. Aplicar signo y devolver el resultado
    return sign * result;
}

void main() {
    char cadena[100];  // Arreglo para almacenar la cadena

    // Pedir al usuario que ingrese una cadena
    printf("Por favor, ingresa una cadena que represente un número: ");
    fgets(cadena, sizeof(cadena), stdin);  // Leer la cadena

    // Convertir la cadena a entero
    int numero = my_atoi(cadena);

    // Mostrar el resultado
    printf("El número convertido es: %d\n", numero);

}