package vsafapp.model;

public class ConfigurationApp {

    public int getTime_schedule() {
		return time_schedule;
	}
	public void setTime_schedule(int time_schedule) {
		this.time_schedule = time_schedule;
	}
	public int getTime_duration() {
		return time_duration;
	}
	public void setTime_duration(int time_duration) {
		this.time_duration = time_duration;
	}
	public String getFtp_server() {
		return ftp_server;
	}
	public void setFtp_server(String ftp_server) {
		this.ftp_server = ftp_server;
	}
	public String getFtp_username() {
		return ftp_username;
	}
	public void setFtp_username(String ftp_username) {
		this.ftp_username = ftp_username;
	}
	public String getFtp_password() {
		return ftp_password;
	}
	public void setFtp_password(String ftp_password) {
		this.ftp_password = ftp_password;
	}
	public int getMax_log_size_KB() {
		return max_log_size_KB;
	}
	public void setMax_log_size_KB(int max_log_size_KB) {
		this.max_log_size_KB = max_log_size_KB;
	}
	int time_schedule ;//  5000,
    int time_duration ;// 60000,
    String ftp_server; //"192.168.1.2",
    String ftp_username; //"alessandro",
    String ftp_password; //"admin",
    int max_log_size_KB; // 1000
    
    
    
    
        
        
}
