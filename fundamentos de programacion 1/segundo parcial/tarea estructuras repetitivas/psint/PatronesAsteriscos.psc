Algoritmo PatronesAsteriscos
    Definir opcion, n, i, j, espacios, asteriscos Como Entero
    
    Repetir
        Escribir "--- MENU DE PATRONES ---"
        Escribir "1. Cuadrado"
        Escribir "2. Piramide Invertida"
        Escribir "3. Piramide Normal"
        Escribir "4. Salir"
        Escribir "Seleccione una opcion:"
        Leer opcion
        
        Si opcion >= 1 Y opcion <= 3 Entonces
            Repetir
                Escribir "Ingrese el numero de lineas (n > 0):"
                Leer n
            Hasta Que n > 0
            
            Segun opcion Hacer
                1:
                    Para i <- 1 Hasta n Con Paso 1 Hacer
                        Para j <- 1 Hasta n Con Paso 1 Hacer
                            Escribir Sin Saltar "* "
                        FinPara
                        Escribir ""
                    FinPara
                    
                2:
                    Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
                        espacios <- i
                        asteriscos <- 2 * (n - i) - 1
                        Para j <- 1 Hasta espacios Con Paso 1 Hacer
                            Escribir Sin Saltar " "
                        FinPara
                        Para j <- 1 Hasta asteriscos Con Paso 1 Hacer
                            Escribir Sin Saltar "*"
                        FinPara
                        Escribir ""
                    FinPara
                    
                3:
                    Para i <- 1 Hasta n Con Paso 1 Hacer
                        espacios <- n - i
                        asteriscos <- 2 * i - 1
                        Para j <- 1 Hasta espacios Con Paso 1 Hacer
                            Escribir Sin Saltar " "
                        FinPara
                        Para j <- 1 Hasta asteriscos Con Paso 1 Hacer
                            Escribir Sin Saltar "*"
                        FinPara
                        Escribir ""
                    FinPara
            FinSegun
        FinSi
        
    Hasta Que opcion = 4
    
    Escribir "Programa finalizado."
FinAlgoritmo