package aula6;

public class ControleRemoto implements Controlador {

    //Atributos
    private float volume;
    private boolean ligado;
    private boolean tocando;

    //Metodos Especiais    
    public void ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private float getVolume() {
        return volume;
    }

    private void setVolume(float volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50f);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("-------MENU-------");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando menu...");
        }
        else{
            System.out.println("ERRO! A TV não esta ligada.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossivel diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
        else{
            System.out.println("ERRO! A TV não esta ligada");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

}
