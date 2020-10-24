
import javax.swing.JOptionPane;


public class Registro {
    public static void main(String [] args){
      
        String patTaxi,modTaxi,patBus,modBus;
        int potTaxi,numLice,potBus,numAsi;
        
        patTaxi=JOptionPane.showInputDialog
        (null,"Ingrese patente: ","Solicitando Datos del Taxi: ",3);
        modTaxi=JOptionPane.showInputDialog
        (null,"Ingrese modelo: ","Solicitando Datos del Taxi: ",3);
        potTaxi=Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingrese la potencia: ","Solicitando Datos del Taxi: ",3));
        numLice=Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingrese numero de licencia de 6 Digitos: ","Solicitando Datos del Taxi: ",3));
        
         patBus=JOptionPane.showInputDialog
        (null,"Ingrese patente: ","Solicitando Datos del Bus: ",3);
        modBus=JOptionPane.showInputDialog
        (null,"Ingrese modelo: ","Solicitando Datos del Bus: ",3);
        potBus=Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingrese la potencia: ","Solicitando Datos del Bus: ",3));
        numAsi=Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingrese numero de asientos: ","Solicitando Datos del Bus: ",3));
        
        Taxi taxi = new Taxi(patTaxi,modTaxi,potTaxi,numLice); 
        Bus bus = new Bus(patBus,modBus,potBus,numAsi);
        taxi.mostrarDatos();
        bus.mostrarDatos();  
        
    }
}
