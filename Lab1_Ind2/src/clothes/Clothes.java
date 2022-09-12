package clothes;
import java.util.Scanner;

//клас у вигляді структури
class Man{
    String fam, im, otch;
    int age, rozmir;
}

class RecordCountry2 {
// МЕТОДИ ДЛЯ ВСІХ ПІДЗАДАЧ для роботи з об'єктами класу Man

    public static Man[] setManArr(int k) {
// Введення масиву лююдей
        Scanner sc = new Scanner(System.in, "cp1251");
        Man sotr[] = new Man[k];

        System.out.println("Введіть інформацію про людей: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Man();
            // Присвоєння значень полям
            System.out.print("Введіть прізвище " + (i + 1) + " людини => ");
            sotr[i].fam = sc.nextLine();

            System.out.print("Введіть його ім'я => ");
            sotr[i].im = sc.nextLine();

            System.out.print("Введіть його по батькові => ");
            sotr[i].otch = sc.nextLine();

            System.out.print("Введіть його вік => ");
            sotr[i].age = sc.nextInt();

            System.out.print("Введіть його розмір => ");
            sotr[i].rozmir = sc.nextInt();
            sc.nextLine(); //очищення буфера
        }                  // end for
        return sotr;
    }

    public static void showArray (Man [] cntr) {
// Виведення масиву
        for (int i = 0; i < cntr.length; i++) {
            System.out.println(cntr[i].fam+ "\t"+cntr[i].im + "\t"+cntr[i].otch
                    + "\t" +cntr[i].age + "\t\t"+cntr[i].rozmir);
        }

    }



    public static void showMan	(Man cntr){
// Інформація про одну людину
        System.out.println(cntr.fam + "\t" + cntr.im + "\t" + cntr.otch
                + "\t" +cntr.age + "\t\t" + cntr.rozmir);
    }

    public static int NomMax	(Man []st) {
// Виведення інформації про людину з найбільшим розміром
        int nommax=0;                        //максимальна площа
        int doublemax = st[nommax].rozmir; // (початкове значення)
        for (int i = 0; i < st.length; i++) if (st[i].rozmir>doublemax) {
            doublemax = st[i].rozmir;
            nommax=i;
        } // end for
        return nommax;
    }

    public static void showMaxMan	(Man []cntr) {
        //визначити середній розмір одягу для людей віком від 40 років
        int serRoz = 0;     //сер розмір 40+ початкове значення
        int kolvo40 = 0; // к-сть людей 40+ початкове значення
        for (int i = 0; i < cntr.length; i++)
            if (cntr[i].age > 39) {
                serRoz = serRoz + cntr[i].rozmir;
                kolvo40 = kolvo40 + 1;
            } // end for
        serRoz = serRoz / kolvo40;
        System.out.println("\nCередній розмір одягу для людей віком від 40 років :");
        System.out.println(""
                + serRoz);
    }

    public static void sortRozmir	(Man [] sotr) {
//упорядкувати масив за зростанням розміру одягу;
        for (int i = 0; i < sotr.length-1; i++)
            for (int j = 0; j < sotr.length-1-i; j++)
                if (sotr[j].rozmir>sotr[j+1].rozmir){
                    Man rab=sotr[j];   //rab – робоча змінна для перестановки
                    sotr [j] = sotr [j + 1];
                    sotr [j + 1] = rab;
                }
    }

    public static void findForNameAndChaange(Man sotr []) {
//пошук за прізвищем, виправлення одного з полів та виведення повної інформації про людину після редагування
        Scanner s = new Scanner(System.in, "cp1251");
        s.nextLine();        // очищення буфера
        System.out.println("Введіть прізвище шуканої людини=>");
        String name=s.nextLine();
        int nom = -1;         //?1 – людина з шуканою назвою відсутня
        for (int i = 0; i < sotr.length; i++)
            if (name.equalsIgnoreCase(sotr[i].fam)) nom = i;
        if (nom != -1) {
            System.out.println("Така людина є у списку.");
            System.out.println("Інформація :\n фам\tім'я\tотч\t вік \tрозмір");
            System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                    + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
            //зміна інформації
            System.out.println("Ви хочете змінити дані цієї людини?(Так - '1'; Ні - '-1')");
            int otvet = -1;        //?1 – інформацію не потрібно змінювати
            otvet = s.nextInt();
            s.nextLine();

            if (otvet != -1) {
                // Присвоєння значень полям
                System.out.print("Введіть прізвище " + (nom + 1) + " людини => ");
                sotr[nom].fam = s.nextLine();

                System.out.print("Введіть його ім'я => ");
                sotr[nom].im = s.nextLine();

                System.out.print("Введіть його по батькові => ");
                sotr[nom].otch = s.nextLine();

                System.out.print("Введіть його вік => ");
                sotr[nom].age = s.nextInt();

                System.out.print("Введіть його розмір => ");
                sotr[nom].rozmir = s.nextInt();
                System.out.println("\nІнформація :\n фам\tім'я\tотч\t вік \tрозмір");
                System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                        + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
            }
        }
    }
}


//головний клас
public class Clothes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");

        System.out.println("Введіть кількість людей => ");
        int kol = sc.nextInt();
        sc.nextLine(); //очищення буфера після введення числа

        RecordCountry2 r = new RecordCountry2();

        Man man[] = r.setManArr(kol);    // Введення інформації про країни

        System.out.println("\nХарактеристики людей:");
        r.showArray(man);            // Виведення отриманої інформації
        // Людина з максимальним розміром
        int nommax = r.NomMax(man);
        System.out.println("\nЛюдина з максимальним розміром:");
        r.showMan(man[nommax]);

        //визначити середній розмір одягу для людей віком від 40 років
        r.showMaxMan(man);

        //упорядкувати масив за зростанням розміру одягу;
        r.sortRozmir(man);
        System.out.println("\nВідсортований список за площею:");
        r.showArray(man);

        //пошук за прізвищем, виправлення одного з полів та виведення повної інформації про людину після редагування

        r.findForNameAndChaange(man);

        }
    }
