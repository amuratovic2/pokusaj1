package ba.unsa.etf.rpr;

public class Student {
    private int id, godinaFakulteta;
    private String imePrezime, kanton, grad, fakultet;

    public Student(int id, int godinaFakulteta, String imePrezime, String kanton, String grad, String fakultet) {
        this.id = id;
        this.godinaFakulteta = godinaFakulteta;
        this.imePrezime = imePrezime;
        this.kanton = kanton;
        this.grad = grad;
        this.fakultet = fakultet;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGodinaFakulteta() {
        return godinaFakulteta;
    }

    public void setGodinaFakulteta(int godinaFakulteta) {
        this.godinaFakulteta = godinaFakulteta;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getKanton() {
        return kanton;
    }

    public void setKanton(String kanton) {
        this.kanton = kanton;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }
}
