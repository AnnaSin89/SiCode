public class Polynomial {
    public static double[]oneOption(double[] mas_K, double x){
        double result = 0.0;
        int  multiplication = 0;
        int addition = 0;
        for (int i = 0; i < mas_K.length; i++){
            double power = 1.0;
            for (int j = 1; j <= i; j++){
                power = power * x;
                multiplication++;
            }
            double term = mas_K[i] * power;
            multiplication++;

            if (i == 0){
                result = term;
            }else{
                result+=term;
                addition++;
            }
        }
        return new double[]{result, multiplication, addition};
    }
    public static double[] twoOption(double[] mas_K, double x){
        double result = 0.0;
        double power = 1.0;
        int multiplication = 0;
        int addition = 0;
        for (int i = 0; i < mas_K.length; i++){
            result += mas_K[i] * power;
            multiplication++;
            addition++;

            if (i < mas_K.length - 1){
                power = power * x;
                multiplication++;

            }
        }
        return new double[]{result, multiplication, addition};

    }
    public static double[] threeOption(double[] mas_K, double x){
        double result = mas_K[mas_K.length - 1];
        int multiplication = 0;
        int addition = 0;
        for (int i = mas_K.length - 2; i >= 0; i--){
            result = result * x + mas_K[i];
            multiplication++;
            addition++;
        }
        return new double[]{result,multiplication,addition};


    }

}



