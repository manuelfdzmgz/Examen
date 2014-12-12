
/**
 * 
 */
public class Usuario
{
    private String nombreUsuario;

    /**
     * 
     */
    public Usuario(String nombreUsuario)
    {
        this.nombreUsuario=nombreUsuario;
    }

    /**
     * 
     */
    public void comer(String nombreAlimento, float cantidad)
    {

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
