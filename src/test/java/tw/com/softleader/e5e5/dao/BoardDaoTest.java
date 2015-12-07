package tw.com.softleader.e5e5.dao;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tw.com.softleader.e5e5.E5e5App;
import tw.com.softleader.e5e5.entity.Board;
import tw.com.softleader.e5e5.entity.BoardCategoria;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={E5e5App.class})
public class BoardDaoTest {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private BoardCategoriaDao boardCategoriaDao;
	
	@Test
	public void testCrud() {
//		Board board = new Board();
//		BoardCategoria  boardCategoria = boardCategoriaDao.findOne(3);
//		board.setName("華夏科技大學");
//		board.setCreatedDate(new Date());
//		board.setBoardCategoria(boardCategoria);
//		board.setDescription("taiwan number one!");
//		boardDao.save(board);
//		
//		Board dbEntity = boardDao.findOne(7);
//		log.debug(dbEntity);
//		
		//刪除，記得自己想好如何設定cascade
//		boardDao.delete(1);
		
		//更新
//		Board board4 = boardDao.findOne(4);
//		board4.setName("test3");
//		boardDao.save(board4);
		
		BoardCategoria  boardCategoria2 = boardCategoriaDao.findOne(3);
		log.debug(boardCategoria2);
		List<Board> boards = boardDao.findByBoardCategoria(boardCategoria2);
//		List<Board> boards = boardDao.findByBoardCategoria(boardCategoria2);
//		
		for(Board b : boards){
			log.debug(b);
		}
	
	}

}