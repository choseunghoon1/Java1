//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int total;                  // Data
    final double VAT = 0.10;   // 부가가치세 10%
    int price;                  // 금액
    int tax;                    // 세금

    System.out.printf("판매금액은 얼마입니까 ? : ");
    total = keyboard.nextInt();

    price = (int) (total / (1 + VAT));
    tax = total - price;

    System.out.printf("\t판매금액 : %,d 원\n", total);
    System.out.printf("\t금액 : %,d 원\n", price);
    System.out.printf("\t세금 : %,d 원\n", tax);
}

