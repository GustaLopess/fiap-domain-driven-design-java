package aula03;

// Encapsulamento - Private, protected e public

public class Televisao {

    // Atributos da classe televisão
   private int canal = 1;
   private int volume = 10;
    private boolean ligado = false;


//    Metodos da classe televisão


    // Metodos de acesso - Acessores GETTERS
    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
