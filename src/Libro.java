

/**
 *
 * @author ASUS
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    

    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
       
    }

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   

    
    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                
                '}';
    }
}