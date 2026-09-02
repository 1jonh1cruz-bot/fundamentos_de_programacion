Algoritmo ej_2
	Definir Op Como Entero
	Definir n1, n2, resultado Como Real
	
	Escribir "Seleccione operación 1:suma  2:resta   3:multiplicación  4:división"
	Leer Op
	
	Escribir "Ingrese el número 1:"
	Leer n1
	Escribir "Ingrese el número 2:"
	Leer n2
	
	Según Op Hacer
1:
	resultado <- n1 + n2
	Escribir "La suma es: ", resultado
2:
	resultado <- n1 - n2
	Escribir "La resta es: ", resultado
3:
	resultado <- n1 * n2
	Escribir "La multiplicación es: ", resultado
4:
	Si n2 <> 0 Entonces
		resultado <- n1 / n2
		Escribir "La división es: ", resultado
	Sino
		Escribir "Error: No se puede dividir entre cero."
	FinSi
De Otro Modo:
	Escribir "Operación no válida."
FinSegún
FinAlgoritmo
