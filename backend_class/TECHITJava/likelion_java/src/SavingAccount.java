public class SavingAccount extends BankAccount implements Withdrawable{
    // BankAccount가 부모 클래스
    boolean isOverdraft;

    void transfer() {}

    // implements로 인터페이스 불러왔으면 반드시 사용해야 됨
    // 외부에서 불러온 함수를 재정의해서 사용할 땐 public 선언!
    public void withdraw() {
        System.out.println("Withdraw");
    }

}
