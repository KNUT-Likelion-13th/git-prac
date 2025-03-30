package 윤정환;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"가위", "바위", "보"};

        System.out.println("'가위', '바위', '보' 중 하나를 입력하시오 ('그만' 입력시 종료)");
        while (true) {
            String userChoice = scanner.nextLine();
            int comIndex = (int) (Math.random() * 3);
            String comChoice = choices[comIndex];

            if ("그만".equalsIgnoreCase(userChoice)) {
                System.out.println("게임을 종료합니다");
                break;
            }

            if (!isValidChoice(userChoice)) {
                System.out.println("잘못된 입력입니다");
                continue;
            }

            System.out.println("User : " + userChoice);
            System.out.println("Computer : " + comChoice);

            checkVictory(userChoice, comChoice);
        }
    }

    private static boolean isValidChoice(String userChoice) {
        return "가위".equals(userChoice) || "바위".equals(userChoice) || "보".equals(userChoice);
    }

    private static void checkVictory(String userChoice, String comChoice) {
        if (userChoice.equals(comChoice)) {
            System.out.println("비겼습니다");
        } else if ((userChoice.equals("가위") && comChoice.equals("보")) ||
                (userChoice.equals("바위") && comChoice.equals("가위")) ||
                (userChoice.equals("보") && comChoice.equals("바위"))) {
            System.out.println("사용자 승리");
        } else {
            System.out.println("컴퓨터 승리");
        }
    }
}
