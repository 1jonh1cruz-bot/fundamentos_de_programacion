Algoritmo ej_7
	Definir sabor, tipoChocolate, respuestaNombre Como Cadena
	Definir cantidadSnacks Como Entero
	Definir precioBase, costoSnacks, costoNombre, total Como Real
	
	precioBase <- 0
	
	Escribir "--- Presupuesto de Tartas ---"
	Escribir "Ingrese el sabor de la tarta (manzana, fresa, chocolate): "
	Leer sabor
	sabor <- Minusculas(sabor)
	
	Según sabor Hacer
"manzana":
	precioBase <- 200
"fresa":
	precioBase <- 250
"chocolate":
	Escribir "¿Qué tipo de chocolate prefiere? (negro / blanco): "
	Leer tipoChocolate
	tipoChocolate <- Minusculas(tipoChocolate)
	
	Según tipoChocolate Hacer
"negro":
	precioBase <- 280
"blanco":
	precioBase <- 300
De Otro Modo:
	Escribir "Tipo de chocolate no válido."
FinSegún
De Otro Modo:
	Escribir "Sabor no válido."
FinSegún

Si precioBase > 0 Entonces
	Escribir "¿Cuántos snacks desea agregar (fresa, galleta, durazno, etc.)?: "
	Leer cantidadSnacks
	costoSnacks <- cantidadSnacks * 25
	
	Escribir "¿Desea personalizar con un nombre? (si / no): "
	Leer respuestaNombre
	respuestaNombre <- Minusculas(respuestaNombre)
	
	Según respuestaNombre Hacer
"si", "sí":
	costoNombre <- 30
"no":
	costoNombre <- 0
De Otro Modo:
	Escribir "Respuesta no válida para el nombre. Se asumirá que no."
	costoNombre <- 0
FinSegún

total <- precioBase + costoSnacks + costoNombre

Escribir ""
Escribir "--- Resumen del Presupuesto ---"
Escribir "Precio base de la tarta: $", precioBase, " pesos"
Escribir "Costo por snacks (", cantidadSnacks, "): +$", costoSnacks, " pesos"
Escribir "Personalización de nombre: +$", costoNombre, " pesos"
Escribir "---------------------------------"
Escribir "Total a pagar: $", total, " pesos"
FinSi
FinAlgoritmo