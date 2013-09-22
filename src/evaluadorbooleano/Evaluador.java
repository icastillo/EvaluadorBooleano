package evaluadorbooleano;

/**
 *
 * @author isaias
 */
public class Evaluador {

    public boolean Evaluar(boolean valor) {
        return valor ? true : false;
    }

    public boolean EvaluarVerdaderoYFalso(boolean valor1, boolean valor2) {

        return (valor1 && !valor2) ? false : true;
    }

    public boolean EvaluarVerdaderoOFalso(boolean valor1, boolean valor2) {

        return (valor1 || !valor2) ? true : false;
    }
}
