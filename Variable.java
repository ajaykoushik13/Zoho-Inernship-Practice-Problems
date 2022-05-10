class Variable
{
    int x = 10;
    static int y = 4;
    void method()
    {
       Variable var = new Variable();
        var.x = 5;
        y = 12;
        System.out.println(var.x);
        System.out.println(y);
    }
    public static void main(String str[])
    {
        int num;
        num =10 ;
        Variable obj = new Variable();
        y = 22;
        obj.method();
        System.out.println(num);
        System.out.println(y);
    }
}
