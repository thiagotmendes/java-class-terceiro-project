package br.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void printMenu() {
        int menuOption = 0;

        Credcard credcard = new Credcard();

        // Lista de produtos deve ficar fora do loop
        List<Product> productList = new ArrayList<>();

        // Podemos usar apenas um Scanner para tudo (mas se quiser, mantenha múltiplos)
        Scanner input = new Scanner(System.in);

        double totalCredCard = 0;

        String menuOptionsString = "Operações \n" +
                "1 - Digitar valor de crédito \n" +
                "2 - Adicionar produto \n" +
                "3 - Transferir valor \n" +
                "4 - Sair \n";

        while (menuOption != 4) {
            System.out.println(menuOptionsString);
            menuOption = input.nextInt();
            input.nextLine(); // Para consumir a quebra de linha que sobra do nextInt()

            switch (menuOption) {
                case 1:
                    System.out.println("Digite o valor do crédito: ");
                    totalCredCard = input.nextDouble();
                    input.nextLine(); // Consumir quebra de linha

                    credcard.setTotalCredCardValue(totalCredCard);
                    System.out.println("Total inserido: " + credcard.getTotalCredCardValue());
                    break;

                case 2:
                    System.out.println("Digite o nome do produto:");
                    String productName = input.nextLine();

                    System.out.println("Digite o valor do produto:");
                    double productValue = input.nextDouble();
                    input.nextLine();

                    Product newProduct = new Product();
                    newProduct.setProductName(productName);
                    newProduct.setProductValue(productValue);

                    productList.add(newProduct);

                    System.out.println("Produto " + newProduct.getProductName()
                            + " adicionado. Valor: " + newProduct.getProductValue());

                    System.out.println("/****/\n");

                    System.out.println(productList);
                    break;

                case 3:

                    double soma = 0;
                    for (Product p : productList) {
                        soma += p.getProductValue();
                    }
                    System.out.println("Valor total de produtos: " + soma);

                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }


}
