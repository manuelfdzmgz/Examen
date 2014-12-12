
/**
 * Simula la clase usuario
 */
public class Usuario
{
    //Atributo del nombre del usuario
    private String nombreUsuario;
    private String alimentoComido;
    private float cantidadComida;

    /**
     * Constructor de la clase usuario
     */
    public Usuario(String nombreUsuario)
    {
        this.nombreUsuario=nombreUsuario;
        alimentoComido=null;
        cantidadComida=0;
    }

    /**
     * Metodo comer que simula la accion de que el usuario come un tipo de objeto de la clase alimento con una determinada cantidad.
     */
    public void comer(String nombreAlimento, float cantidad)
    {
        alimentoComido=nombreAlimento;
        cantidadComida=cantidad;
    }
    public void getstadoUsuario(Alimento dato)
    {
        System.out.println("Nombre"+nombreUsuario);
        System.out.println("Gramos de proteinas ingeridos"+dato.getGramosProteinas());
        System.out.println("Gramos de carbohidratos ingeridos"+dato.getCarbohidratos());
        System.out.println("Gramos de grasas ingeridos"+dato.getGrasas());
        System.out.println("Calorias ingeridas"+dato.getCalorias());
    }
}
