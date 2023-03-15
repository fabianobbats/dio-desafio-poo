package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
        setTitulo(titulo);
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
