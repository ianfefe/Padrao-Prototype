public class Livro implements Cloneable {
    private String isbn;
    private String titulo;
    private Editora editora;
    private String idioma;

    public Livro(String isbn, String titulo, Editora editora, String idioma) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editora = editora;
        this.idioma = idioma;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public Livro clone() throws CloneNotSupportedException {
        Livro livroClone = (Livro) super.clone();
        livroClone.editora = (Editora) livroClone.editora.clone();
        return livroClone;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editora=" + editora +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
