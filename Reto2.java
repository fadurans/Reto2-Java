
/**
 * Write a description of class Reto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reto2
{
    
    public static void main(String [] args)
    {
        //Empleado emp = new Empleado("Lucia Gomez",1097000000, "lucia.gomez@correo.com", 2, "Desarrollo", true);
        Empleado emp = 
        new Empleado("Daniela Ramirez", 1099234000, "daniela.ramirez@correo.com", 2.3, "Servicios", false); 
        //new Empleado("Juan Gomez", 90400000, "juan.gomez@correo.com", 1.0, "Desarrollo", false);
        //new Empleado("Miguel Alvarez", 1099000222, "miguel.alvarez@correo.com", 2.9, "Administrativos", false)
        
        System.out.println(emp.getInfo());
        //emp.Info();
    }

}
