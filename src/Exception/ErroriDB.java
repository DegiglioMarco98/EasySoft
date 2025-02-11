package Exception;

/**
 * Classe contenente i messaggi di errore relativi al database.<br>
 * Queste stringhe vengono utilizzate come messaggi di errore per
 * lanciare le eccezioni custom della classe AziendaException, le
 * quali avranno come parametro il messaggio di errore relativo al tipo di eccezione.
 * Queste eccezioni potranno essere lanciate dalla classe ProxyDB durante le operazioni
 * di accesso al database, mentre verranno gestite nella classe HomePage o nella classe Client.
 * @author marco
 * @version 1.1
 */
public class ErroriDB {
	public static final String USERNAME_NOT_FOUND = "ERROR: Username non trovato!";
	public static final String INCORRECT_PASSWORD = "ERROR: Password non corretta!";
	public static final String FILETTATURA_NOT_FOUND = "ERROR: Metrica non trovata!";
	public static final String EMPTY_LIST = "ERROR: Tabella vuota!";
	public static final String PERSONA_ALREADY_EXISTS = " ERROR: La persona � gi� stata registrata!";
	public static final String MEDICO_ALREADY_EXISTS = " ERROR: Il medico � gi� stato registrato!";
	public static final String LABANALISI_ALREADY_EXISTS = " ERROR: Il laboratorio analisi � gi� stato registrato!";
	
	public static final String USERNAME_ALREADY_EXISTS = "ERROR: Username gi� esistente!";
	public static final String USERNAME_NOT_ADMIN = "ERROR: Permessi di amministratore richiesti!";
	
}