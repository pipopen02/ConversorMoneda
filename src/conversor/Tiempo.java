package conversor;

import javax.swing.JOptionPane;


public class Tiempo extends ClassConvert{
    private int cantidad,Tiempo;
    private char Op;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setOp(char Op) {
        this.Op = Op;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public char getOp() {
        return Op;
    }
    
        public Tiempo() {
        this.cantidad = 0;
        this.Tiempo = 0;
        this.Op = ' ';
    }
    
    public Tiempo(int cantidad, int Tiempo, char Op) {
        this.cantidad = cantidad;
        this.Tiempo = Tiempo;
        this.Op = Op;
    }
    
        public void ConvertirTop(char Op){
        int total;
        
        if(Op=='A'|| Op=='B'){
            total= this.cantidad/60;
            JOptionPane.showMessageDialog(null,"Su cantidad es "+total);
            System.exit(0);
        }
        switch (Op) {
            case 'C':
               total=this.cantidad/3600;
               JOptionPane.showMessageDialog(null,"Su cantidad es "+total+" Hora(s)");
               System.exit(0);
               break;
            case 'D':
               total= this.cantidad/24;
                JOptionPane.showMessageDialog(null,"Su cantidad es "+total+ " Dia(s)");
                System.exit(0);
                break;
                
            default:
                break;
        }
        System.exit(0);
        
       
    }

    public void LeerTiempo(){
        String opc;
        char cant;
        String[] Opcion ={"A->Convertir de minutos a hora",
                          "B->Convertir de Segundos a Minutos",
                          "C->Convertir de Segundos a Hora ",
                          "D->Convertir de Horas a Dias"};
        
        opc = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion", "Opciones",JOptionPane.PLAIN_MESSAGE, null, Opcion,Opcion[0]);
        cant=opc.toUpperCase().charAt(0);
        
        try{
    String opcio = JOptionPane.showInputDialog("Cantidad a convertir");
    int can=Integer.parseInt(opcio);
    this.cantidad = can;
    }catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(null, "Error");
        ex.getMessage();
    }  
        ConvertirTop(cant);
     }
    
    
}

