package tw.com.softleader.e5e5.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tw.com.softleader.e5e5.E5e5App;
import tw.com.softleader.e5e5.entity.Tag;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={E5e5App.class})
public class TagDaoTest {
	private Logger log =Logger.getLogger(this.getClass());
	
	@Autowired
	private TagDao tagDao;
	
	@Test
	public void testCrud() {
		Tag tag = new Tag();
		tag.setName("hahaha");
		tagDao.save(tag);
		tagDao.delete(5);
	}

}
