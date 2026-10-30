//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int totalSeconds;
    int hour, minute, second;

    System.out.print("초를 입력하세요 : ");
    totalSeconds = keyboard.nextInt();

    hour = totalSeconds / 3600;
    minute = (totalSeconds % 3600) / 60;
    second = totalSeconds % 60;

    System.out.printf("\n%d초 = %d시간 %d분 %d초\n",
            totalSeconds, hour, minute, second);
}
