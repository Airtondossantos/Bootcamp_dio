package br.com.dio.desafio.dominio;

public class Curso {
    private String title;
    private String description;
    private double duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double CalcularXp(){
        return 0;
    }

}
