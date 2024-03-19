Algoritmo ps_19
	Escribir "Introduce el primer número: "
	Leer numero1
	Escribir "Introduce el segundo número: "
	Leer numero2
	Escribir "Selecciona una operación:"
	Escribir "1. Suma"
	Escribir "2. Resta"
	Escribir "3. Multiplicación"
	Escribir "4. División"
	Escribir "Elije una opción (1/2/3/4): "
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
			Escribir "La multiplicación es:", resultado
		Caso 4:
			Si numero2 <> 0 Entonces
				resultado <- numero1 / numero2
				Escribir "La división es:", resultado
			Sino
				Escribir "No se puede dividir por cero."
			Fin Si
		De Otro Modo:
			Escribir "Opción no válida."
	Fin Segun
FinAlgoritmo
