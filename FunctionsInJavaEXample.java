package javaclass;

//Functions without any return value(void)
public class FunctionsInJavaEXample {
    public static void main(String[] args) {
        int a=5,b=7;
        product(a,b);
        division(a,b);
        subtract(a,b);
    }
    
    static void product(int m ,int n){
        int c=m+n;
        System.out.println("Product of two Numbers: "+c);
    }
    
    static void division(int m ,int n){
        int d=m/n;
        System.out.println("Dividing 2 Numbers: "+d);
    }
    
    static void subtract(int m ,int n){
        int e=m-n;
        System.out.println("Subtracting of 2 Numbers: "+e);
    }
}
