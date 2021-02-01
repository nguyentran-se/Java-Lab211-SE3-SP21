package P0056;

public class SalaryHistory extends Worker implements Comparable<SalaryHistory> {

    private String status;
    private String date;

    public SalaryHistory() {
    }

    public SalaryHistory(String status, String date) {
        this.status = status;
        this.date = date;
    }

    public SalaryHistory(String code, String name, int age, double salary, String workLocation, String status, String date) {
        super(code, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalaryHistory{" + "status=" + status + ", date=" + date + '}';
    }

    @Override
    public int compareTo(SalaryHistory his) {
        return this.getCode().compareTo(his.getCode());
    }
}
