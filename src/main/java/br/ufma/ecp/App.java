package br.ufma.ecp;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        String input = "289-85+0+6";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        
        String input = "45  + preco - 876";
        Parser p = new Parser (input.getBytes());
        p.parse();

    }*/
    String input = "45  + preco - 876";
    Scanner scan = new Scanner (input.getBytes());
    for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
        System.out.println(tk);
    }

    }
}
