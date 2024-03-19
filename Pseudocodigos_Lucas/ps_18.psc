Algoritmo ps_18
	Escribir "Introduce un número entre 0 y 10: "
	Leer numero
	Si numero >= 0 y numero <= 10 Entonces
		Escribir "Tabla de multiplicar del número", numero, ":"
		Para i desde 1 hasta 10 Hacer
			resultado <- numero * i
			Escribir numero, " x ", i, " = ", resultado
		Fin Para
	Sino
		Escribir "El número está fuera del rango permitido."
	Fin Si

FinAlgoritmo
