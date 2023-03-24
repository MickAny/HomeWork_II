import java.util.*;
public class Task_66
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int a = sc.nextInt();
        System.out.println("������� ������ �����: ");
        int b = sc.nextInt();

        System.out.println(a<b?"����� ����� �� a �� b �����: " + RetSum(a, b)
                :a==b?"����� a ����� ����� b!":"����� a ������ ����� b!");
    }

    static int RetSum(int a, int b)
    {
        if(a==b) return b;
        return a + RetSum(a+1, b);
    }
}
/*
������ 66: ������� �������� M � N. �������� ���������, ������� ����� ����� ����������� ��������� � ���������� �� M �� N
        M = 1; N = 15 -> 120
        M = 4; N = 8. -> 30*/




