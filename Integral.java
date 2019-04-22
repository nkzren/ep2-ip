/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2015                          **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** Renan Nakazawa    10723836                                    **/
/**                                                               **/
/*******************************************************************/

class Integral {
    /**
     * Retorna a área sob a curva definida pela função f, entre os pontos a e b,
     * pela regra dos trapézios, aproximando a curva por n trapézios.
     * 
     * O método retorna -1 caso n não seja maior ou igual a 1.
     */
    static double resolve(Funcao f, double a, double b, int n) {
	double h = (b - a) / n;
	double somatoria = 0;
	if (n < 1) {
	    return -1;
	} else {

	    /**
	     * Laço de repetição para calcular o valor da somatória da área dos trapézios
	     * entre a e b. O método valor() retorna a maior altura do trapézio i, que será
	     * utilizada o cálculo final.
	     */
	    for (int i = 1; i <= n - 1; i++) {
		double x = (i * h) + a;
		somatoria += f.valor(x);
	    }

	    /**
	     * Após o cálculo da somatória, retorna a aproximação da área conforme a fórmula
	     * fornecida.
	     */
	    return h / 2 * (f.valor(a) + f.valor(b) + 2 * somatoria);
	}
    }
}
