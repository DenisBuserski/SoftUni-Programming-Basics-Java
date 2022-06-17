import java.util.Scanner;

public class Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String textIn = scanner.nextLine();
        String textOut = scanner.nextLine();

        // double m = 1;
        // double mm = 1000;
        // double cm = 100;

        if (textIn.equals("m")){
            if (textOut.equals("mm")){
                double result = number * 1000;
                System.out.printf("%.3f", result);
            } else if (textOut.equals("cm")){
                double result = number * 100;
                System.out.printf("%.3f", result);
            }
        } else if (textIn.equals("mm")){
            if (textOut.equals("m")){
                double result = number / 1000;
                System.out.printf("%.3f", result);
            } else if (textOut.equals("cm")){
                double result = number / 10;
                System.out.printf("%.3f", result);
            }
        } else if (textIn.equals("cm")){
            if (textOut.equals("m")){
                double result = number / 100;
                System.out.printf("%.3f", result);
            } else if (textOut.equals("mm")){
                double result = number * 10;
                System.out.printf("%.3f", result);
            }
        }
        
    }
}
