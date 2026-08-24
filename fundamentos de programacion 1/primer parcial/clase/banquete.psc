Algoritmo pagoporpersonas
	Definir np, costo Como Entero
	escribir "ingrese el numero de personas:"
	leer np
	Si np<200  Entonces
		costo<- np*95
		escribir "el costo por platillo es de 95 y el total es:", costo
	SiNo
		Si np>=200 y np <300 Entonces
			costo<- np*85
			escribir"el costo por platillo es de 85 y el total es:", costo
		SiNo
			Si np>=300 Entonces
			costo<- np*75
		escribir"el costo por persona es de 75 y el costo total es:",costo
			Fin Si
			
		Fin Si
	
	Fin Si
FinAlgoritmo
