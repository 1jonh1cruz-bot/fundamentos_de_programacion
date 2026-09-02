Algoritmo ej_6
	Definir opcionSabor, tipoChocolate, cantidadSnacks, opcionNombre Como Entero
	Definir precioBase, costoSnacks, costoNombre, total Como Real
	
	precioBase <- 0
	
	Escribir "Seleccione el sabor (1: Manzana | 2: Fresa | 3: Chocolate): "
	Leer opcionSabor
	
	Según opcionSabor Hacer
1:
	precioBase <- 200
2:
	precioBase <- 250
3:
	Escribir "Seleccione tipo de chocolate (1: Negro $280 | 2: Blanco $300): "
	Leer tipoChocolate
	Según tipoChocolate Hacer
1:
	precioBase <- 280
2:
	precioBase <- 300
De Otro Modo:
	Escribir "Tipo de chocolate no válido."
FinSegún
De Otro Modo:
	Escribir "Sabor no válido."
FinSegún

Si precioBase > 0 Entonces
	Escribir "¿Cuántos snacks desea agregar?: "
	Leer cantidadSnacks
	costoSnacks <- cantidadSnacks * 25
	
	Escribir "¿Desea personalizar con un nombre? (1: Sí / 2: No): "
	Leer opcionNombre
	
	Según opcionNombre Hacer
1:
	costoNombre <- 30
2:
	costoNombre <- 0
De Otro Modo:
	costoNombre <- 0
FinSegún

total <- precioBase + costoSnacks + costoNombre

Escribir ""
Escribir "--- Presupuesto ---"
Escribir "Precio base: $", precioBase
Escribir "Snacks: +$", costoSnacks
Escribir "Nombre: +$", costoNombre
Escribir "Total a pagar: $", total, " pesos"
FinSi
FinAlgoritmo