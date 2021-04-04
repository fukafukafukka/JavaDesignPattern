package adapter.lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePropertiesInHeritance implements FileIO {
	private final Properties properties;
	private final static String COMMENTS = "written by FileProperties";
	public FilePropertiesInHeritance() {
		this.properties = new Properties();
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		FileInputStream in = null;
		try {
			in = new FileInputStream(filename);
			properties.load(in);
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filename);
			properties.store(out, COMMENTS);
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	@Override
	public void setValue(String key, String value) {
		this.properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return this.properties.getProperty(key, "");
	}

}
