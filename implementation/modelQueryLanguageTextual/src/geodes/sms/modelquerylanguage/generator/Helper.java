package geodes.sms.modelquerylanguage.generator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class Helper {
	public static void saveResourceAsXmi(Resource resource) {
		try {
			Map<String, String> saveOptions = new HashMap<>();
			Resource xmlResource = new XMIResourceImpl();
			xmlResource.getContents().add(resource.getContents().get(0));
			saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
			String tokens[] = resource.getURI().path().split("/");
			String name = tokens[tokens.length - 1];
			xmlResource.save(new FileOutputStream(
				System.getProperty("user.home")
					+ "/eclipse/epsilon-2-4/workspace/ModelQueryLanguage/models/"
					+ name.substring(0, name.indexOf(".")) + ".xmi"),
				saveOptions);
			System.out.println("XMI file created.");
		} catch (IOException e) {
			System.out.println("Error during the creation of XMI.");
			e.printStackTrace();
		}
	}
}
