/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadostarea;
import java.util.ArrayList;
import ico.fes.empleados.Datos;
import java.util.Iterator;
/**
 *
 * @author javie
 */
public class EmpleadosTarea {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int sueldoM;
    int moHoEx;
        
        ArrayList<Datos> Da=new ArrayList();
        
            Da.add(new Datos("Jose Garcia Perez","Sistemas",670,30,5));//Posicion 0 en el Arr1ayList3
            Da.add(new Datos("Diana Herrera Perez","Recursos humanos",450,25,0));//Posicion 1 en el ArrayList
            Da.add(new Datos("Jessica Juarz Dias","Ventas",400,28,0));//Posicion 2 en el ArrayList
            Da.add(new Datos("Pedro Paz Orozco","Ventas",410,30,0));//Posicion 3 en el ArrayList
            Da.add(new Datos("Jose Marcel Perez","Sistemas",680,29,0));//Posicion 4 en el ArrayList
            Da.add(new Datos("Jesus Diaz Garcia","Recursos humanos",455,30,0));//Posicion 5 en el ArrayList
            Da.add(new Datos("Pedro Xotla Ramirez","Sistemas",675,27,0));//Posicion 6 en el ArrayList
            Da.add(new Datos("Javier Medina Blanco","Ventas",400,30,4));//Posicion 7 en el ArrayList
            Da.add(new Datos("Elizabeth Villa Sosa","Sistemas",670,30,3));//Pocision 8 en el ArrayList
        
        
        for (Datos datos : Da) {
            
            System.out.println("___________________________________");
            System.out.println(datos);            
            
           
        }
        
        for (Datos datos : Da) {
            
            sueldoM=datos.getDiasTrabajados()*datos.getSueldoDiario();
            System.out.println("++++++++++++++++++++");
            System.out.println("Nombre: \n"+datos.getNombre()+"\nSueldo Mensual: \n$"+sueldoM);
            
        }
        
        for (Datos datos : Da) {
            moHoEx=datos.getHorasExtras()*85;
            System.out.println("------------------------");
            System.out.println("Nombre: \n"+datos.getNombre());
            System.out.println("Monto por horas extra: \n $"+moHoEx);
        }
        
        Iterator<Datos> iterador=Da.iterator();
        
        int dias=31;
        String empleadoMenosProductivo="";
        
        while (iterador.hasNext()){
        
            Datos dato=iterador.next();
            if (dato.getDiasTrabajados()<dias){
                
                dias=dato.getDiasTrabajados();
                empleadoMenosProductivo= dato.getNombre();
            
            }
        
        }
        System.out.println("\n====================== ");
        System.out.println("El empleado menos productivo es: "+empleadoMenosProductivo);
        
        Iterator<Datos> ite=Da.iterator();
        int mas=0;
        String empleadoMasProductivo="";
        while(ite.hasNext()){
            Datos datos=ite.next();
            if(datos.getHorasExtras()>mas){
            
                mas=datos.getDiasTrabajados();
                empleadoMasProductivo=datos.getNombre();
            }
      
        }
        
        System.out.println("======================");
        System.out.println("El empleado mas productivo es: "+empleadoMasProductivo);
    }
}


    

