package ch2_객체지향.Ex35_예외처리;

/*
    예외(Exception)

    - 프로그램 오류는 세종류가 있다
        1) 컴파일 에러 - 컴파일시 발생하는 에러
        2) 런타임 에러 - 컴파일이 끝나고 실행하려고 하는 순간에 발생하는 에러
        3) 논리적 에러 - 실행은 되지만 의도와 다른 결과가 나오는 에러
    
    - 예외처리 하는 이유
        에러가 나면 프로그램이 바로 종료된다. 그런데 예외처리를 하면 비정상적인 종료를 막을수 있다.
        
    - 대표적인 예외 종류(에러 아니고 예외)
        * Exception - 모든 예외의 최고 조상. 이거 걸면 모든 예외가 다 커버됨
        
        1) 사용자의 실수나 외적인 요인 때문에 발생(개발자 잘못은 아님)
            IOException - 인풋 아웃풋 관련 예외
            ClassNotFoundException - 클래스가 존재하지 않는 경우

        2) 개발자가 코드 잘못짠 경우
            RuntimeException - 프로그래머가 잘못짠거
            ClassCastException - 형변환 잘못한 경우
            NullPointException - null 인 값에 length 거는 경우
            IndexOutOfBoundsException - 배열 범위 벗어남
    
    - 예외 처리 방법
        1) try catch문
            try {
                실행 되야 하는 코드
            }
            catch(예외) {
                Exception이 발생한 경우 동작할 코드
            }
            catch(예외) {
                Exception이 발생한 경우 동작할 코드
            }

        2) try catch finally문

            try {
                실행 되야 하는 코드
            }
            catch(예외) {
                Exception이 발생한 경우 동작할 코드
                (if 문으로 따지면 else if 같은거)
            }
            finally {
                try 던 catch 던 뭐든 끝난 이후에 실행할 코드
                (if 문으로 따지면 else 같은거)
            }
        
 */
public class Ex35_1_예외처리 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);

//            throw new Exception();

            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        }
        System.out.println(5);

        System.out.println("=================");

        System.out.println(1);

        try {
            System.out.println(args[0]); // ArrayIndexOutOfBoundsException
            System.out.println(10 / 0); // 수학적 에러
            System.out.println(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 예외");
        } catch (ArithmeticException e) {
            System.out.println("수학적 예외");
        } catch (Exception e) {
            System.out.println("모름. 일단 모든 예외");
        }  finally {
            System.out.println(5);
        }
        System.out.println(6);




    }
}















