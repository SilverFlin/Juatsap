package org.itson.dao;

import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Imagen;

/**
 *
 * @author Toled
 */
public class ImagenesDAO extends BaseDAO<Imagen> {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(ImagenesDAO.class.getName());

    @Override
    protected MongoCollection<Imagen> getCollection() {
        return this.getDataBase().getCollection("imagenes", Imagen.class);
    }

    @Override
    public void agregar(Imagen imagen) {
        try {
            MongoCollection<Imagen> coleccion = this.getCollection();
            coleccion.insertOne(imagen);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void actualizar(Imagen entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Imagen consultar(String idEntidad) {
        List<Imagen> listaImagenes = new ArrayList<>();
        MongoCollection<Imagen> coleccion = this.getCollection();
        Document filtro = new Document();
        filtro.append("_id", new ObjectId(idEntidad));
        coleccion.find(filtro).into(listaImagenes);
        if (listaImagenes.isEmpty()) {
            return null;
        } else {
            return listaImagenes.get(0);
        }
    }

    @Override
    public List<Imagen> consultarTodo() {
        List<Imagen> listaImagenes = new ArrayList<>();
        MongoCollection<Imagen> coleccion = this.getCollection();
        coleccion.find().into(listaImagenes);
        return listaImagenes;
    }

}
