import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class ex {
    public static void main(String[] args) {
        DecimalFormat formater = new DecimalFormat("0.00");
        
        String userChoice = JOptionPane.showInputDialog("*** Menu de opções *** \n 1. Novo Salário \n 2.Férias \n 3. Décimo Terceiro \n 4. Impostos \n 5. Sair" );

        Integer userChoicesNumber = Integer.valueOf(userChoice);

        int firstStep = 1;
        int secondStep = 2;
        int thirdStep = 3;
        int fourthStep = 4;

        int finish = 5;

        // variaveis para guardar dados do usuário

        String userSalary;
        double salary;
        int convertToNumber;

        String months;

        while (userChoicesNumber < finish) {
            if (userChoicesNumber == firstStep) {
                userSalary = JOptionPane.showInputDialog(null, "Infome seu salário");
                convertToNumber = Integer.valueOf(userSalary);

                if(convertToNumber <= 3500){
                    float calcNewSalary = convertToNumber * 10 / 100;
                    salary = convertToNumber + calcNewSalary;
                    JOptionPane.showMessageDialog(null, "Seu novo salário é: " + salary);
                    break;
                
                }else if(convertToNumber >= 3500 && convertToNumber <= 6000){
                    float calcNewSalary = convertToNumber * 10 / 100;
                    salary = convertToNumber + calcNewSalary;
                    JOptionPane.showMessageDialog(null, "Seu novo salário é: " + salary);
                    break;
                
                }else if(convertToNumber >= 6000) {
                    float calcNewSalary = convertToNumber * 8 / 100;
                    salary = convertToNumber + calcNewSalary;
                    JOptionPane.showMessageDialog(null, "Seu novo salário é: " + salary);
                    break;
                
                }
            
            }else if(userChoicesNumber == secondStep){
                userSalary = JOptionPane.showInputDialog("Informe seu salário");
                convertToNumber = Integer.valueOf(userSalary);
                float calcNewSalary = convertToNumber / 3;
                salary = convertToNumber + calcNewSalary;

                JOptionPane.showMessageDialog(null, "O valor das suas férias é: " + formater.format(salary));
                
                break;
            
            }else if(userChoicesNumber == thirdStep){
                userSalary = JOptionPane.showInputDialog(null, "Informe seu salário");
                convertToNumber = Integer.valueOf(userSalary);

                months = JOptionPane.showInputDialog(null, "Informe o número de meses que você trabalha");
                int convertToNumberMonths = Integer.valueOf(months);

                if(convertToNumberMonths > 12){
                    JOptionPane.showMessageDialog(null, "insira um valor de 1 a 12");
                }
                
                float calc = (convertToNumber * convertToNumberMonths) / 12;

                salary = convertToNumber + calc;

                JOptionPane.showMessageDialog(null, "Seu decimo terceiro é :"+ salary);

                break;
            
            }else if(userChoicesNumber == fourthStep){
                userSalary = JOptionPane.showInputDialog(null, "Informe seu salário");
                convertToNumber = Integer.valueOf(userSalary);

                
                if(convertToNumber <= 1100){
                    Double calcNewSalary = convertToNumber * 7.5 / 100;
                    JOptionPane.showMessageDialog(null, "Você paga de imposto um total de : " + calcNewSalary);
                    
                
                }else if(convertToNumber >= 1100 && convertToNumber <= 2204){
                    Double calcNewSalary = convertToNumber * 9.0 / 100;
                    JOptionPane.showMessageDialog(null, "Você paga de imposto um total de : " + calcNewSalary);
                    
                
                }else if(convertToNumber >= 2203.50 && convertToNumber <= 3305.22) {
                    float calcNewSalary = convertToNumber * 12 / 100;
                    JOptionPane.showMessageDialog(null, "Seu novo salário é: " + calcNewSalary);
                    
                
                }else if(convertToNumber >= 3305.23 && convertToNumber <= 6433.57) {
                    float calcNewSalary = convertToNumber * 14 / 100;
                    JOptionPane.showMessageDialog(null, "Seu novo salário é: " + calcNewSalary);
                    
                
                }

                months = JOptionPane.showInputDialog(null, "Informe o número de meses que você trabalhou: ");
                int convertToNumberMonths = Integer.valueOf(months);


                if(convertToNumber > 1 ){

                
                }
            
            } else {
                break;
            }
        
        }
    }
}
