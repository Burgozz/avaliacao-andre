package avaliacao-andre.Gestao_de_prrodutos.src;

class Addition {
    public double n1;
    public double n2;
    public double r;
    public double getN1() {
         return n1;
    }
    public void setN1(double n1) {
         this.n1 = n1;
    }
        public double getN2() {
         return n2;
    }
    public void setN2(double n2) {
         this.n2 = n2;
    }
    public double getR() {
         return r;
    }
    public void setR(double r) {
     this.r = r;
    }
    
    public void addition(){
         r = n1 + n2;
    }
}