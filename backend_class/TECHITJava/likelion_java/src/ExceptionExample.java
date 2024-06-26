import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {
        // 예외(Exceptions): 대표적인 에러라 자바가 예측 가능한 에러
        // 조치 없으면 프로그램 종료될지도
        // 회피하거나 알림 띄울 수 있도록 조치

        // 1. 0으로 나누는 경우
//        int a = 10;
//        int b = 0;
//
//        int c = a / b;

        // 2. 범위에서 벗어나는 경우(존재하지 않는 인덱스 호출)
        ArrayList<Integer> arrayList = new ArrayList<>(3);
//        arrayList.get(10);


        // try 에러 발생 가능한 메서드 넣어
        // catch 예외 발생 시 대체 동작
        // 예측 가능한 에러 앞에서 최대한 잡고 마지막 catch 에서 꼭 가장 포괄적인 에러 잡기
        try {
//            arrayList.get(10);
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("IndexOutOfBoundsException 발생");
        } catch (IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException 발생");
        } catch (Exception e) {
//            e.printStackTrace(); // 보안 상 에러메세지 띄우는 건 주의 필요
            System.out.println("Exception 발생");
        } finally {
            System.out.println("finally");
        }
    }
}
