Algoritmo PiramideNumeros
    Definir n, i, j Como Entero
    
    Repetir
        Escribir "Ingrese un numero entero positivo (n):"
        Leer n
        Si n <= 0 Entonces
            Escribir "El numero debe ser mayor a 0."
        FinSi
    Hasta Que n > 0
    
    Escribir "--- PIRAMIDE DE NUMEROS ---"
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Para j <- 1 Hasta i Con Paso 1 Hacer
            Escribir Sin Saltar j, " "
        FinPara
        Escribir ""
    FinPara
FinAlgoritmo