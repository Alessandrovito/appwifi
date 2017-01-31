package vsafapp.model;

import java.util.List;

public class Wlan {

  String wlanid;
  public String getWlanid() {
	return wlanid;
}

public void setWlanid(String wlanid) {
	this.wlanid = wlanid;
}

public String getChannels() {
	return channels;
}

public void setChannels(String channels) {
	this.channels = channels;
}

public String getBand() {
	return band;
}

public void setBand(String band) {
	this.band = band;
}

public String getActive() {
	return active;
}

public void setActive(String active) {
	this.active = active;
}

public String getLine_idx() {
	return line_idx;
}

public void setLine_idx(String line_idx) {
	this.line_idx = line_idx;
}

public String getProfile_idx() {
	return profile_idx;
}

public void setProfile_idx(String profile_idx) {
	this.profile_idx = profile_idx;
}

public List<ChanStats> getChanStats() {
	return chanStats;
}

public void setChanStats(List<ChanStats> chanStats) {
	this.chanStats = chanStats;
}

String channels;
  String band;
  String active;
  String line_idx;
  String profile_idx;
  
  List<ChanStats> chanStats;
  
	  

}
