package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicial;
  private final LocalDate dataFinal;
  private Set<Conteudo> conteudo;
  private Set<Dev> devsIncritos;

  public Bootcamp(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
    this.dataInicial = LocalDate.now();
    this.dataFinal = dataInicial.plusDays(45);
    this.conteudo = new LinkedHashSet<>();
    this.devsIncritos = new HashSet<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public Set<Conteudo> getConteudo() {
    return conteudo;
  }

  public void setConteudo(Set<Conteudo> conteudo) {
    this.conteudo = conteudo;
  }

  public Set<Dev> getDevsIncritos() {
    return devsIncritos;
  }

  public void setDevsIncritos(Set<Dev> devsIncritos) {
    this.devsIncritos = devsIncritos;
  }

  @Override
  public String toString() {
    return "Bootcamp {\n" +
        "\tnome=" + nome + ",\n" +
        "\tdescricao=" + descricao + ",\n" +
        "\tdataInicial=" + dataInicial.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + ",\n" +
        "\tdataFinal=" + dataFinal.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + ",\n" +
        "\tconteudo=" + conteudo + ",\n" +
        "\tqtdDevsIncritos=" + devsIncritos.size() + ",\n" +
        "}";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
    result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
    result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
    result = prime * result + ((devsIncritos == null) ? 0 : devsIncritos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bootcamp other = (Bootcamp) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    if (dataInicial == null) {
      if (other.dataInicial != null)
        return false;
    } else if (!dataInicial.equals(other.dataInicial))
      return false;
    if (dataFinal == null) {
      if (other.dataFinal != null)
        return false;
    } else if (!dataFinal.equals(other.dataFinal))
      return false;
    if (conteudo == null) {
      if (other.conteudo != null)
        return false;
    } else if (!conteudo.equals(other.conteudo))
      return false;
    if (devsIncritos == null) {
      if (other.devsIncritos != null)
        return false;
    } else if (!devsIncritos.equals(other.devsIncritos))
      return false;
    return true;
  }

}
