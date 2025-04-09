package ch2_객체지향.Ex20_객체지향코딩;

public class Ex20_4_3_Student_클래스방식 {
    private String sName;
    private String sNo;
    private String sAge;
    private String sGender;

    public Ex20_4_3_Student_클래스방식() {
        this.sName = "읎음";
        this.sNo = "읎음";
        this.sAge = "0";
        this.sGender = "제 3의성";
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsAge() {
        return sAge;
    }

    public void setsAge(String sAge) {
        this.sAge = sAge;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    void 복습하기() {
        System.out.println("복습하기");
    }
    void 학원오기() {
        System.out.println("9시까지 오기");
    }
    void 지각하기() {
        System.out.println("9시 넘어서 오기");
    }

    @Override
    public String toString() {
        return "[ 학생이름='" + sName + '\'' +
                ", 학번='" + sNo + '\'' +
                ", 나이='" + sAge + '\'' +
                ", sGender='" + sGender + '\'' +
                " ]";
    }
}