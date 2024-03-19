Algoritmo ps_10
	sumaPares <- 0
	sumaImpares <- 0
	Para i<-1 Hasta 100 Hacer
		Imprimir i
		Si i % 2 = 0 Entonces
			sumaPares <- sumaPares + i
		SiNo
			sumaImpares <- sumaImpares + i
		Fin Si
		Escribir "La suma de los pares son: " sumaPares
		Escribir "La suma de impares son: " sumaImpares
	Fin Para
FinAlgoritmo
