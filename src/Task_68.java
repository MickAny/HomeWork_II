import java.util.*;

public class Task_68
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int a = sc.nextInt();
        System.out.println("������� ������ �����: ");
        int b = sc.nextInt();

        System.out.println("���������� ������� ���������: "+ Function(a, b));
    }

    static int Function(int a, int b)
    {
        if (a==0)   return b+1;
        else if ((a!=0)&&(b==0))  return Function(a-1,1);
        else return Function(a-1, Function(a,b-1));
    }
}
/*
������ 68: �������� ��������� ���������� ������� ��������� � ������� ��������. ���� ��� ��������������� ����� m � n.
        m = 2, n = 3 -> A(m,n) = 9
        m = 3, n = 2 -> A(m,n) = 29*/