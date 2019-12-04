
package exherdanza;


public class ExHerdanza {


    public static void main(String[] args) {
        Revista sc = new Revista(49,4.3f,"fdkdk");
        System.out.println(sc.toString());
        System.out.println(sc);// == anterior
        
        Libro obx = new Libro("Pepe,","1234","tut",7854,83.6f);
        System.out.println(obx.toString());
        
        //Polimorfismo da subclase Libro a Pulicacion
        Publicacion lib = new Libro ("bbb","1111","titulo",200,3.5f);
        System.out.println(lib.toString());
        
        //Polimorfismo da subclase Revista a Publicacion
        Publicacion revis = new Revista(750,15.5f,"revista");
        System.out.println(revis.toString());
        
        //Outro método de polimorfismo
        Publicacion lib2 = new Libro();
        Publicacion revis2 = new Revista();
        lib2.amosar();
        revis2.amosar();
    }
    
}
