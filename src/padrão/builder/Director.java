
package padrão.builder;

public class Director {
     public String modelo; 
     private BuilderCarro carro; 

    public Director(BuilderCarro carro) {
        this.carro = carro;
    }
    
    public void montarCarro(String modelo){
        this.modelo = modelo; 
        if(modelo.equals("Carro basico")){
            carro.montarCambio();
            carro.montarMotor();
        }else{
            carro.montarCambio();
            carro.montarMotor();
            carro.montarArCondicionado();
        }
    }
    
   
}
