Algoritmo ahorroalaño 
	definir mes como entero
	definir deposito,ahorrototal como real
	ahorrototal<-0
	Para mes<-1 Hasta 12 Hacer
		escribir "ingresa la cantidad depositada en el mes:",mes
		leer deposito
		ahorrototal<- ahorrototal+deposito
		escribir "lleva ahorrado hasta el mes",mes,":$", ahorrototal
	Fin Para
FinAlgoritmo
