Algoritmo ps_17
	Escribir 'Introduce un número menor de 1000: '
	Leer numero
	Si numero>=1 Y numero<1000 Entonces
		numeroRomano <- ''
		Mientras numero>=1000 Hacer
			numeroRomano <- numeroRomano+'M'
			numero <- numero-1000
		FinMientras
		Si numero>=900 Entonces
			numeroRomano <- numeroRomano+'CM'
			numero <- numero-900
		FinSi
		Si numero>=500 Entonces
			numeroRomano <- numeroRomano+'D'
			numero <- numero-500
		FinSi
		Si numero>=400 Entonces
			numeroRomano <- numeroRomano+'CD'
			numero <- numero-400
		FinSi
		Mientras numero>=100 Hacer
			numeroRomano <- numeroRomano+'C'
			numero <- numero-100
		FinMientras
		Si numero>=90 Entonces
			numeroRomano <- numeroRomano+'XC'
			numero <- numero-90
		FinSi
		Si numero>=50 Entonces
			numeroRomano <- numeroRomano+'L'
			numero <- numero-50
		FinSi
		Si numero>=40 Entonces
			numeroRomano <- numeroRomano+'XL'
			numero <- numero-40
		FinSi
		Mientras numero>=10 Hacer
			numeroRomano <- numeroRomano+'X'
			numero <- numero-10
		FinMientras
		Si numero>=9 Entonces
			numeroRomano <- numeroRomano+'IX'
			numero <- numero-9
		FinSi
		Si numero>=5 Entonces
			numeroRomano <- numeroRomano+'V'
			numero <- numero-5
		FinSi
		Si numero>=4 Entonces
			numeroRomano <- numeroRomano+'IV'
			numero <- numero-4
		FinSi
		Mientras numero>0 Hacer
			numeroRomano <- numeroRomano+'I'
			numero <- numero-1
		FinMientras
		Escribir 'El número romano es:', numeroRomano
	SiNo
		Escribir 'El número está fuera del rango válido.'
	FinSi
FinAlgoritmo
