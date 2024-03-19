Algoritmo ps_20
	Escribir "Introduce un n�mero: "
	Leer numero
	Escribir "Selecciona una operaci�n:"
	Escribir "1. Comprobar si es primo"
	Escribir "2. Calcular el factorial"
	Escribir "3. Imprimir tabla de multiplicar"
	Escribir "Elije una opci�n (1/2/3): "
	Leer opcion
	Segun opcion Hacer
		Caso 1:
			EsPrimo <- Verdadero
			Si numero <= 1 Entonces
				EsPrimo <- Falso
			Sino
				Para i desde 2 hasta numero - 1 Hacer
					Si numero MOD i = 0 Entonces
						EsPrimo <- Falso
						
					Fin Si
				Fin Para
			Fin Si
			
			Si EsPrimo Entonces
				Escribir numero, " es un n�mero primo."
			Sino
				Escribir numero, " no es un n�mero primo."
			Fin Si
		Caso 2:
			factorial <- 1
			Para i desde 1 hasta numero Hacer
				factorial <- factorial * i
			Fin Para
			Escribir "El factorial de", numero, " es:", factorial
		Caso 3:
			Escribir "Tabla de multiplicar de", numero, ":"
			Para i desde 1 hasta 10 Hacer
				resultado <- numero * i
				Escribir numero, " x ", i, " = ", resultado
			Fin Para
		De Otro Modo:
			Escribir "Opci�n no v�lida."
	Fin Segun

FinAlgoritmo
