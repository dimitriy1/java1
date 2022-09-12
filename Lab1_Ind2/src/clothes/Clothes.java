package clothes;
import java.util.Scanner;

//���� � ������ ���������
class Man{
    String fam, im, otch;
    int age, rozmir;
}

class RecordCountry2 {
// ������ ��� �Ѳ� ϲ������ ��� ������ � ��'������ ����� Man

    public static Man[] setManArr(int k) {
// �������� ������ ������
        Scanner sc = new Scanner(System.in, "cp1251");
        Man sotr[] = new Man[k];

        System.out.println("������ ���������� ��� �����: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Man();
            // ��������� ������� �����
            System.out.print("������ ������� " + (i + 1) + " ������ => ");
            sotr[i].fam = sc.nextLine();

            System.out.print("������ ���� ��'� => ");
            sotr[i].im = sc.nextLine();

            System.out.print("������ ���� �� ������� => ");
            sotr[i].otch = sc.nextLine();

            System.out.print("������ ���� �� => ");
            sotr[i].age = sc.nextInt();

            System.out.print("������ ���� ����� => ");
            sotr[i].rozmir = sc.nextInt();
            sc.nextLine(); //�������� ������
        }                  // end for
        return sotr;
    }

    public static void showArray (Man [] cntr) {
// ��������� ������
        for (int i = 0; i < cntr.length; i++) {
            System.out.println(cntr[i].fam+ "\t"+cntr[i].im + "\t"+cntr[i].otch
                    + "\t" +cntr[i].age + "\t\t"+cntr[i].rozmir);
        }

    }



    public static void showMan	(Man cntr){
// ���������� ��� ���� ������
        System.out.println(cntr.fam + "\t" + cntr.im + "\t" + cntr.otch
                + "\t" +cntr.age + "\t\t" + cntr.rozmir);
    }

    public static int NomMax	(Man []st) {
// ��������� ���������� ��� ������ � ��������� �������
        int nommax=0;                        //����������� �����
        int doublemax = st[nommax].rozmir; // (��������� ��������)
        for (int i = 0; i < st.length; i++) if (st[i].rozmir>doublemax) {
            doublemax = st[i].rozmir;
            nommax=i;
        } // end for
        return nommax;
    }

    public static void showMaxMan	(Man []cntr) {
        //��������� ������� ����� ����� ��� ����� ���� �� 40 ����
        int serRoz = 0;     //��� ����� 40+ ��������� ��������
        int kolvo40 = 0; // �-��� ����� 40+ ��������� ��������
        for (int i = 0; i < cntr.length; i++)
            if (cntr[i].age > 39) {
                serRoz = serRoz + cntr[i].rozmir;
                kolvo40 = kolvo40 + 1;
            } // end for
        serRoz = serRoz / kolvo40;
        System.out.println("\nC������ ����� ����� ��� ����� ���� �� 40 ���� :");
        System.out.println(""
                + serRoz);
    }

    public static void sortRozmir	(Man [] sotr) {
//������������ ����� �� ���������� ������ �����;
        for (int i = 0; i < sotr.length-1; i++)
            for (int j = 0; j < sotr.length-1-i; j++)
                if (sotr[j].rozmir>sotr[j+1].rozmir){
                    Man rab=sotr[j];   //rab � ������ ����� ��� ������������
                    sotr [j] = sotr [j + 1];
                    sotr [j + 1] = rab;
                }
    }

    public static void findForNameAndChaange(Man sotr []) {
//����� �� ��������, ����������� ������ � ���� �� ��������� ����� ���������� ��� ������ ���� �����������
        Scanner s = new Scanner(System.in, "cp1251");
        s.nextLine();        // �������� ������
        System.out.println("������ ������� ������ ������=>");
        String name=s.nextLine();
        int nom = -1;         //?1 � ������ � ������� ������ �������
        for (int i = 0; i < sotr.length; i++)
            if (name.equalsIgnoreCase(sotr[i].fam)) nom = i;
        if (nom != -1) {
            System.out.println("���� ������ � � ������.");
            System.out.println("���������� :\n ���\t��'�\t���\t �� \t�����");
            System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                    + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
            //���� ����������
            System.out.println("�� ������ ������ ��� ���� ������?(��� - '1'; ͳ - '-1')");
            int otvet = -1;        //?1 � ���������� �� ������� ��������
            otvet = s.nextInt();
            s.nextLine();

            if (otvet != -1) {
                // ��������� ������� �����
                System.out.print("������ ������� " + (nom + 1) + " ������ => ");
                sotr[nom].fam = s.nextLine();

                System.out.print("������ ���� ��'� => ");
                sotr[nom].im = s.nextLine();

                System.out.print("������ ���� �� ������� => ");
                sotr[nom].otch = s.nextLine();

                System.out.print("������ ���� �� => ");
                sotr[nom].age = s.nextInt();

                System.out.print("������ ���� ����� => ");
                sotr[nom].rozmir = s.nextInt();
                System.out.println("\n���������� :\n ���\t��'�\t���\t �� \t�����");
                System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                        + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
            }
        }
    }
}


//�������� ����
public class Clothes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");

        System.out.println("������ ������� ����� => ");
        int kol = sc.nextInt();
        sc.nextLine(); //�������� ������ ���� �������� �����

        RecordCountry2 r = new RecordCountry2();

        Man man[] = r.setManArr(kol);    // �������� ���������� ��� �����

        System.out.println("\n�������������� �����:");
        r.showArray(man);            // ��������� �������� ����������
        // ������ � ������������ �������
        int nommax = r.NomMax(man);
        System.out.println("\n������ � ������������ �������:");
        r.showMan(man[nommax]);

        //��������� ������� ����� ����� ��� ����� ���� �� 40 ����
        r.showMaxMan(man);

        //������������ ����� �� ���������� ������ �����;
        r.sortRozmir(man);
        System.out.println("\n³����������� ������ �� ������:");
        r.showArray(man);

        //����� �� ��������, ����������� ������ � ���� �� ��������� ����� ���������� ��� ������ ���� �����������

        r.findForNameAndChaange(man);

        }
    }
