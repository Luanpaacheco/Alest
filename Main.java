import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        int op;
        int value;

        do {
            System.out.println("\nÁRVORE BINÁRIA DE PESQUISA");
            System.out.println("---------------------------------------");
            System.out.println("1 | Adicionar nodo");
            System.out.println("2 | Remover nodo");
            System.out.println("3 | Pesquisar nodo");
            System.out.println("4 | Exibir a árvore");
            System.out.println("5 | Mostrar informações");
            System.out.println("6 | Mostrar caminhamentos");
            System.out.println("7 | Soma de valores entre nodos");
            System.out.println("8 | Esvaziar árvore");
            System.out.println("9 | Nivel do nodo com menor valor existente.");
            System.out.println("10 | Diferenca entre valor do nodo máximo e da raiz.");
            System.out.println("11 | Quantidade de galhos.");
            System.out.println("12 | Soma dos valores de todas as folhas.");
            System.out.println("13 | Imprimir caminhamento em largura.");
            System.out.println("14 | Soma do valor de uma sequencia de nodos.");
            System.out.println("0 | Sair do programa");
            System.out.println("---------------------------------------");
            System.out.println("Digite a opção desejada: ");

            op = scan.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Informe um valor inteiro:");
                    value = scan.nextInt();
                    tree.add(value);
                }
                case 2 -> {
                    System.out.println("Informe um valor inteiro:");
                    value = scan.nextInt();
                    if (!tree.remove(value))
                        System.out.println("Valor não encontrado!");
                }
                case 3 -> {
                    System.out.println("Informe um valor inteiro:");
                    value = scan.nextInt();
                    if (tree.contains(value) != null)
                        System.out.print("Valor encontrado!");
                    else
                        System.out.println("Valor não encontrado!");
                }
                case 4 -> {
                    tree.printTree();
                }
                case 5 -> {
                    tree.treeInfo();
                }
                case 6 -> {
                    tree.orders();
                }
                case 7 -> {
                    System.out.println("Insira o valor inicial:");
                    int inicio = scan.nextInt();
                    System.out.println("Insira o valor final:");
                    int fim = scan.nextInt();
                    System.out.println(" A soma dos valores entre " + inicio + " e " + fim + " equivale a " + tree.sumBetween(inicio, fim));
                    /* DEPOIS DE IMPLEMENTAR OS SEUS MÉTODOS, DESCOMENTE AS LINHAS ABAIXO E AJUSTE CONFORME NECESSÁRIO */
                    // tree.sumBetween();
                }
                case 8 -> {
                    tree.clearTree();
                }
                case 9 -> {
                    if(tree.minNodeLevel()==-1){
                        System.out.println("A arvore esta vazia");
                    }else
                        System.out.println("Nível do nodo com menor valor existente na árvore: " + tree.minNodeLevel());

                }
                case 10 -> {
                    if(tree.diffMaxRoot()==-1){
                        System.out.println("A arvore esta vazia");
                    }else
                        System.out.println("A diferença entre o valor do nodo máximo da árvore e a raiz: " + tree.diffMaxRoot());
                }
                case 11 -> {
                    Node root = tree.getRoot();
                    System.out.println("Quantidade de nodos internos: " + tree.countInternalNodes(root));
                }
                case 12 -> {
                    Node root = tree.getRoot();
                    System.out.println("Soma dos valores das folhas: " + tree.sumExternalNodes(root));
                }
                case 13 -> {
                    System.out.println("Caminhamento da árvore em largura: ");
                    tree.breadthFirstOrder();
                }
                case 14 -> {
                    System.out.println("Insira o valor inicial:");
                    Integer inicio = scan.nextInt();
                    System.out.println("Insira o valor final:");
                    Integer fim = scan.nextInt();
                    System.out.println("A soma dos valores entre " + inicio + " e " + fim + " equivale a " + (tree.sumBetween(inicio, fim) - fim));
                }
            }
        } while (op != 0);
    }
}