package br.ufma.ecp;

public class App 
{
    public static void main(String[] args) throws Exception {
        
        String input = "4-8+6";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        
        /* String input = "8+5-7+9";
        Parser p = new Parser (input.getBytes());
        p.parse(); */

    }
}
