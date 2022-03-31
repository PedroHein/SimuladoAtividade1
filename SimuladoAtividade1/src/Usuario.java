public class Usuario {
        private String nome;
        private String senha;
        private String email;
    
        public Usuario(String nome, String email){
            this.nome = nome;
            this.senha = senha;
            this.email = email;
        }
    
        public void visualizarCliente(){
            System.out.println("Dados do Cliente:");
            System.out.println("Nome:" + nome);
            System.out.println("Senha:" + senha);
            System.out.println("E-mail:" + email);
        }
    
        public String getNome(){
            return nome;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }

        public String getSenha(){
            return senha;
        }
        
        public String getEmail(){
            return email;
        }
       
        public void setEmail(String email){
            this.email = email;
        }
    }