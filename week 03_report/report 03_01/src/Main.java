//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    String name = "홍길동";
    float moni = 60.96f;
    double clk = 2.8;
    int hdd =500;
    String etc = "방문설치";


    System.out.printf("%s의 모니터는 %.2fCm 입니다. \n", name, moni);
    System.out.printf("%s의 CPU는 %.1fGHz 입니다. \n", name, clk);
    System.out.printf("%s의 하드디스크는 %dHdd입니다. \n", name, hdd);
    System.out.printf("%s의 컴퓨터주문은 %s입니다. \n", name, etc);
}

