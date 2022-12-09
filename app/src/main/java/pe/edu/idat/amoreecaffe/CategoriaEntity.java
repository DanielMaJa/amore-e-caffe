package pe.edu.idat.amoreecaffe;

import android.os.Parcel;
import android.os.Parcelable;

public class CategoriaEntity implements Parcelable {

    private int id;
    private int imagen;

    protected CategoriaEntity(Parcel in) {
        id = in.readInt();
        imagen = in.readInt();
    }

    public static final Creator<CategoriaEntity> CREATOR = new Creator<CategoriaEntity>() {
        @Override
        public CategoriaEntity createFromParcel(Parcel in) {
            return new CategoriaEntity(in);
        }

        @Override
        public CategoriaEntity[] newArray(int size) {
            return new CategoriaEntity[size];
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

    public CategoriaEntity(int id, int imagen) {
        this.id = id;
        this.imagen = imagen;
    }
}
