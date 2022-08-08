package projeler;

public class YolcuBilgileri {



    private String rota;
    private String yolculukTipi;
    private int yas;



    public YolcuBilgileri(String rota, String yolculukTipi, int yas) {
        this.rota = rota;
        this.yolculukTipi = yolculukTipi;
        this.yas = yas;
    }

    public YolcuBilgileri(){

    }

    public String getRota() {
        return rota;
    }

    public int getYas() {
        return yas;
    }

    public String getYolculukTipi() {
        return yolculukTipi;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public void setYolculukTipi(String yolculukTipi) {
        this.yolculukTipi = yolculukTipi;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void ucus(){
        this.rota = rota;
        this.yolculukTipi = yolculukTipi;
        this.yas = yas;
    }
}
