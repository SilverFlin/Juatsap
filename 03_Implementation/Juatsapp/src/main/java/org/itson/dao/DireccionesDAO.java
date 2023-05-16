package org.itson.dao;

import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Direccion;

/**
 *
 * @author Toled
 */
public class DireccionesDAO extends BaseDAO<Direccion> {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(DireccionesDAO.class.getName());

    @Override
    protected MongoCollection<Direccion> getCollection() {
        return this.getDataBase().getCollection("direcciones", Direccion.class);
    }

    @Override
    public void agregar(Direccion direccion) {
        try {
            MongoCollection<Direccion> coleccion = this.getCollection();
            coleccion.insertOne(direccion);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void actualizar(Direccion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Direccion consultar(String idEntidad) {
        List<Direccion> listaDirecciones = new ArrayList<>();
        MongoCollection<Direccion> coleccion = this.getCollection();
        Document filtro = new Document();
        filtro.append("_id", new ObjectId(idEntidad));
        coleccion.find(filtro).into(listaDirecciones);
        if (listaDirecciones.isEmpty()) {
            return null;
        } else {
            return listaDirecciones.get(0);
        }
    }

    @Override
    public List<Direccion> consultarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
