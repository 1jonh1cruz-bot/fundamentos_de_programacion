Algoritmo CobroEstacionamiento
    Definir horas Como Entero
    Definir totalPagar Como Real
    
    Escribir "Ingrese el número de horas en el estacionamiento:"
    Leer horas
    
    Si horas <= 0 Entonces
        Escribir "Número de horas no válido."
    Sino
        Si horas <= 2 Entonces
            totalPagar <- horas * 30
        Sino
            Si horas <= 5 Entonces
                totalPagar <- 60 + ((horas - 2) * 25)
            Sino
                Si horas <= 10 Entonces
                    totalPagar <- 135 + ((horas - 5) * 20)
                Sino
                    totalPagar <- 380
                FinSi
            FinSi
        FinSi
        
        Escribir "El total a cobrar por ", horas, " hora(s) es: $", totalPagar
    FinSi
FinAlgoritmo