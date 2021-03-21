package com.GerbertShildt.exercise.exercise41;

class Help {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("Инструкция для if:" +
                        "\nif(условие)" +
                        "\n инструкция;" +
                        "\nelse" +
                        "\n инструкция;");
                break;
            case '2':
                System.out.println("Инструкция для switch:" +
                        "\nswitch(выражение) {" +
                        "\n case константа {" +
                        "\n 2последовательность инструкций;" +
                        "\n break;" +
                        "\n -//- ..." +
                        "\n }" +
                        "\n}");
                break;
            case '3':
                System.out.println("Инструкция для for:" +
                        "\nfor(инициализация; условие; итерация)" +
                        "\n инструкция;");
                break;
            case '4':
                System.out.println("Инструкция для while:" +
                        "\nwhile(условие) " +
                        "\n инструкция;");
                break;
            case '5':
                System.out.println("Инструкция для do-while:" +
                        "\ndo {" +
                        "\n инструкция;" +
                        "\n} while (условие);");
                break;
            case '6':
                System.out.println("Инструкция для break:" +
                        "\nbreak; или break метка; {");
                break;
            case '7':
                System.out.println("Инструкция для continue:" +
                        "\ncontinue; или continue метка; {");
                break;
/*            default:
                System.out.println("Запрос не найден.");*/
        }
        System.out.println();
    }
    void showmenu() {
        System.out.println("Справка:" +
                "\n1. if" +
                "\n2. switch" +
                "\n3. for" +
                "\n4. while" +
                "\n5. do-while" +
                "\n6. break" +
                "\n7. continue" +
                "\nВыберите (q - выход)Э: ");
    }
    boolean isvalid (int ch) {
        if(ch < '1' | ch > '7' & ch != 'q')
            return false;
        else
            return true;
    }
}

public class HelpClassDemo {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for(;;) {
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }   while (ignore != '\n');

            }   while (!hlpobj.isvalid(choice));
            if(choice == 'q')
                break;;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }
    }

}
