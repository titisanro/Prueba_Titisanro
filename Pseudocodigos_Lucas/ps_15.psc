Algoritmo ps_15
	Escribir "Ingrese el primer n�mero: "
	Leer numero1
	Escribir "Ingrese el segundo n�mero: "
	Leer numero2
	contador <- 0
	suma_multiplos_de_2 <- 0
	Si numero2 < numero1 Entonces
		Escribir "El segundo n�mero debe ser mayor o igual al primero."
	Sino
		Escribir "M�ltiplos de 2 entre", numero1, "y", numero2, ":"
		Para i desde numero1 hasta numero2 hacer
			Si i % 2 = 0 Entonces
				Escribir i
				contador = contador + 1
				suma_multiplos_de_2 = suma_multiplos_de_2 + i
			Fin Si
		Fin Para
	Escribir "Total de m�ltiplos de 2:", contador
	Escribir "Suma de m�ltiplos de 2:", suma_multiplos_de_2
	Fin Si
FinAlgoritmo
