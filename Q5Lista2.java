public class Psclista012025 {
    
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite o preço da viagem para a Alemanha (exemplo: 3009,25): R$ ");
        double precoAlemanha = scan.nextDouble();
        System.out.println("Digite a quantidade de pessoas para a Alemanha: ");
        int pessoasAlemanha = scan.nextInt();
        
        System.out.println("Digite o preço da viagem para Portugal (exemplo: 3009,25): R$ ");
        double precoPortugal = scan.nextDouble();
        System.out.println("Digite a quantidade de pessoas para Portugal: ");
        int pessoasPortugal = scan.nextInt();
        
        System.out.println("Digite o preço da viagem para a Itália (exemplo: 3009,25): R$ ");
        double precoItalia = scan.nextDouble();
        System.out.println("Digite a quantidade de pessoas para a Itália : ");
        int pessoasItalia = scan.nextInt();
        
        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;
        
        double total = totalAlemanha + totalPortugal + totalItalia;
        
        System.out.printf("Valor total da viagem para a Alemanha: R$ %.2f \n", totalAlemanha);
        System.out.printf("Valor total da viagem para Portugal: R$ %.2f \n", totalPortugal);
        System.out.printf("Valor total da viagem para a Italia: R$ %.2f \n", totalItalia);
        System.out.printf("Valor total de todas as viagens: R$ %.2f \n", total);
        
        scan.close();
    }
}
