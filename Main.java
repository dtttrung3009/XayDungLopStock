package XayDungLopStock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        stock stock1= new stock("ORCL","Oracle Corporation");
        System.out.println("ten co phieu la " +stock1.getName()+" ma co phieu la "+stock1.getSymbol());
        System.out.println("nhap gia co phieu cua hom qua");
        double previousClosingPrice= scanner.nextDouble();
        System.out.println("Nhap gia co phieu hom nay ");
        double currentPrice= scanner.nextDouble();
        System.out.println("phan tram chenh lech cua co phieu la "+stock1.getChangePercent(currentPrice,previousClosingPrice));
    }
}
