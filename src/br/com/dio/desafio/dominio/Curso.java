package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private double duration;

    @Override
    public double CalcularXp() {
        return XP_PADRAO * duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo=" + getTitle() +
                "description=" + getDescription() +
                "duration=" + duration +
                '}';
    }
}
