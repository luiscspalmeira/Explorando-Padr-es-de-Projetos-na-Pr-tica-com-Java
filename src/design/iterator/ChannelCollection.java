package design.iterator;


/*
 * 
 * Exemplo de design pattern de Iterator
 * 
 * exemplo usado do site
 * https://www.digitalocean.com/community/tutorials/iterator-design-pattern-java
 */

//Define o contrato para a implementação da classe de coleta

public interface ChannelCollection {
	
public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
	
}
