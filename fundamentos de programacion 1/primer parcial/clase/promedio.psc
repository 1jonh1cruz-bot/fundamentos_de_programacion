Algoritmo promedio
	definir C1, C2,C3 Como Real
	escribir "ingrese la cantidad 1:"
	leer C1
	escribir "ingrese cantidad 2:"
	leer C2
	escribir "ingrese cantidad 3:"
	leer C3

	si C1 > C2 Y C1>C3  entonces 
		escribir "la cantidad 1 es mayor"
		fin si
	si C2 > C1 Y C1>C3 entonces 
		escribir "la cantidad 2 es mayor"
		fin si
		si C3 > C1 Y C3>C2 entonces 
			escribir "la cantidad 3 es mayor"
		fin si
		si C1 = C2 Entonces
			escribir"la cantidad 1 es gual a la cantidad 2"
		FinSi
		si C2=C3 Entonces
			escribir "la cantidad 2 es igual a la cantidad 3"
			
		FinSi
		si C3=C1 Entonces
			escribir "la cantidad 2 es igual a la cantidad 3"
			fin si
FinAlgoritmo

