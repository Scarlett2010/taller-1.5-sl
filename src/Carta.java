public class Carta{
    private String nombre;
     public Carta(String tipo_juego){
         this.nombre = nombre;
     }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugar(){
         System.out.println("------Bienvenido------");
         System.out.println("El juego empieza");
     }
     public void descripcion(){
         System.out.println("Este es un juego basado en ingresar el numero de una carta y ver si esta tiene poder o no");
     }
}