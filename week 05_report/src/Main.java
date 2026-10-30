//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int a, b, c;         // Data
    String result;       // Information

    System.out.print("3개의 정수를 입력하세요 : ");
    a = keyboard.nextInt();
    b = keyboard.nextInt();
    c = keyboard.nextInt();

    if (a > 0 && b > 0 && c > 0) {
        result = "모두 양수";
    } else if (a < 0 || b < 0 || c < 0) {
        result = "음수 포함";
    } else if (a == 0 && b == 0 && c == 0) {
        result = "모두 0";
    } else {
        result = "양수와 0 포함";
    }

    System.out.println(result);
}
