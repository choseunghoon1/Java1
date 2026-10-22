//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String school;
    String name;
    int age;
    char gender;
    float height;
    double weight;

    System.out.print("학교를 입력하세요 : ");
    school = keyboard.nextLine();
    System.out.print("이름을 입력하세요 : ");
    name = keyboard.nextLine();
    System.out.print("나이를 입력하세요 : ");
    age = keyboard.nextInt();
    System.out.print("성별을 입력하세요 : ");
    gender = keyboard.next().charAt(0);
    System.out.print("신장을 입력하세요 : ");
    height = keyboard.nextFloat();
    System.out.print("체중을 입력하세요 : ");
    weight = keyboard.nextDouble();

    System.out.println("********************");
    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %c\n", gender);
    System.out.printf("신장 : %.1fCm\n", height);
    System.out.printf("체중 : %.1fKg\n", weight);
    System.out.println("********************");
}
