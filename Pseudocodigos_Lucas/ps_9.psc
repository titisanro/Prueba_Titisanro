Algoritmo ps_9
	Escribir "Escribe un limite"
	Leer limite
	contador <- 0
	Para i<-1 Hasta limite Hacer
		Si i % 3 = 0 Entonces
			Imprimir i
			contador <- contador + 1
		FinSi
	Fin Para
	Imprimir "El total de múltiplos de 3 es: "
FinAlgoritmo
