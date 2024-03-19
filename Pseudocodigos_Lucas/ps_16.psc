Algoritmo ps_16
	Escribir "Escribe un numero: "
	Leer numero
	es_primo <- Verdadero
	Si numero <= 1 Entonces
		es_primo = Falso
	Fin Si
	Si numero > 1 Entonces
		Para divisor desde 2 hasta numero - 1 hacer
			Si numero MOD divisor = 0 Entonces
				es_primo = Falso
				Fin Si
		Fin Para
	Fin Si
	Si es_primo Entonces
		Escribir "El número ", numero, " es primo."
	Sino
		Escribir "El número ", numero, " no es primo."
	Fin Si
FinAlgoritmo
