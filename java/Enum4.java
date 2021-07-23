package com.ust.examples;

public class Enum4 {
enum WhoisRIR{
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	UNKNOWN("");
	private  String url;
	WhoisRIR(String url){
		this.url = url;
	}
	public String url() {
		return url;
	}
}



	public static void main(String[] args) {
		

	}

}
