package util;
/**
 * 元素封装（手势坐标）可以根据ID NAME 转成appium元素
 * @author chihai
 *
 */
public class AppiumElement {
	private int x;
	private int y;
	private String id;
	private String name;
	private String xPath;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getxPath() {
		return xPath;
	}

	public void setxPath(String xPath) {
		this.xPath = xPath;
	}

	public AppiumElement() {
		super();
	}

	public AppiumElement(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
