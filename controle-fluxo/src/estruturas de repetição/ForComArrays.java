public class ForComArrays {

    public static void main(String[] args) {
        
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x = 0 ; x < alunos.length; x++ ){
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
    }
    
}

/*FOR EACH é uma forma de fazer um FOR abreviado, quando trabalhar com índices funciona muito bem como no exemplo abaixo 
 * String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
 * for(String aluno : alunos){
 * System.out.println("Nome do aluno é: " + aluno);
 * }
 * 
 * Funciona da mesma maneira que o código acima
*/

