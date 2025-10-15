package br.ufma.ecp;

public class Parser {
    
    private Scanner scan;
    private char currentToken;

    public Parser(byte[] input) {
        scan = new Scanner(input);
        currentToken = scan.nextToken();
    }
    
    private void oper () {
        if (peek() == '+') {
            match('+');
            digit();
            System.out.println("add");
            oper();
        } else if (peek() == '-') {
            match('-');
            digit();
            System.out.println("sub");
            oper();
        } 
    }

    private void digit () {
        if (Character.isDigit(peek())) {
            System.out.println("push " + peek());
            match(peek());
        } else {
           throw new Error("syntax error");
        }
    }
    

    private void expr() {
            digit();
            oper();
    }

    public void parse () {
        expr();
    }



}