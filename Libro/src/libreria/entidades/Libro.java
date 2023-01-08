/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

/**
 *
 * @author crist
 */
public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NroDePaginas;

    public Libro() {

    }

    public Libro(int ISBN, String Titulo, String Autor, int NroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NroDePaginas = NroDePaginas;
    }

    public void setTitulo(String Titulo) {
        if (Titulo.length() > 0) {
            this.Titulo = Titulo;
        }
    }

    public void setAutor(String Autor) {
        if (Autor.length() > 0) {
            this.Autor = Autor;
        }
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNroDePaginas(int NroDePaginas) {
        this.NroDePaginas = NroDePaginas;
    }
    
    public String getTitulo(){
        return Titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNroDePaginas() {
        return NroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NroDePaginas=" + NroDePaginas + '}';
    }
    
    

}
