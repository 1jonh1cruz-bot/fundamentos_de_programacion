Algoritmo ej_3
	Definir Op Como Entero
	Definir area, R, n1, n2 Como Real
	
	Escribir "Seleccione área 1:cuadrado  2:rectángulo  3:triángulo  4:círculo"
	Leer Op
	
	Si Op = 4 Entonces
		Escribir "Ingresa el radio: "
		Leer R
		area <- 3.1416 * R * R
		Escribir "El área es: ", area
	Sino
		Si Op = 1 O Op = 2 O Op = 3 Entonces
			Escribir "Ingrese base:"
			Leer n1
			Escribir "Ingrese altura:"
			Leer n2
			
			Según Op Hacer
		1:
			area <- n1 * n2
			Escribir "El área es: ", area
		2:
			area <- n1 * n2
			Escribir "El área es: ", area
		3:
			area <- (n1 * n2) / 2
			Escribir "El área es: ", area
	FinSegún
Sino
	Escribir "Inválido"
FinSi
FinSi
FinAlgoritmo