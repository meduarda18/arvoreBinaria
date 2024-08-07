public class No{
  int dado;
  No esquerda;
  No direita;

  public No(int dado) {
      this.dado = dado;
      this.esquerda = null;
      this.direita = null;
  }

  public No getEsquerda() {
      return esquerda;
  }
  public void setEsquerda(No esquerda) {
      this.esquerda = esquerda;
  }

  public int getDado() {
      return dado;
  }
  public void setDado(int dado) {
      this.dado = dado;
  }

  public No getDireita() {
      return direita;
  }
  public void setDireita(No direita) {
      this.direita = direita;
  }

  @Override
  public String toString() {
      return "no: " + getDado();
  }
}