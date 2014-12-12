
/**
 * Simula la clase usuario
 */
public class Usuario
{
    //Atributo del nombre del usuario
    private String nombreUsuario;
    private Alimento alimentoComido;
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
    public void comer(Alimento dato1, float cantidad)
    {
        alimentoComido= dato1;
        cantidadComida=cantidad;
    }
    public void getEstadoUsuario(Usuario dato, Alimento dato1)
    {
        //variables locales que reflejan el dato de proteinas sobre el  total de nutrientes ingeridos
        float porcentajeSobreTotalProteinas= dato1.getCantidadNutrientes()*dato1.getGramosProteinas()/100;        
        float porcentajeSobreTotalCarbohidratos= dato1.getCantidadNutrientes()*dato1.getCarbohidratos()/100;
        float porcentajeSobreTotalGrasas= dato1.getCantidadNutrientes()*dato1.getGrasas()/100;
        System.out.println("Nombre"+":"+" "+nombreUsuario);
        System.out.println("Gramos de proteinas ingeridos"+":" +" "+dato1.getGramosProteinas()+ " "+"("+porcentajeSobreTotalProteinas +")");
        System.out.println("Gramos de carbohidratos ingeridos"+":"+" "+dato1.getCarbohidratos()+" "+"("+porcentajeSobreTotalCarbohidratos +")");
        System.out.println("Gramos de grasas ingeridos"+":"+" "+dato1.getGrasas()+" "+"("+ porcentajeSobreTotalGrasas +")");
        System.out.println("Calorias ingeridas"+":"+" "+dato1.getCalorias());
    }
}
