class Operators{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 20;
        boolean bool = true;

        System.out.println("Unary operator");
        System.out.println("prefix ++ : " + ++a + " prefix -- :" + --b);
        System.out.println("postfix ++ : " + a++ + " postfix -- :" + b--);
        System.out.println("~ : " + ~a );
        System.out.println("! : " + !bool );

        System.out.println("Arithmetic operator");
        System.out.println("a+b :" + (a+b));
        System.out.println("a-b :" + (a-b));
        System.out.println("a*b :" + (a*b));
        System.out.println("a/b :" + (a/b));
        System.out.println("a%b :" + (a%b));

        System.out.println("Shift operator");
        System.out.println("Rigth operator >> :" + (c>>2));
        System.out.println("Left operator << :" + (c<<2));

        System.out.println("Relational operator");
        System.out.println(">= :" + (a >= b));
        System.out.println("<= :" + (a <= b));
        System.out.println("> :" + (a > b));
        System.out.println("< :" + (a < b));
        System.out.println("== :" + (a == b));
        System.out.println("!= :" + (a != b));

        System.out.println("Logical operator");
        System.out.println("And && :" + (a<b && a<c));
        System.out.println("Or || :" + (a<b || a<c));

        System.out.println("Bitwise operator");
        System.out.println("And & :" + (a<b & a<c));
        System.out.println("Or | :" + (a<b | a<c));
        System.out.println("Xor ^ :" + (a^b));

        System.out.println("Ternary operator");
        System.out.println(a > b ? a : b);

        System.out.println("Assignment operator");
        a += b;
        System.out.println(a);


    }

}