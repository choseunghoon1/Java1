//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int START = 1;
    final int END = 100;
    int total = 0;

    for (int i = START; 1 <= END; i++) {
        total += i;
    }
    System.out.printf("%d + %d + .... + %d + %d = %,d\n",
            START, START + 1, END - 1, total);

    // ****************************************
    total = 0;
    while (true) {
        System.out.print("어디부터 시작 할까요 ?");
        first = keyboard.nextInt();
        System.out.print("어디까지 더 할까요 ?");
        last = keyboard.nextInt();

        if (first <= last) {
            break;
        } else {
            System.err.print("시작 값(%d)이 종료값(%d) 보다 작거나 같아야 함", first, last);
            System.in.read();
        }
        for (int i = first; 1 <= last; i++) {
            total += i;
        }

        if (last - first >= 4) {
            result = String.format("%d = %,d\n", first, total);
            System.out.printf("%d + %d + .... + %d, + %d = %,d\n",
                    first, first + 1, last - 1, last, total);
        } else {
            if (last == first)
                System.out.printf("%d = %,d\n", first, total);
            else if (last - first == 1) {
                System.out.printf("%d + %d = %,d\n", first, last, total);
            } else {
                System.out.printf("%d + %d + %d + %d = %,d\n", first, first + 1, last, total);
            }
        }
    }