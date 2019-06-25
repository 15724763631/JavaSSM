package cn.edu.zut.ssm.domain;

public class Dome {
    private String tUserName;
    private String tPassword;

    public String gettUserName() {
        return tUserName;
    }

    public void settUserName(String tUserName) {
        this.tUserName = tUserName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    @Override
    public String toString() {
        return "Dome{" +
                "tUserName='" + tUserName + '\'' +
                ", tPassword='" + tPassword + '\'' +
                '}';
    }
}
