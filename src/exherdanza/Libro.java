/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exherdanza;

/**
 *
 * @author rcarreraamoedo
 */
public class Libro extends Revista {
    private String autor;
    private String ISBN;
    private String titulo;

    public Libro() {
        super();
    }

    public Libro(String autor, String ISBN, String titulo, int paxinas, float prezo, String nome) {
        super(paxinas, prezo, nome);
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString()+", autor=" + autor + ", ISBN=" + ISBN + ", titulo=" + titulo;
    }
    
    
}
