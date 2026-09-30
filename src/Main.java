public class Main {
    public static void main(String[] args){
        double[] mas_K = {6, 4, 9, 2, 8};
        double x = 2;
        System.out.println("Первый способ:");
        double[] result = Polynomial.oneOption(mas_K, x);
        System.out.println("Значение P(" + x + ") = " + result[0]);
        System.out.println("Умножений: " + result[1]);
        System.out.println("Сложений: " + result[2]);
        System.out.println("Второй способ:");
        double[] result2 = Polynomial.twoOption(mas_K, x);
        System.out.println("Значение P(" + x + ") = " + result2[0]);
        System.out.println("Умножений: " + result2[1]);
        System.out.println("Сложений: " + result2[2]);
        System.out.println("Третий способ:");
        double[] result3 = Polynomial.threeOption(mas_K, x);
        System.out.println("Значение P(" + x + ") = " + result3[0]);
        System.out.println("Умножений: " + result3[1]);
        System.out.println("Сложений: " + result3[2]);



    }
}

