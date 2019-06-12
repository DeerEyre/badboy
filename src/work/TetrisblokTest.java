package work;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TetrisblokTest {
	private static Tetrisblok a=new Tetrisblok();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testNewmap() {
		a.newmap();
		assertEquals(1,a.mark);
		a.clear();
		
	}

	@Test
	public void testBlow() {
		assertEquals(0,a.blow(6, 6, 2, 2));
		a.clear();
	}

	@Test
	public void testGameover() {		
		assertEquals(1,a.gameover(5, 5));
		a.clear();
	}

	public void testNewblock() {
		a.newblock();
		assertEquals(3,a.mark);
		a.clear();
	}

	@Test
	public void testLeft() {
		a.left();
		assertEquals(4,a.mark);
		a.clear();
	}

	@Test
	public void testRight() {
		a.right();
		assertEquals(5,a.mark);
		a.clear();
	}

	@Test
	public void testDelline() {
		a.delline();
		assertEquals(6,a.mark);
		a.clear();
	}

	@Test
	public void testAddIntIntIntInt() {
		a.add(5, 5, 2, 2);
		assertEquals(7,a.mark);
		a.clear();
	}

	@Test
	public void testDown() {
		a.down();
		assertEquals(9,a.mark);
		a.clear();
	}

}
