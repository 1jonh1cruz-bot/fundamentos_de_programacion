Algoritmo ParImparNeutro
    Definir numero Como Entero
    
    Escribir "Ingrese un número entero:"
    Leer numero
    
    Si numero = 0 Entonces
        Escribir "El número ", numero, " es neutro."
    Sino
        Si numero MOD 2 = 0 Entonces
            Escribir "El número ", numero, " es par."
        Sino
            Escribir "El número ", numero, " es impar."
        FinSi
    FinSi
FinAlgoritmo