Algoritmo ps_13
	Escribir "Escribir primer numero: "
	Leer numero1
	Escribir "Escribir segundo numero: "
	Leer numero2
	contador <- 0
	contador_pares <- 0
	suma_impares <- 0
	Si numero1 < numero2 Entonces
		menor <- numero1
		mayor <- numero2
	SiNo
		menor <- numero2
		mayor <- numero1
	Fin Si
	Escribir "Números naturales entre", menor, "y", mayor
	Para i<-menor Hasta mayor Hacer
		Escribir i
		Si i %	2 = 0 Entonces
			contador_pares <- contador_pares + 1
		SiNo
			suma_impares <- suma_impares + 1
		Fin Si
	contador <- contador + 1
Fin Para
Escribir "Cantidad de números naturales:", contador
Escribir "Cantidad de números pares:", contador_pares
Escribir "Suma de números impares:", suma_impares
FinAlgoritmo
