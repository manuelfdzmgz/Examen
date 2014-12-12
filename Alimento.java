
/**
 * Simula la clase alimento con sus atribuos de nombre numero de proteinas carbohidratos grasas y numero de calorias
 */
public class Alimento
{
    //Nombre del alimento
    private String nombreAlimento;
    //numero de gramos en proteinas
    private float gramosProteinas;
    //numero de carbohidratos
    private float carbohidratos;
    //numero en grasas del alimento
    private float grasas;
    //calorias del alimento
    private float calorias;
    private float cantidadNutrientes;

    /**
     * Constructor de la clase alimento
     */
    public Alimento(String nombreAlimento, float gramosProteinas, float carbohidratos, float grasas, float calorias)
    {
        this.nombreAlimento= nombreAlimento;
        this.gramosProteinas=gramosProteinas;
        this.carbohidratos=carbohidratos;
        this.grasas=grasas;
        this.calorias=calorias;
        cantidadNutrientes= carbohidratos+grasas+gramosProteinas;
    }

    /*
     * Metodo que retorna el valor de gramos de proteinas
     */
    public float getGramosProteinas()
    {
        return gramosProteinas;
    }

    /*
     * Metodo que retorna el valor de carbohidratos
     */
    public float getCarbohidratos()
    {
        return carbohidratos;
    }

    /*
     * Metodo que retorna el valor de las grasas del alimento
     */
    public float getGrasas()
    {
        return grasas;
    }

    /*
     * Metodo que retorna el valor de las calorias
     */
    public float getCalorias()
    {
        return calorias;
    }
    /*
     * Retorna el valor total de nutrientes
     */
    public float getCantidadNutrientes()
    {
        return cantidadNutrientes;
    }

    /*
     * Metodo que imprime por pantalla los valores de los atributos nombre grasas carbohidratos...
     */
    public void muestraDatos()
    {
        System.out.println("####"+"El nombre del alimento es"+ nombreAlimento+"####");
        System.out.println("####"+"Los gramos de proteinas por cada 100 gramos de alimento son"+gramosProteinas+"####");
        System.out.println("####"+"El numero de carbohidratos por cada 100 gramos de alimento son"+ carbohidratos+"####");
        System.out.println("####"+"El numero de grasas por cada 100 gramos de alimento es"+grasas+"####");
        System.out.println("####"+"El numero de calorias correspondientes es"+calorias+"####");
        if(carbohidratos!=0||gramosProteinas!=0)
        {   if(carbohidratos!=0) {
                System.out.println("####"+"El componente mayoritario es el carbohidrato"+"####");                
            }
            else if(gramosProteinas!=0)
            {
                System.out.println("####"+"El componente mayoritario o mayoritarios son las proteinas"+"####");
            }
            else
            {
                System.out.println("####"+"El componente mayoritario son las proteinas y los carbohidratos"+"####");
            }
        }
        else
        {
            System.out.println("####"+"No hay un componente mayoritario en este alimento"+"####");
        }
    }

}
