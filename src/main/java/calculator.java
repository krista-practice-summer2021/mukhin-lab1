import java.util.Scanner;

public class calculator {
    String problem;

    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Введите выражение");
        String problem = calc.getLine();
        String[] strList = problem.split(" ");
        int result = 0;
        boolean flag = (Integer.parseInt(strList[2]) != 0);
        switch (strList[1]) {
            case "+":
                result = Integer.parseInt(strList[0]) + Integer.parseInt(strList[2]);
                break;
            case "-":
                result = Integer.parseInt(strList[0]) - Integer.parseInt(strList[2]);
                break;
            case "*":
                result = Integer.parseInt(strList[0]) * Integer.parseInt(strList[2]);
                break;
            case "/":
                try {
                    result = Integer.parseInt(strList[0]) / Integer.parseInt(strList[2]);
                }catch(ArithmeticException e){
                    System.out.print("Ошибка деления на 0");
                }
                break;
        }
        if (flag)
            System.out.print("Результат: " + result);
    }


    public String getLine() {
        Scanner in = new Scanner(System.in);
        String Problem = in.nextLine();
        return Problem;
    }
}
