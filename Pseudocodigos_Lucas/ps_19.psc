Algoritmo ps_19
	Escribir "Introduce el primer n�mero: "
	Leer numero1
	Escribir "Introduce el segundo n�mero: "
	Leer numero2
	Escribir "Selecciona una operaci�n:"
	Escribir "1. Suma"
	Escribir "2. Resta"
	Escribir "3. Multiplicaci�n"
	Escribir "4. Divisi�n"
	Escribir "Elije una opci�n (1/2/3/4): "
	Leer opcion
	Segun opcion Hacer
		Caso 1:
			resultado <- numero1 + numero2
			Escribir "La suma es:", resultado
		Caso 2:
			resultado <- numero1 - numero2
			Escribir "La resta es:", resultado
		Caso 3:
			resultado <- numero1 * numero2
			Escribir "La multiplicaci�n es:", resultado
		Caso 4:
			Si numero2 <> 0 Entonces
				resultado <- numero1 / numero2
				Escribir "La divisi�n es:", resultado
			Sino
				Escribir "No se puede dividir por cero."
			Fin Si
		De Otro Modo:
			Escribir "Opci�n no v�lida."
	Fin Segun
FinAlgoritmo
