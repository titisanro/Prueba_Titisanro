Algoritmo ps_18
	Escribir "Introduce un n�mero entre 0 y 10: "
	Leer numero
	Si numero >= 0 y numero <= 10 Entonces
		Escribir "Tabla de multiplicar del n�mero", numero, ":"
		Para i desde 1 hasta 10 Hacer
			resultado <- numero * i
			Escribir numero, " x ", i, " = ", resultado
		Fin Para
	Sino
		Escribir "El n�mero est� fuera del rango permitido."
	Fin Si

FinAlgoritmo
