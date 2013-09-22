package evaluadorbooleano;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author isaias
 */
public class EvaluadorTest {

    Evaluador eval;

    public EvaluadorTest() {
        eval = new Evaluador();
    }

    @Test
    public void evaluarVerdadero() {
        assertTrue(eval.Evaluar(true));
    }

    @Test
    public void evaluarFalso() {
        assertFalse(eval.Evaluar(false));
    }

    @Test
    public void evaluarVerdaderoYFalso() {
        assertFalse(eval.EvaluarVerdaderoYFalso(true, false));
    }

    @Test
    public void evaluarVerdaderoOFalso() {
        assertTrue(eval.EvaluarVerdaderoOFalso(true, false));
    }
}