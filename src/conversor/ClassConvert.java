
package conversor;
import javax.swing.JOptionPane;

public class ClassConvert {
private double /*Calculo*/precioModena,/*Tiempo*/ Cant;
private char OpMoneda,opConversion;
private String OpcionMoneda,/*Tiempo*/Opcion;

    public char getOpMoneda() {
        return OpMoneda;
    }

    public void setOpMoneda(char OpMoneda) {
        this.OpMoneda = OpMoneda;
    }

    public char getOpConversion() {
        return opConversion;
    }

    public void setOpConversion(char opConversion) {
        this.opConversion = opConversion;
    }

    public String getOpcion() {
        return Opcion;
    }

    public void setOpcion(String Opcion) {
        this.Opcion = Opcion;
    }


    public ClassConvert(){
        this.Cant =0;
        this.precioModena = 0;
        this.OpcionMoneda = "";
        this.OpMoneda =' ';
        this.Opcion ="";
        this.opConversion= ' ';
    }
    
    public ClassConvert(float precioMoneda, float Cant, String OpcionMoneda){
        this.precioModena= precioMoneda;
        this.Cant = Cant;
        this.OpcionMoneda = OpcionMoneda;
    }

    public void setPrecioModena(float precioModena) {
        this.precioModena = precioModena;
    }

    public void setCant(float Cant) {
        this.Cant = Cant;
    }

    public void setOpcionMoneda(String OpcionMoneda) {
        this.OpcionMoneda = OpcionMoneda;
    }

    public double getPrecioModena() {
        return precioModena;
    }

    public double getCant() {
        return Cant;
    }

    public String getOpcionMoneda() {
        return OpcionMoneda;
    }
        public double Calculo(char OpMoneda){
     
        double MiMoneda= this.precioModena,total=0;
                   
        switch (OpMoneda){
                        
            case 'A':
                
                total =MiMoneda *24.65;
                JOptionPane.showConfirmDialog(null, "Su Cantidad es "+total);
                
            
                break;
            case 'B':
                this.OpMoneda = 'B';
                total = MiMoneda*26.71;
                JOptionPane.showConfirmDialog(null, "Su Cantidad es "+total);
            
                break;
            case 'C':
                this.OpMoneda = 'C';
                total = this.precioModena*30.37;
                JOptionPane.showConfirmDialog(null, "Su Cantidad es "+total);
            
                break;
            case 'D':
                 this.OpMoneda = 'D';
                total = this.precioModena*0.19;
                JOptionPane.showConfirmDialog(null, "Su Cantidad es "+total);
            
                break;
            case 'E':
                
                total = this.precioModena*0.019;
                JOptionPane.showConfirmDialog(null, "Su Cantidad es "+total);
            
                break;
            default:
                    
                break;
        }
        
        return total;
           
            }
        

        
        
    public void Leer(){
        
        /*Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sul-coreano*/
        String ResulConvert;//variable para recuperar el dato
        //procedimiento de pedir que quiere hacer
           String[] Opciones = {"A->Convertir Monedas ",
                                "B->Convertidor de Tiempo"};
           this.Opcion = (String)JOptionPane.showInputDialog(null,"Seleccinone que desea convertir","Lista de opciones",JOptionPane.PLAIN_MESSAGE, null, Opciones, Opciones[0]);
           this.opConversion=this.Opcion.charAt(0);
           
           if(this.opConversion == 'B'){
               Tiempo tiempo = new Tiempo();
               
               tiempo.LeerTiempo();
               
               
           }
                      
           //Ventana del precio
           
                    
        try {
           ResulConvert=JOptionPane.showInputDialog("Cantidad a Convertir"); 
           this.precioModena=Double.parseDouble(ResulConvert);
        } catch (NumberFormatException e) {
            
            System.out.println("Error: La cadena no contiene un número válido.");
       } finally{
            JOptionPane.showConfirmDialog(null, "Fin del programa");
        }
           

               
           
           
           
           //Opcion para pedir que converita
           String[] OpcionesMoneda={"A.-> Convertir de Lempiras Hondureños a Dolar",
               "B.-> Convertir de Lempiras a Euros.",
               "C.-> Convertir de Lempiras a Libras Esterlinas.",
               "D.-> Convertir de Lempiras a Yen Japonés.",
               "E.-> Convertir de Lempiras a Won sul-coreano",};
           
           
           this.OpcionMoneda =(String)JOptionPane.showInputDialog(null,"Seleccione una Opcion","Lista de opciones",JOptionPane.PLAIN_MESSAGE,null,OpcionesMoneda,OpcionesMoneda[0]);
           this.OpMoneda=this.OpcionMoneda.toUpperCase().charAt(0);
           char envio= OpMoneda;
           Calculo(envio);
           
           
  }
    
    }
    
    
    
