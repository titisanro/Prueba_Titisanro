Algoritmo ps_11
	contador <- 0
	Para numero<-1 Hasta 100 Hacer
		Si numero % 2 = 0 o numero % 3 = 0 Entonces
			Imprimir numero
			contador <- contador + 1
		Fin Si
	Fin Para
	Imprimir "El total de los multiplos son: ", contador
FinAlgoritmo
