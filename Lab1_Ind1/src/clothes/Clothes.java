package clothes;
import java.util.Scanner;

//клас у вигляді структури
class Man{
    String fam, im, otch;
    int age, rozmir;
}

//головний клас
public class Clothes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");

        System.out.println("Введіть кількість людей => ");
        int kol=sc.nextInt();
        sc.nextLine(); //очищення буфера після введення числа

        Man[]sotr=new Man[kol]; //отримано посилання на массив

        System.out.println("Введіть інформацію про кожну людину:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Man(); // отримано посилання на i-тий елемент

            // Присвоєння значень полям
            System.out.print("Введіть прізвище "+(i+1)+" людини => ");
            sotr [i]. fam = sc.nextLine ();

            System.out.print("Введіть його ім'я => ");
            sotr[i].im=sc.nextLine();

            System.out.print("Введіть його по батькові => ");
            sotr[i].otch=sc.nextLine();

            System.out.print("Введіть його вік => ");
            sotr[i].age=sc.nextInt();

            System.out.print("Введіть його розмір => ");
            sotr[i].rozmir=sc.nextInt();
            sc.nextLine(); //очищення буфера
        }                  // end for

        // Виведення інформації про людей
        System.out.println("\nІнформація людей:\n фам\tім'я\tотч\t вік \tрозмір");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam+ "\t"+sotr[i].im + "\t"+sotr[i].otch
                    + "\t" +sotr[i].age + "\t\t"+sotr[i].rozmir);

        }
        // Виведення інформації про людину з найбільшим розміром
        int nommax=0;                        //максимальна площа
        int doublemax = sotr[nommax].rozmir; // (початкове значення)
        for (int i = 0; i < sotr.length; i++) if (sotr[i].rozmir>doublemax) {
            doublemax = sotr[i].rozmir;
            nommax=i;
        } // end for
        System.out.println("\nЛюдина з найбільшим розміром :"); System.out.println(""
                +sotr[nommax].fam+"\t"+sotr[nommax].im+"\t"+sotr[nommax].rozmir);

        //визначити середній розмір одягу для людей віком від 40 років
        int serRoz=0;     //сер розмір 40+ початкове значення
        int kolvo40 = 0; // к-сть людей 40+ початкове значення
        for (int i = 0; i < sotr.length; i++) if (sotr[i].age>39) {
            serRoz = serRoz + sotr[i].rozmir;
            kolvo40=kolvo40+1;
        } // end for
        serRoz = serRoz/kolvo40;
        System.out.println("\nCередній розмір одягу для людей віком від 40 років :"); System.out.println(""
                +serRoz);

        //упорядкувати масив за зростанням розміру одягу;
        for (int i = 0; i < sotr.length-1; i++)
            for (int j = 0; j < sotr.length-1-i; j++)
                if (sotr[j].rozmir>sotr[j+1].rozmir){
                    Man rab=sotr[j];	//rab – робоча змінна для перестановки
                    sotr [j] = sotr [j + 1];
                    sotr [j + 1] = rab;
                }
        System.out.println("\nВідсортований список за роміром:");
        System.out.println("Інформація людей:\n фам\tім'я\tотч\t вік \tрозмір");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam + "\t" + sotr[i].im + "\t" + sotr[i].otch
                    + "\t" + sotr[i].age + "\t\t" + sotr[i].rozmir);
        }
            //пошук за прізвищем, виправлення одного з полів та виведення повної інформації про людину після редагування
            sc.nextLine();			 // очищення буфера
            System.out.println("Введіть прізвище шуканої людини=>");
            String name=sc.nextLine();
            int nom= -1;			//?1 – людина з шуканою назвою відсутня
            for (int i = 0; i < sotr.length; i++)
                if (name.equalsIgnoreCase(sotr[i].fam)) nom=i;
            if (nom != -1) {
                System.out.println("Така людина є у списку.");
                System.out.println("Інформація :\n фам\tім'я\tотч\t вік \tрозмір");
                System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                                + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
                //зміна інформації
                System.out.println("Ви хочете змінити дані цієї людини?(Так - '1'; Ні - '-1')");
                int otvet=-1;			//?1 – інформацію не потрібно змінювати
                otvet=sc.nextInt();
                sc.nextLine();
                if (otvet != -1) {
                    // Присвоєння значень полям
                    System.out.print("Введіть прізвище "+(nom+1)+" людини => ");
                    sotr[nom].fam = sc.nextLine();

                    System.out.print("Введіть його ім'я => ");
                    sotr[nom].im=sc.nextLine();

                    System.out.print("Введіть його по батькові => ");
                    sotr[nom].otch=sc.nextLine();

                    System.out.print("Введіть його вік => ");
                    sotr[nom].age=sc.nextInt();

                    System.out.print("Введіть його розмір => ");
                    sotr[nom].rozmir=sc.nextInt();
                    System.out.println("\nІнформація людей:\n фам\tім'я\tотч\t вік \tрозмір");
                    System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                            + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
            }else System.out.println("Такої людини немає у списку");
        }
    }
}
