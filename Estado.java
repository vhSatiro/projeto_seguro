package saude;   
    public enum Estado {
        Pendente(1),Autorizado(2),Negado(3);
    
        public int valorEstado;
        Estado(int valor){
             valorEstado = valor;
      }
}

