package appiumTest;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import efund.Action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public class Dom4JDemo extends Action {
	public static void main(String[] args) throws Exception {
		String str = getBoundsFromName("", "基金");
		if (str.length() > 0) {
		String[] poiStrings =str.split("]");
		if(poiStrings[0]!=null) {
			String A[] = poiStrings[0].replace("[", "").replace("]", "").split(",");
		}
		}
	}

	

}
