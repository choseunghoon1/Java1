//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    float weight;       // Data
    final float MOON_GRAVITY = 0.165f;   // 상수
    float moon;         // Information

    System.out.printf("당신의 몸무게는 얼마입니까 ?(Kg) : ");
    weight = keyboard.nextFloat();

    moon = weight * MOON_GRAVITY;

    System.out.printf("\t지구에서의 몸무게 : %.2f Kg\n", weight);
    System.out.printf("\t달에서의 몸무게 : %.2f Kg\n", moon);
}
