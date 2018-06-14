
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Alunos
 */
public class AlunoJUnitTest {

    @Test
    public void teste01() {
        Aluno luana = new Aluno();
        luana.setNome("Luana Patricia");
        assertEquals("Luana Patricia", luana.getNome());
    }

    @Test
    public void teste02() {
        Aluno francisco = new Aluno();
        francisco.setIdade(24);
        assertEquals(24, francisco.getIdade());
    }

    @Test
    public void teste03() {
        Aluno pedro = new Aluno();
        pedro.setSexo('M');
        assertEquals('M', pedro.getSexo());
    }

}
