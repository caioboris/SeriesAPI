package service;

import java.util.List;

import br.com.fiap.seriesapi.data.SerieDao;
import br.com.fiap.seriesapi.model.Serie;

public class SerieService {
	
	private SerieDao dao = new SerieDao();

	public List<Serie> findAll() {
		
		return dao.findAll();
	}
	
	public Serie findById(Long id){
		return dao.findById(id);
	}

}
