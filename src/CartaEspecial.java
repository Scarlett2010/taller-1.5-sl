public class CartaEspecial extends CartaNumerica{

    public CartaEspecial(String nombre, int numero, boolean b){
        super(nombre, numero);
    }
    public void activarEfectoEspecial() {
        System.out.println("Activaste el efecto especial tienes un escudo que te protegera dos participaciones");
    }
}
