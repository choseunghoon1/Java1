//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius; // 원의 반지름

    double diameter;
    double 정사각형의면적;
    double 원의면적;
    double 구하는면적;

    System.out.print("원의반지름 입력 : ");
    radius = keyboard.nextInt();
    diameter = radius * 2.0;
    정사각형의면적 = diameter * diameter;
    원의면적 = 3.141592 * radius * radius;
    구하는면적 = 정사각형의면적 - 원의면적;

    System.out.printf("원의 반지름 : %,d\n", radius);
    System.out.printf("정사각형 면적 : %,f cm2\n", 정사각형의면적);
    System.out.printf("원의 면적 : %,f cm2\n", 원의면적);
    System.out.printf("구하는 면적 : %,f cm2\n", 구하는면적);
}

//  Scanner keyboard = new Scanner(System.in);
//  int base;
//  int 사각형면적;
//  double radius;
//  double 원의면적;
//  final double P1 = 3.141592;
//  double area;
//
//
//
//
//  System.out.print("원의반지름 입력 : ");
//  base = keyboard.nextInt();
//  사각형면적 = base * base;
//  radius = base / 2.0;
//  원의면적 = P1 * radius * radius;
//  area = 사각형면적 - 원의면적;
//
//  System.out.printf("한 변의 길이가 %,d Cm인 정사각형의 면적은 %,d \u33a0\n", base, 사각형의면적);
//  System.out.printf("반 지름이 %,.2f Cm인 원의 면적은 %,2.f \u33a0\n", radius, 원의면적);
//  System.out.printf("구하는 면적 : %,.2f \u33a0\n", area);
//
//
//
//
