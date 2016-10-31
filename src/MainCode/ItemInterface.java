package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public interface ItemInterface {

	public default Item createItem() {
		return this.createItem();
		
	}
}
