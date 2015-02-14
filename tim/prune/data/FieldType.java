package tim.prune.data;

/**
 * Class to represent a type of field,
 * for example coordinate or integer
 */
public class FieldType
{
	private int _id = 0;

	public static final FieldType NONE =  new FieldType(0);
	public static final FieldType INT =   new FieldType(1);
	public static final FieldType BOOL =  new FieldType(2);
	public static final FieldType COORD = new FieldType(3);
	public static final FieldType TIME =  new FieldType(4);


	/**
	 * Private constructor
	 * @param inId identifier
	 */
	private FieldType(int inId)
	{
		_id = inId;
	}
}
