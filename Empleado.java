
/**
 * Reto Java, Semana 2.
 * 
 * @Angela Durán 
 * @version (julio 14)
 */
public class Empleado
{
    String Nombre;
    Integer Id;
    String Email;
    double T_antig;
    String Area;
    boolean Jefe;
    double Devengado;
    double EPS;
    double AFP;
    double Fondo;
    double Nomina_a_pagar;
     
    // variables
    Integer porc_EPS = 4;
    Integer porc_AFP = 4;
    double salario_minimo = 908526;
    double total_devengado;
    String EsJefe;
        
    /*
    public static void main(String [] args)
    {
        
    }
    */

     /**
     * Constructor for objects of class Empleado
     */   
    public Empleado(String Nombre, Integer Id, String Email,double T_antig, String Area, boolean Jefe)
    {
           
        this.Nombre = Nombre;  
        this.Id= Id;
        this.Email = Email;
        this.T_antig= T_antig;
        this.Area = Area;
        this.Jefe = Jefe;
        
        
         
        
        // INSTRUCCIONES
                
        if (Jefe == true)
        {
            EsJefe ="SI";
            if(Area.equals("Desarrollo"))
            {
                this.Devengado=4400000.0;
            } else if(Area.equals("Administrativos"))
            {
                this.Devengado=3800000.0;
            } else
            {
                this.Devengado=2100000.0;
            }
        }
        else
        {
            EsJefe ="NO";
            if(Area.equals("Desarrollo"))
            {
                this.Devengado=3200000.0;
            } else if(Area.equals("Administrativos"))
            {
                this.Devengado=2800000.0;
            } else
            {
                this.Devengado=1500000.0; 
            }
        }
        
        // PORCENTAJES de descuento
        EPS=Devengado*porc_EPS/100;
        AFP=Devengado*porc_AFP/100;
        
        // Fondo
        if (Devengado >= (4*salario_minimo))
        {
            this.Fondo = Devengado*0.01;
        }
        
        // Totral a pagar
        this.Nomina_a_pagar=Devengado-EPS-AFP-Fondo;
    }
    
    public String getInfo()
    { 
        //System.out.println(emp.getInfo());
        String mensaje = 
         "Nombre: " + this.Nombre + "\n" +
        "Id: "  + this.Id + "\n" +
        "Email: "  + this.Email + "\n" +
        "T antig: " + this.T_antig + " anios"+ "\n" +
        "Area: " + this.Area + "\n" +
        "Jefe: " + EsJefe + "\n" +
        "Devengado: "  + this.Devengado + "\n" +
        "EPS: " +EPS + "\n" +
        "AFP: " + AFP +"\n" +
        "Fondo: " + Fondo + "\n" +
        "Nomina a pagar: " + this.Nomina_a_pagar;
        
        return mensaje;
        
        /*
        System.out.println("Nombre: " + this.Nombre + 
        "\n Id: "  + this.Id + 
        "\n Email: "  + this.Email + 
        "\n T antig: " + this.T_antig + " anios "+ 
        "\n Area: " + this.Area + 
        "\n Jefe: " + EsJefe + 
        "\n Devengado: "  + this.Devengado + 
        "\n EPS: " +EPS + 
        "\n AFP: " + AFP +
        "\n Fondo: " + Fondo + 
        "\n Nomina a pagar: " + this.Nomina_a_pagar);
        */
    
    }
}
