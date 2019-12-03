
package exherdanza;


public class Revista extends Publicacion{
    private String nome;
    
    public Revista(){
        super();
    }
    public Revista(int paxinas, float prezo, String nome){
        super(paxinas,prezo);
        this.nome = nome;
    
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString()+", nome=" + nome;
    }
    
    
  
}
