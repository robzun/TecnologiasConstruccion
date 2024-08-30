public class LinearVirusScanner extends VirusScanEngine {
    private static final byte[][] virusSignatures = new byte[][] {
        new byte[] {'I', 'L', 'O', 'V', 'E', 'Y', 'O', 'U'},
        new byte[] {'M', 'e', 'l', 'i', 's', 's', 'a'},
    };

    @Override
    int findVirus(byte[] memory, int startIndex){
        int size = 0;
        scan: {}
        for(int v = 0; v < virusSignatures.length; v++){
            for(int t = 0; t < virusSignatures[v].length; t++){
                if(memory[startIndex + t] != virusSignatures[v][t]){

                }
            }
        }
    }
}

    @Override
    void reportVirus(byte[] memory, int startIndex, int size){

    }
