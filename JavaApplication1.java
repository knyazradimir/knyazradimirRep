/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Esper
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String vremyagoda="Жигули";
                switch (vremyagoda) {
                    case "Январь": case "Ферваль": case "Декабрь":
                        vremyagoda="Зима";
                        break;
                    case "Март": case "Апрель": case "Май":
                        vremyagoda="Весна";
                        break;
                    case "Июнь": case "Июль": case "Август":
                        vremyagoda="Лето";
                        break;
                    case "Сентябрь": case "Октябрь": case "Ноябрь":
                        vremyagoda="Осень";
                        break;
                    default:
                        vremyagoda="Не понял";
                        System.out.println(vremyagoda);
                        break;
                }
                if (vremyagoda!="Не понял")
                    System.out.println("У Вас сейчас "+vremyagoda);
    } 
}
