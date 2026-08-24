Algoritmo GananciaVinicultores
    Definir tipo Como Cadena
    Definir tamano Como Entero
    Definir precioInicial, kilos, precioFinal, gananciaTotal Como Real
    
    Escribir "Ingrese el tipo de uva (A o B):"
    Leer tipo
    Escribir "Ingrese el tamaño de la uva (1 o 2):"
    Leer tamano
    Escribir "Ingrese el precio inicial por kilo:"
    Leer precioInicial
    Escribir "Ingrese la cantidad de kilos entregados:"
    Leer kilos
    
    // Convertir el tipo a mayúscula para evitar problemas de entrada
    tipo <- Mayusculas(tipo)
    
    Si tipo = "A" Entonces
        Si tamano = 1 Entonces
            precioFinal <- precioInicial + 0.20
        Sino
            Si tamano = 2 Entonces
                precioFinal <- precioInicial + 0.30
            Sino
                Escribir "Tamaño no válido"
            FinSi
        FinSi
    Sino
        Si tipo = "B" Entonces
            Si tamano = 1 Entonces
                precioFinal <- precioInicial - 0.30
            Sino
                Si tamano = 2 Entonces
                    precioFinal <- precioInicial - 0.50
                Sino
                    Escribir "Tamaño no válido"
                FinSi
            FinSi
        Sino
            Escribir "Tipo no válido"
        FinSi
    FinSi
    
    gananciaTotal <- precioFinal * kilos
    
    Escribir "El precio final por kilo es: $", precioFinal
    Escribir "La ganancia total obtenida es: $", gananciaTotal
FinAlgoritmo
