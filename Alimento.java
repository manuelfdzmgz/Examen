
/**
 * 
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

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAlimento, float gramosProteinas, float carbohidratos, float grasas)
    {
        this.nombreAlimento= nombreAlimento;
        this.gramosProteinas=gramosProteinas;
        this.carbohidratos=carbohidratos;
        this.grasas=grasas;
    }
    public String muestraDatos()
    {
        System.out.println("####"+"El nombre del alimento es"+ nombreAlimento+"####");
        System.out.println("####"+"Los gramos de proteinas por cada 100 gramos de alimento son"+gramosProteinas+"####");
        System.out.println("####"+"El numero de carbohidratos por cada 100 gramos de alimento son"+ carbohidratos+"####");
        System.out.println("####"+"El numero de grasas por cada 100 gramos de alimento es"+grasas+"####");
        System.out.println("####"+"El numero de calorias correspondientes es"+calorias+"####");
        if(carbohidratos!=0||gramosProteinas!=0)
        {   if(carbohidratos!=0&&gramosProteinas=0) {
                System.outprintln("####"+"El componente mayoritario es el carbohidrato"+"####");                
                 System.outprintln("####"+"El componente mayoritario es la proteina"+"####");
            }
            else
            {
                System.outprintln("####"+"El componente mayoritario es la proteina"+"####");
            }
            else if(carbohidratos!=0&&gramosProteinas!=0)
            {
                System.out.prinln("####"+"El componente mayoritario o mayoritarios son"+Proteinas+ Carbohidratos+"####");
            }
        }
        else
        {
            Systemn.out.println("####"+"No hay un componente mayoritario en este alimento"+"####");
        }
    }
}
