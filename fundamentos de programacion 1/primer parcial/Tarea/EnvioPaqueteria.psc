Algoritmo EnvioPaqueteria
    Definir zona Como Entero
    Definir pesoKilos, pesoGramos, costoGramo, costoTotal Como Real
    
    Escribir "Ingrese el peso del paquete en kilos (kg):"
    Leer pesoKilos
    
    // Regla de negocio: Paquetes superiores a 5 kg son rechazados
    Si pesoKilos > 5 O pesoKilos <= 0 Entonces
        Escribir "El paquete no puede ser transportado por exceder el límite de 5 kg o por peso no válido."
    Sino
        Escribir "Seleccione la zona de destino (1 a 5):"
        Escribir "1 - América del Norte ($11/g)"
        Escribir "2 - América Central ($10/g)"
        Escribir "3 - América del Sur ($12/g)"
        Escribir "4 - Europa ($25/g)"
        Escribir "5 - Asia ($30/g)"
        Leer zona
        
        pesoGramos <- pesoKilos * 1000
        
        Según zona Hacer
	1:
		costoGramo <- 11
	2:
		costoGramo <- 10
	3:
		costoGramo <- 12
	4:
		costoGramo <- 25
	5:
		costoGramo <- 30
	De Otro Modo:
		costoGramo <- 0
		Escribir "Zona no válida."
FinSegún

Si costoGramo > 0 Entonces
	costoTotal <- pesoGramos * costoGramo
	Escribir "El cobro total por la entrega es: $", costoTotal
FinSi
FinSi
FinAlgoritmo