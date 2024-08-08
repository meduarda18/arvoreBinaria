public class Arvore {
  private No raiz;

  public Arvore() {
    this.raiz = null;
  }

  public void inserirNo(int dado){
    No novoNo = new No(dado);

    if(raiz == null){
        raiz = novoNo;
    } else {
      int primeiro = raiz.getDado();
      No descida = raiz;

        while (descida != null) {
            if(primeiro > dado){
                if(descida.getEsquerda() != null){
                    descida = descida.getEsquerda();
                    primeiro = descida.getDado();
                } else {
                  descida.setEsquerda(novoNo);
                  descida = null;
                }
            } else {
                if(descida.getDireita() != null){
                    descida = descida.getDireita();
                    primeiro = descida.getDado();
                } else {
                    descida.setDireita(novoNo);
                  descida = null;
                }
            }
        }
    }
  }

  public void removeMenor() {
      if (raiz == null) {
        return;
      }

      if(raiz.getEsquerda() == null){
        raiz = raiz.getDireita();
        return;
      }
      
      No pai = null;
      No descida = raiz;
      
      while (descida.getEsquerda() != null) {
        pai = descida;
        descida = descida.getEsquerda();
      }
      
      if (pai == null) {
        raiz = descida.getDireita();
      } else {
        pai.setEsquerda(descida.getDireita());
      }
  }
  

  public void removeMaior(){
      if (raiz == null) {
        return;
      }

      if(raiz.getDireita() == null){
        raiz = raiz.getEsquerda();
        return;
      }

      No pai = null;
      No descida = raiz;

      while (descida.getDireita() != null) {
        pai = descida;
        descida = descida.getDireita();
      }
      
      if (pai == null) {
        raiz = descida.
        getEsquerda();
      } else {
        pai.setDireita(descida.getEsquerda());
      }

  }

  public boolean buscaRecursiva(No no, int valor){ //Criar método de busca que recebe um valor e diz se o valor está ou não na árvore.
    if(no == null){
        return false;
    }
    if(no.getDado() == valor){
        return true;
    } 
    else if(valor < no.getDado()){
        return buscaRecursiva(no.getEsquerda(), valor); 
    } else {
        return buscaRecursiva(no.getDireita(), valor); 
    }
  }

  public void printPreOrdem(No no){
    if(no == null){
        return;
    }

    System.out.println(no.getDado());

    printPreOrdem(no.getEsquerda());

    printPreOrdem(no.getDireita());
  }

  public void printEmOrdem(No no){
    if(no == null){
        return;
    }

    printEmOrdem(no.getEsquerda());

    System.out.println(no.getDado());

    printEmOrdem(no.getDireita());
  }

  public void printPosOrdem(No no){
    if(no == null){
        return;
    }

    printPosOrdem(no.getEsquerda());

    printPosOrdem(no.getDireita());

    System.out.println(no.getDado());
  }
  


  public No getRaiz() {
    return raiz;
  }

  public void setRaiz(No raiz) {
    this.raiz = raiz;
  }

  public void print(){
    System.out.println(raiz);
  }
}
