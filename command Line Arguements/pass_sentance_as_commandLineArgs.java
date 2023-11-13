class senArgs{

	public static void main(String [] args){
	
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}/*java vaibhav "Pradip Wani"

since the JVM will divide the argument list based on whitespace. The third argument, "olive festival", is not broken into two separate arguments, since it is enclosed with double-quotes.

Note that leading and trailing whitespace characters are removed from the values stored in the args array. Also, for arguments enclosed with double-quotes, note that the double-quotes are removed. 
*/
