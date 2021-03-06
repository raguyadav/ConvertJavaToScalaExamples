package Chapter3IfElseSwitchStatements;

/**
 * Created by sushi on 15-06-20.
 */
public class ComputeTaxesRefactored1Java {

    // def getsome() = { }
    static double getSalaryLessOREqualto8350(double salary) {
        return (salary * 0.10);
    }

    static double getSalaryLessOREqualto33950(double salary) {
        return (8350 * 0.10) + (salary - 8350)* 0.15;
    }

    static double getSalaryLessOREqualto82250(double salary) {
        return (8350 * 0.10) + (33950 - 8350)* 0.15 + (salary - 33950) * 0.25;
    }

    static double getSalaryLessOREqualto171550(double salary) {
        return (8350 * 0.10) + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + (salary - 82250) * 0.28;
    }

    static double getSalaryLessOREqualto372950(double salary) {
        return (8350 * 0.10) + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (salary - 171550) * 0.33;
    }

    static double getSalaryLessOREqualto400000(double salary) {
        return (8350 * 0.10) + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (salary - 372950) * 0.35;
    }

    public static void main(String[] args) {
        final double salary = 8350;
        double tax = 0;

        if (salary <= 8350)         tax = getSalaryLessOREqualto8350(salary);
        else if (salary <= 33950)   tax = getSalaryLessOREqualto33950(salary);
        else if (salary <= 82250)   tax = getSalaryLessOREqualto82250(salary);
        else if (salary <= 171550)  tax = getSalaryLessOREqualto171550(salary);
        else if (salary <= 372950)  tax = getSalaryLessOREqualto372950(salary);
        else if (salary <= 400000)  tax = getSalaryLessOREqualto400000(salary);
        System.out.println(tax);
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}


/*
0
8350
33950
82250
Scenario 0
if salary <= 8350
Salary is 8350. then what is tax on it.
0.1 * salary = 835. Please pay 835 dollars.
Scenario 1
if salary <= 33950
Salary is 10,000 . What is the amount that Single person will pay in taxes.
1: (0.1 * 8350) + (salary - 8350) * 0.15

    // single tax bracket $8,351– $33,950 at 15%  So 10,000 - 8350 = new taxable income * 15 = Tax
    // single tax bracket $33,951 – $82,250
    (33,950 – 8,350) at 15%, (82,250 – 33,950) at 25%, (171,550 – 82,250) at 28%, (372,950 – 171,550) at 33%, and (400,000 – 372,950) at 35%.

 */