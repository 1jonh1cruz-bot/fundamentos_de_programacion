Algoritmo CalculoMulta
    Definir velocidad, limite0, limite1, resultado Como Entero
    Definir esCumpleanios Como Logico
    
    Escribir "Ingrese la velocidad:"
    Leer velocidad
    Escribir "Es tu cumpleaños? (Verdadero/Falso):"
    Leer esCumpleanios
    
    // Límites base
    limite0 <- 60
    limite1 <- 80
    
    // Si es tu cumpleaños, los límites aumentan en 5 unidades
    Si esCumpleanios Entonces
        limite0 <- limite0 + 5
        limite1 <- limite1 + 5
    FinSi
    
    // Evaluación de la multa
    Si velocidad <= limite0 Entonces
        resultado <- 0
    Sino
        Si velocidad <= limite1 Entonces
            resultado <- 1
        Sino
            resultado <- 2
        FinSi
    FinSi
    
    Escribir "Resultado de la multa: ", resultado
FinAlgoritmo