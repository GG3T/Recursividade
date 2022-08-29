package arvore;

public class ABBint {

    private class ARVORE{
        int dado;
        ARVORE esq,dir;
    }

    public ARVORE raiz = null;


    public ARVORE inserir(ARVORE p, int info) {
        // insere elemento em uma ABB
        if (p == null) {
            // Inicializa um novo NO quando ele está nulo.
            p = new ARVORE();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        }
        else if (info < p.dado)
            p.esq= inserir (p.esq, info);
        else
            p.dir=inserir(p.dir, info);
        return p;
    }
    public void listaEmordem(ARVORE p) {
        if (p != null) {
            listaEmordem(p.esq);
            System.out.println("dado : " + p.dado);
            listaEmordem(p.dir);
        }
    }
        public int contaNos(ARVORE p,  int cont){
        if (p!=null){
            cont++;
             cont = contaNos(p.esq, cont);
             cont = contaNos(p.dir,cont);
            }
        return cont;
        }
}
