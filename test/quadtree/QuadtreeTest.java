package quadtree;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuadtreeTest {



	@Test
	public void getNbPMax()
	{
		//Arrange
		int nbPointMax;
		Quadtree quad = new Quadtree();
		
		//Act
		nbPointMax = quad.getNbPointMax();
		
		//Assert
		assertEquals(new Long(4), new Long(nbPointMax));
		
	}
	
	@Test
	public void createQuadtreeWithGoodSizeForXAnDY()
	{
		Quadtree quadParent = new Quadtree();
		Quadtree quadchild = new Quadtree();
		
		quadParent.subdividion();
		quadchild = quadParent.getNordeEst();
		
		assertEquals(new Long((long) (quadParent.getQuadtreeTailleX()/2)), new Long ((long) quadchild.getQuadtreeTailleX()));
		assertEquals(new Long((long) (quadParent.getQuadtreeTailleY()/2)), new Long ((long) quadchild.getQuadtreeTailleY()));
	}
	
	@Test
	public void checkIfthePointisOnTheLine()
	{
		boolean isOnLine = false;
		boolean isOnLine1 = false;
		boolean isOnLine2 = false;
		boolean isOnLine3 = false;
		boolean isOnLine4 = false;
		
		Quadtree quad = new Quadtree();
		Point p = new Point((int)quad.getQuadtreeTailleX(), 50);
		Point p1 = new Point(0, 20);
		Point p2 = new Point(20, 0);
		Point p3 = new Point(20, (int)quad.getQuadtreeTailleY());
		Point p4 = new Point(10, 10);
		
		isOnLine = quad.estSurLaLigne(p);
		isOnLine1 = quad.estSurLaLigne(p1);
		isOnLine2 = quad.estSurLaLigne(p2);
		isOnLine3 = quad.estSurLaLigne(p3);
		isOnLine4 = quad.estSurLaLigne(p4);
		
		assertTrue(isOnLine);
		assertTrue(isOnLine1);
		assertTrue(isOnLine2);
		assertTrue(isOnLine3);
		assertFalse(isOnLine4);
		
	}

}
