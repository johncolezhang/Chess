import java.util.*;

public class Chess {}

class Chessman{
	private String label;
	private int x;
	private int y;
	
	public Chessman(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public ChessmanMemento save(){
		return new ChessmanMemento(label,x,y);
	}
	
	public void restore(ChessmanMemento memento){
		label = memento.getLabel();
		x = memento.getX();
		y = memento.getY();
	}
}

class ChessmanMemento{
	private String label;
	private int x;
	private int y;
	
	public ChessmanMemento(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class MementoCaretaker{
	private List mementolist = new ArrayList();
	
	public ChessmanMemento getMemento(int i){
		return (ChessmanMemento)mementolist.get(i);
	}
	
	public void setMemento(ChessmanMemento memento){
		mementolist.add(memento);
	}
}