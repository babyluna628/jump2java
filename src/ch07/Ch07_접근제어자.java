package ch07;

class Sample {
    private String secret;
    private String getString(){
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }
}

public class Ch07_접근제어자 {
    private String password;

    public static void main(String[] args) {
        /*접근 제어자 : 변수나 메서드에 사용권한을 설정*/
        /*private < default < protected < public 순으로 많은 접근허용*/
        Ch07_접근제어자 ch = new Ch07_접근제어자();
        ch.password = "1234";
        /*private는 같은 클래스에서만 접근 가능*/
        Sample sample = new Sample();
        // sample.secret = "비밀";
        //sample.getSecret();
        sample.setSecret("비밀");
        ;
        System.out.println();
    }
}
