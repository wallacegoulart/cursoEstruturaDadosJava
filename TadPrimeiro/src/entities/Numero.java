package entities;
/*
 * 
 * @author prof. Marcio Porto Feitosa
 * @copia Wallace Goulart
 * data 04/09/2024
 */
public class Numero {

    private float valor;

    public Numero(){
        this.valor = 0;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){

        if(valor<0){
            valor = 0;
            msg("O valor menor que zero -> corrigido para zero");
        }
        else if(valor> 40 && valor<60){
            if(valor<50){
                valor = 40 ;
                msg("Valor escolhido está num intervalo não suportado -> sorrigido para 40");
            }else{
                valor = 60 ;
                msg("Valor escolhido está num intervalo não suportado -> sorrigido para 60");

            }
        }
        else if(valor>100){
            valor = 100;
            msg("Valor maior que 100 -> corrigo para 100");
        }

        this.valor = valor;
        System.err.println("Novo valor atribuido.");
    }

    private void msg(String texto){
        System.err.println();
        System.out.println("!!!!ATENCAO: " + texto + "!!!!");
        System.err.println();
    }



}
