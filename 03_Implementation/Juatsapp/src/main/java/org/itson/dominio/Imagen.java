package org.itson.dominio;

import java.util.Objects;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author Toled
 */
public class Imagen {

    private ObjectId id;
    private String fileName;
    private Binary imageData;
    private int width;
    private int height;

    public Imagen() {
    }

    public Imagen(ObjectId _id, String fileName, Binary imageData, int width, int height) {
        this.id = _id;
        this.fileName = fileName;
        this.imageData = imageData;
        this.width = width;
        this.height = height;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Binary getImageData() {
        return imageData;
    }

    public void setImageData(Binary imageData) {
        this.imageData = imageData;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Imagen other = (Imagen) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Image{" + "fileName=" + fileName + '}';
    }

}
