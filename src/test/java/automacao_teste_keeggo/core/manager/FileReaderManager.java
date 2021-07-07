package automacao_teste_keeggo.core.manager;

import automacao_teste_keeggo.core.dataProvider.ConfigFileReader;
import automacao_teste_keeggo.core.dataProvider.JsonDataReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager;
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jSonDataReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return (fileReaderManager == null) ? new FileReaderManager() : fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

	public JsonDataReader getJsonReader() {
		return (jSonDataReader == null) ? new JsonDataReader() : jSonDataReader;
	}
}
