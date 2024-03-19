Algoritmo ps_12
	mayor <- -INFINITO
	menor <- INFINITO
	Escribir "Escribir un numero: "
	Leer numero
	Para i<-1 Hasta 5 Hacer
		Si numero > mayor Entonces
			mayor <- numero
		Fin Si
		Si numero < menor Entonces
			menor <- numero
		FinSi
	Fin Para
	Escribir "El numero mayor es: ", mayor
	Escribir "El numero menor es: ", menor
FinAlgoritmo
