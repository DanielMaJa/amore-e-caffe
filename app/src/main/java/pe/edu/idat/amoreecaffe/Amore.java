package pe.edu.idat.amoreecaffe;

import android.os.Parcel;
import android.os.Parcelable;

public class Amore implements Parcelable {

    private int id;
    private int imagen;

    protected Amore(Parcel in) {
        id = in.readInt();
        imagen = in.readInt();
    }

    public static final Creator<Amore> CREATOR = new Creator<Amore>() {
        @Override
        public Amore createFromParcel(Parcel in) {
            return new Amore(in);
        }

        @Override
        public Amore[] newArray(int size) {
            return new Amore[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(imagen);
    }

    public Amore(int id, int imagen) {
        this.id = id;
        this.imagen = imagen;
    }
}
