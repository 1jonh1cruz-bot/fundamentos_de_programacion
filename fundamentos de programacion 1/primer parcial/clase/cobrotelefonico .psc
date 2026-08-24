Algoritmo pagorecarga
	definir tiempo Como Entero
	definir costobase,pago,impuesto Como real 
	definir turno, dia Como cadena
	
	
	escribir"imgrese el tiempo de llamada(minutos):"
	leer tiempo
	escribir"que dia hizo la llamada(habil/domingo):"
	leer dia 
	Si tiempo <=5  Entonces
		costobase <- tiempo * 1.00
	SiNo
		Si tiempo>5 y tiempo<= 8 Entonces
			costobase <-(5*1.0)+((tiempo - 5) * 0.80)
		SiNo
			Si tiempo >8 y tiempo<=10 Entonces
				costobase<-(5*1.0)+(3*0.80)+((tiempo-8)*0.70)
			SiNo
				costobase<-(5*1.0)+(3*0.80)+(0.70*2)+((tiempo-10)*0.50)
				
			Fin Si
		Fin Si
	Fin Si
	Si dia = "domingo"  Entonces
		impuesto<-(costobase*3/100)
		pago<-costobase+impuesto
		escribir"el impuesto es de 3%:",impuesto
	SiNo
		escribir "ingrese el turno(matutino/vespertino):"
		leer turno
	FinSi
	
	Si dia="habil" y turno="matutino" Entonces
		impuesto<-(costobase*15/100)
		pago<-costobase+impuesto
		escribir"el impuesto es de 15%:",impuesto
		SiNo
			Si dia="habil" y turno="vespertino" Entonces
				impuesto<-(costobase*10/100)
				pago<-costobase+impuesto
				escribir"el impuesto es de 10%:",impuesto
				
			finsi
		Fin Si
		escribir"el costo base es de:",costobase
		escribir"el costo total es de:",pago
	
FinAlgoritmo
