package firma;
import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
}
public class Firma{		// �������� ����
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");

        System.out.println("������ ������� ����������� => ");
        int kol=sc.nextInt();
        sc.nextLine();				//�������� ������ ���� �������� �����

        Sotrudnik[]sotr=new Sotrudnik[kol];//�������� ��������� �� �����
// �����������
        System.out.println("������ ���������� ��� ������� �����������:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Sotrudnik();	// �������� ��������� �� i-��� �������

// ��������� ������� �����
            System.out.print("������ ������� "+(i+1)+" ����������� => ");
            sotr [i]. fam = sc.nextLine ();

            System.out.print("������ ���� ��'� => ");
            sotr[i].im=sc.nextLine();

            System.out.print("������ ���� �� ������� => ");
            sotr[i].otch=sc.nextLine();

            System.out.print("������ ���� ������ => ");
            sotr[i].doljnost=sc.nextLine();

            System.out.print("������ ���� ����� => ");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine(); 				//�������� ������
        } 							// end for
// ��������� ���������� ��� �����������
        System.out.println("\n����������� �����:\n ���\t��'�\t���\t ������ \t�����");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam+ "\t"+sotr[i].im + "\t"+sotr[i].otch
                    + "\t" +sotr[i].doljnost + "\t\t"+sotr[i].oklad);
        }

    }

}

