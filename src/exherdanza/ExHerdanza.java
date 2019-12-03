
package exherdanza;


public class ExHerdanza {


    public static void main(String[] args) {
        Revista sc = new Revista(49,4.3f,"fdkdk");
        System.out.println(sc.toString());
        System.out.println(sc);// == anterior
        
        Libro obx = new Libro("Pepe","ISBN","Titulo",50,4.5f,"nome");
        System.out.println(obx.toString());
    }
    
}
