package design.iterator;

/*
 * 
 * Exemplo de design pattern de Iterator
 * 
 * exemplo usado do site
 * https://www.digitalocean.com/community/tutorials/iterator-design-pattern-java
 */

//Classe que possui os atributos frequência e tipo de canal.

public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;
	
	public Channel(double freq, ChannelTypeEnum type){
		this.frequency=freq;
		this.TYPE=type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString(){
		return "Frequency="+this.frequency+", Type="+this.TYPE;
	}
	
}
