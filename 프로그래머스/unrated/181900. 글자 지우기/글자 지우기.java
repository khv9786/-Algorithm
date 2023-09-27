class Solution {
    public String solution( String my_string, int[] indices ) {
        StringBuilder sb = new StringBuilder( );

        for ( int i = 0; i < my_string.length( ); i++ ) {
            boolean chk = false; 
            for ( int index : indices ) {
                if ( i == index ) {
                    chk = true;
                    break;
                }
            }
            if ( !chk )
                sb.append( my_string.charAt( i ) );
        }
        return sb.toString( );
    }
}