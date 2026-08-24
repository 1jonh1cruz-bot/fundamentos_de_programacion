Algoritmo ControlVentasMientras
	definir si_no como caracter 
	DEFINIR N, i COMO ENTERO
	DEFINIR cant_mayores_1000, cant_500_1000, cant_menores_500 COMO ENTERO
	DEFINIR monto_venta, total_mayores_1000, total_500_1000, total_menores_500, total_global COMO REAL
	escribir "hay ventas (escribir s/n)?:"
	leer si_no

	mientras si_no = "s"   hacer
	cant_mayores_1000 <- 0
	cant_500_1000 <- 0
	cant_menores_500 <- 0
	
	total_mayores_1000 <- 0
	total_500_1000 <- 0
	total_menores_500 <- 0
	total_global <- 0
	
	i <- 1 
	
	
	Escribir "Ingrese el número total de ventas:"
	LEER N
	
	Mientras i <= N Hacer
		Escribir "Ingrese el monto de la venta ", i, ":"
		LEER monto_venta
		
		
		Si monto_venta > 1000 Entonces
			cant_mayores_1000 <- cant_mayores_1000 + 1
			total_mayores_1000 <- total_mayores_1000 + monto_venta
		SiNo
			Si monto_venta > 500 Entonces
				cant_500_1000 <- cant_500_1000 + 1
				total_500_1000 <- total_500_1000 + monto_venta
			SiNo
				cant_menores_500 <- cant_menores_500 + 1
				total_menores_500 <- total_menores_500 + monto_venta
			FinSi
		FinSi
		
		
		total_global <- total_global + monto_venta
		
	
		i <- i + 1
	FinMientras

	Escribir "============================================"
	Escribir "           RESUMEN DE VENTAS DEL DÍA        "
	Escribir "============================================"
	Escribir "1. Ventas mayores a $1000:"
	
	Escribir "   - Cantidad de ventas: ", cant_mayores_1000
	Escribir "   - Monto acumulado: $", total_mayores_1000
	
	Escribir "2. Ventas mayores a $500 pero menores o iguales a $1000:"
	Escribir "   - Cantidad de ventas: ", cant_500_1000
	Escribir "   - Monto acumulado: $", total_500_1000
	
	Escribir "3. Ventas menores o iguales a $500:"
	Escribir "   - Cantidad de ventas: ", cant_menores_500
	Escribir "   - Monto acumulado: $", total_menores_500
	Escribir "--------------------------------------------"
	Escribir "MONTO TOTAL VENDIDO DE FORMA GLOBAL: $", total_global
fin mientras 
FinAlgoritmo