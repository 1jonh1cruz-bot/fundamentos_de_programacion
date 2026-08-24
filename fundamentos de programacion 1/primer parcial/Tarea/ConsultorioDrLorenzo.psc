Algoritmo ConsultorioDrLorenzo
    Definir numeroCita Como Entero
    Definir costoCita, costoTotal Como Real
    
    Escribir "Ingrese el número de cita del paciente:"
    Leer numeroCita
    
    Si numeroCita >= 1 Y numeroCita <= 3 Entonces
        costoCita <- 900
        costoTotal <- numeroCita * 900
    Sino
        Si numeroCita >= 4 Y numeroCita <= 5 Entonces
            costoCita <- 800
            costoTotal <- 2700 + ((numeroCita - 3) * 800)
        Sino
            Si numeroCita >= 6 Y numeroCita <= 8 Entonces
                costoCita <- 600
                costoTotal <- 4300 + ((numeroCita - 5) * 600)
            Sino
                Si numeroCita > 8 Entonces
                    costoCita <- 500
                    costoTotal <- 6100 + ((numeroCita - 8) * 500)
                Sino
                    Escribir "Número de cita no válido"
                FinSi
            FinSi
        FinSi
    FinSi
    
    Si numeroCita >= 1 Entonces
        Escribir "El costo de la cita N° ", numeroCita, " es: $", costoCita
        Escribir "El monto acumulado pagado por el tratamiento es: $", costoTotal
    FinSi
FinAlgoritmo