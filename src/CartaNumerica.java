public class CartaNumerica extends Carta{
    private int numero;
    public CartaNumerica(String nombre, int numero){
        super(nombre);
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void c(){
        System.out.println("la carta numerica es: "+ getNumero());
    }
}
