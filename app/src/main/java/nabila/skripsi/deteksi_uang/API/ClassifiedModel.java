package nabila.skripsi.deteksi_uang.API;

import com.google.gson.annotations.SerializedName;

public class ClassifiedModel {
    @SerializedName("keaslian")
    private String keaslian;
    @SerializedName("nominal")
    private String nominal;
    @SerializedName("kelayakan")
    private String kelayakan;

    public ClassifiedModel(String keaslian, String nominal, String kelayakan) {
        this.keaslian = keaslian;
        this.nominal = nominal;
        this.kelayakan = kelayakan;
    }

    public String getKeaslian() {
        return keaslian;
    }

    public void setKeaslian(String keaslian) {
        this.keaslian = keaslian;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getKelayakan() {
        return kelayakan;
    }

    public void setKelayakan(String kelayakan) {
        this.kelayakan = kelayakan;
    }
}
