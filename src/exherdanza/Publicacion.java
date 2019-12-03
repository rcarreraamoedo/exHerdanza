
package exherdanza;

public class Publicacion {
    private int numPaxinas;
    private float prezo;

    public Publicacion() {
    }
    
    public Publicacion(int numPaxinas, float prezo) {
        this.numPaxinas = numPaxinas;
        this.prezo = prezo;
    }

    public int getNumPaxinas() {
        return numPaxinas;
    }

    public void setNumPaxinas(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return  "numPaxinas=" + numPaxinas + ", prezo=" + prezo;
    }
    
    
}
