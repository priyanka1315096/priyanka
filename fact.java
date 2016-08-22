public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int f = factorial(a);
    System.out.println(f);
}
static int factorial(int a){
    if(a <= 1){
        return 1;
    }
    else
        return (a * factorial(a-1));
}