package clothes;
import java.util.Scanner;

//���� � ������ ���������
class Man{
    String fam, im, otch;
    int age, rozmir;
}

//�������� ����
public class Clothes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");

        System.out.println("������ ������� ����� => ");
        int kol=sc.nextInt();
        sc.nextLine(); //�������� ������ ���� �������� �����

        Man[]sotr=new Man[kol]; //�������� ��������� �� ������

        System.out.println("������ ���������� ��� ����� ������:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Man(); // �������� ��������� �� i-��� �������

            // ��������� ������� �����
            System.out.print("������ ������� "+(i+1)+" ������ => ");
            sotr [i]. fam = sc.nextLine ();

            System.out.print("������ ���� ��'� => ");
            sotr[i].im=sc.nextLine();

            System.out.print("������ ���� �� ������� => ");
            sotr[i].otch=sc.nextLine();

            System.out.print("������ ���� �� => ");
            sotr[i].age=sc.nextInt();

            System.out.print("������ ���� ����� => ");
            sotr[i].rozmir=sc.nextInt();
            sc.nextLine(); //�������� ������
        }                  // end for

        // ��������� ���������� ��� �����
        System.out.println("\n���������� �����:\n ���\t��'�\t���\t �� \t�����");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam+ "\t"+sotr[i].im + "\t"+sotr[i].otch
                    + "\t" +sotr[i].age + "\t\t"+sotr[i].rozmir);

        }
        // ��������� ���������� ��� ������ � ��������� �������
        int nommax=0;                        //����������� �����
        int doublemax = sotr[nommax].rozmir; // (��������� ��������)
        for (int i = 0; i < sotr.length; i++) if (sotr[i].rozmir>doublemax) {
            doublemax = sotr[i].rozmir;
            nommax=i;
        } // end for
        System.out.println("\n������ � ��������� ������� :"); System.out.println(""
                +sotr[nommax].fam+"\t"+sotr[nommax].im+"\t"+sotr[nommax].rozmir);

        //��������� ������� ����� ����� ��� ����� ���� �� 40 ����
        int serRoz=0;     //��� ����� 40+ ��������� ��������
        int kolvo40 = 0; // �-��� ����� 40+ ��������� ��������
        for (int i = 0; i < sotr.length; i++) if (sotr[i].age>39) {
            serRoz = serRoz + sotr[i].rozmir;
            kolvo40=kolvo40+1;
        } // end for
        serRoz = serRoz/kolvo40;
        System.out.println("\nC������ ����� ����� ��� ����� ���� �� 40 ���� :"); System.out.println(""
                +serRoz);

        //������������ ����� �� ���������� ������ �����;
        for (int i = 0; i < sotr.length-1; i++)
            for (int j = 0; j < sotr.length-1-i; j++)
                if (sotr[j].rozmir>sotr[j+1].rozmir){
                    Man rab=sotr[j];	//rab � ������ ����� ��� ������������
                    sotr [j] = sotr [j + 1];
                    sotr [j + 1] = rab;
                }
        System.out.println("\n³����������� ������ �� ������:");
        System.out.println("���������� �����:\n ���\t��'�\t���\t �� \t�����");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam + "\t" + sotr[i].im + "\t" + sotr[i].otch
                    + "\t" + sotr[i].age + "\t\t" + sotr[i].rozmir);
        }
            //����� �� ��������, ����������� ������ � ���� �� ��������� ����� ���������� ��� ������ ���� �����������
            sc.nextLine();			 // �������� ������
            System.out.println("������ ������� ������ ������=>");
            String name=sc.nextLine();
            int nom= -1;			//?1 � ������ � ������� ������ �������
            for (int i = 0; i < sotr.length; i++)
                if (name.equalsIgnoreCase(sotr[i].fam)) nom=i;
            if (nom != -1) {
                System.out.println("���� ������ � � ������.");
                System.out.println("���������� :\n ���\t��'�\t���\t �� \t�����");
                System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                                + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
                //���� ����������
                System.out.println("�� ������ ������ ��� ���� ������?(��� - '1'; ͳ - '-1')");
                int otvet=-1;			//?1 � ���������� �� ������� ��������
                otvet=sc.nextInt();
                sc.nextLine();
                if (otvet != -1) {
                    // ��������� ������� �����
                    System.out.print("������ ������� "+(nom+1)+" ������ => ");
                    sotr[nom].fam = sc.nextLine();

                    System.out.print("������ ���� ��'� => ");
                    sotr[nom].im=sc.nextLine();

                    System.out.print("������ ���� �� ������� => ");
                    sotr[nom].otch=sc.nextLine();

                    System.out.print("������ ���� �� => ");
                    sotr[nom].age=sc.nextInt();

                    System.out.print("������ ���� ����� => ");
                    sotr[nom].rozmir=sc.nextInt();
                    System.out.println("\n���������� �����:\n ���\t��'�\t���\t �� \t�����");
                    System.out.println(sotr[nom].fam + "\t" + sotr[nom].im + "\t" + sotr[nom].otch
                            + "\t" + sotr[nom].age + "\t\t" + sotr[nom].rozmir);
            }else System.out.println("���� ������ ���� � ������");
        }
    }
}
