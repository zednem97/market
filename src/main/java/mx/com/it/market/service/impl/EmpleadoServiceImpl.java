package mx.com.it.market.service.impl;

import java.util.List;
import mx.com.it.market.dao.EmpleadoDAO;
import mx.com.it.market.modelo.Empleado;
import mx.com.it.market.service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService{
    
    private EmpleadoDAO empleadoDAO;
    
    public EmpleadoServiceImpl(){
        this.empleadoDAO = new EmpleadoDAO();
    }
    
    @Override
    public List<Empleado> listarPersonas() {
    return this.listarPersonas();
    }
    
    
    
    
}
