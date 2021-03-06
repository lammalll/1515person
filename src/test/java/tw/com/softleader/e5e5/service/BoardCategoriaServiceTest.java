package tw.com.softleader.e5e5.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tw.com.softleader.e5e5.E5e5App;
import tw.com.softleader.e5e5.entity.BoardCategoria;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { E5e5App.class })
public class BoardCategoriaServiceTest {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private BoardCategoriaService boardCategoriaService;
	@Test
	public void testGetAll(){
		List<BoardCategoria> boardCategorias = boardCategoriaService.getAll();
		for(BoardCategoria b : boardCategorias) {
			log.debug("Test:"+ b );
		}
	}
}
