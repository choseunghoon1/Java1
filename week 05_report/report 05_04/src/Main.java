//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int price;              // Data
    boolean member;         // Data
    String result;          // Information

    System.out.print("구매 금액 입력 : ");
    price = keyboard.nextInt();

    System.out.print("멤버십 회원 여부(true/false) : ");
    member = keyboard.nextBoolean();

    if (price < 0) {
        result = "Error";
    } else {
        result = (price >= 50000 || (member && price >= 30000))
                ? "무료배송" : "배송비 부과";
    }

    System.out.printf("\n구매 금액 : %,d원\n", price);
    System.out.printf("배송 결과 : %s\n", result);
}