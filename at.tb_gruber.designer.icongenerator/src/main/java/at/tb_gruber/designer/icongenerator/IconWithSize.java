package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class IconWithSize {

	private String iconName;
	private boolean isFernablesung = false;
	private Nap nap = Nap.KEIN;

	public IconWithSize(String iconName) {
		this.iconName = iconName;
	}

	public IconWithSize fa() {
		isFernablesung = true;
		return this;
	}

	public IconWithSize napVor() {
		nap = Nap.VOR;
		return this;
	}

	public IconWithSize napMitte() {
		nap = Nap.MITTE;
		return this;
	}

	public IconWithSize napNach() {
		nap = Nap.NACH;
		return this;
	}

	private String getNameForSize(IconSize size) {
		return iconName + nap.position + "_" + size.size;
	}

	private String getFileNameForColorAndSize(String color, IconSize size) {
		return getSubFolder() + iconName + "_" + color + nap.position + "_" + size.size + (isFernablesung ? "_fa" : "")
				+ ".svg";
	}

	private String getSubFolder() {
		return Icons.OUTPUT_FOLDER + iconName + "/" + nap.subfolder;
	}

	public void createAll() throws IOException {
		File outputFolder = new File(getSubFolder());
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			for (IconSize size : IconSize.values()) {
				String tmpXml = Icons.readTemplateFromFile(getNameForSize(size)).replaceAll(Icons.COLOR,
						String.valueOf(Icons.colors.get(color)));
				String tmpFilePath = getFileNameForColorAndSize(color, size);
				Icons.writeIconToFile(tmpFilePath, tmpXml);
			}
		}
	}

	protected enum IconSize {
		S("s"), M("m"), L("l"), XL("xl"), XXL("xxl"), _3XL("3xl"), _4XL("4xl"), _5XL("5xl"), _6XL("6xl"), _7XL("7xl");

		private String size;

		IconSize(String size) {
			this.size = size;
		}
	}

	enum Nap {
		VOR("_nap_vor", "nap_vor/"), MITTE("_nap_mitte", "nap_mitte/"), NACH("_nap_nach", "nap_nach/"), KEIN("", "");

		private String position;
		private String subfolder;

		Nap(String position, String subfolder) {
			this.position = position;
			this.subfolder = subfolder;
		}
	}
}
