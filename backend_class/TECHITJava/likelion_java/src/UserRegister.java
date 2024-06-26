import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("회원등록");
        System.out.println("===================");

        boolean register = false;
        Scanner sc = new Scanner(System.in);

        // 왜 while? => 사용자에게 다시 입력받아야 할 때마다 반복하기 위해
        while (!register) {
            System.out.println("회원가입을 하시겠습니까?\ny: 진행    N:취소");
            System.out.print(">> ");
            String register_input = sc.nextLine();

            if (register_input.equalsIgnoreCase("y")) {     // equalsIgnoreCase로 하면 Y, y 다 인식
                register = true;
                System.out.println("===================");
                System.out.println("회원가입이 진행됩니다");
                System.out.println("===================");
            } else if (register_input.equalsIgnoreCase("n")) {
                System.out.println("===================");
                System.out.println("회원가입이 종료됩니다");
                System.out.println("===================");
                System.exit(0);
            } else {
                System.out.println("입력값을 확인해주세요.");
            }
        }

        ArrayList<Object> users = new ArrayList<>();

        // 추가로 가입할 지 묻기 위해 while
        while (true) {

            HashMap<Object, Object> user = new HashMap<>();

            // ID (username)
            System.out.print("ID: ");
            String username = sc.nextLine();

            // PW
            String password = "";
            while (true) {
                System.out.print("PW: ");
                password = sc.nextLine();
                System.out.print("PW 확인: ");
                String password_confirm = sc.nextLine();

                if (password.equals(password_confirm)) {
                    break;
                } else {
                    System.out.println("===================");
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    System.out.println("비밀번호를 다시 입력해주세요.");
                    System.out.println("===================");
                }
            }

            // 이름
            System.out.print("성명: ");
            String name = sc.nextLine();

            // 생년월일(6자리)
            String birth_date = "";
            while (true) {
                System.out.print("생년월일(6자리): ");
                birth_date = sc.nextLine();
                if (birth_date.length() == 6) {
                    break;
                } else {
                    System.out.println("===================");
                    System.out.println("생년월일 자릿수가 올바르지 않습니다.");
                    System.out.println("생년월일을 다시 입력해주세요.");
                    System.out.println("===================");
                }
            }

            // 이메일
            System.out.print("이메일: ");
            String email = sc.nextLine();

            user.put("username", username);
            user.put("password", password);
            user.put("name", name);
            user.put("birth_date", birth_date);
            user.put("email", email);

            users.add(user);

            System.out.println("===================");
            System.out.println(user.get("name") + "님, 가입을 환영합니다");
            System.out.println("ID는 " + user.get("username") + "입니다.");
            System.out.println("===================");


            System.out.println("회원가입을 이어서 진행하시겠습니까?\ny: 진행    N:취소");
            System.out.print(">> ");
            String register_again = sc.nextLine();

            if (register_again.equalsIgnoreCase("y")) {
                System.out.println("haha");
            } else if (register_again.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }
    }
}
