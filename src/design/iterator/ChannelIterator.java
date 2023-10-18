package design.iterator;

/*
 * 
 * Exemplo de design pattern de Iterator
 * 
 * exemplo usado do site
 * https://www.digitalocean.com/community/tutorials/iterator-design-pattern-java
 */



public interface ChannelIterator {
	
	public boolean hasNext();
	
	public Channel next();
	
}
