import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void deveClonarLivro() throws CloneNotSupportedException {
        Livro livro = new Livro("978-85-0001", "Dom Casmurro", new Editora("Editora Aurora", "Rio de Janeiro"), "Portugues");

        Livro livroClone = livro.clone();
        livroClone.setIsbn("978-85-0002");
        livroClone.setTitulo("Dom Casmurro - Edicao Especial");
        livroClone.getEditora().setCidade("Sao Paulo");

        assertEquals("Livro{isbn='978-85-0001', titulo='Dom Casmurro', editora=Editora{nome='Editora Aurora', cidade='Rio de Janeiro'}, idioma='Portugues'}", livro.toString());
        assertEquals("Livro{isbn='978-85-0002', titulo='Dom Casmurro - Edicao Especial', editora=Editora{nome='Editora Aurora', cidade='Sao Paulo'}, idioma='Portugues'}", livroClone.toString());
    }

    @Test
    void deveCriarEditoraIndependenteNoClone() throws CloneNotSupportedException {
        Livro livro = new Livro("978-85-0001", "Dom Casmurro", new Editora("Editora Aurora", "Rio de Janeiro"), "Portugues");

        Livro livroClone = livro.clone();

        assertNotSame(livro, livroClone);
        assertNotSame(livro.getEditora(), livroClone.getEditora());
    }
}
