package aula03;

public class TelevisaoTeste {

    public static void main(String[] args) {
        System.out.println("---- Minha Televisão ----");

        // Instanciando Objeto - Tipo = Televisão.
        Televisao tv = new Televisao();


        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Ligado: " + tv.ligado);

        // Alterando os dados do objeto tv de forma direta

        tv.canal = 30;
        tv.volume = 1000;
        tv.ligado = true;

    }
}
